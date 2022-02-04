package se.cambio.gaia.composition;

import com.nedap.archie.rm.composition.Composition;
import org.apache.commons.io.IOUtils;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;
import org.ehrbase.client.flattener.Unflattener;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import se.cambio.gaia.cdr.composition.mapper.ArchieObjectMapperFactory;
import se.cambio.gaia.composition.analytereport8composition.AnalyteReport8Composition;
import se.cambio.gaia.composition.analytereport8composition.definition.*;
import se.cambio.gaia.composition.support.TestTemplateProvider;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SerializationTest.TestConfig.class)
public class SerializationTest {

    @Value("composition/analyte.json")
    Resource analyteCompositionResource;

    @Test
    public void shouldSerializeComposition() throws IOException {
        AnalyteReport8Composition analyteComposition = createAnalyteComposition();
        Unflattener unflattener = new Unflattener(new TestTemplateProvider());
        Composition composition = (Composition) unflattener.unflatten(analyteComposition);
        String serializedComposition =
                ArchieObjectMapperFactory.getArchieObjectMapper()
                        .writeValueAsString(composition);
        String testComposition = IOUtils.toString(
                analyteCompositionResource.getInputStream(), StandardCharsets.UTF_8);
        assertThat(serializedComposition, equalTo(testComposition));
    }

    public static AnalyteReport8Composition createAnalyteComposition() {
        AnalyteReport8Composition analyteComposition = new AnalyteReport8Composition();
        analyteComposition.setTerritory(Territory.SE);
        analyteComposition.setLanguage(Language.EN);
        ZonedDateTime currentTime =
                ZonedDateTime.parse("2022-02-04T11:52:49.454272+01:00");
        analyteComposition.setStartTimeValue(currentTime);
        Setting setting = Setting.PRIMARY_MEDICAL_CARE;
        analyteComposition.setSettingDefiningCode(setting);
        LaboratoryTestResultAnyEventPointEvent event = new LaboratoryTestResultAnyEventPointEvent();
        event.setTimeValue(currentTime);
        LaboratoryTestResultObservation observation = new LaboratoryTestResultObservation();
        analyteComposition.setLaboratoryTestResult(observation);
        observation.setOriginValue(currentTime);
        List<LaboratoryTestResultAnyEventChoice> events = new ArrayList<>();
        observation.setAnyEvent(events);
        observation.setLanguage(Language.EN);
        events.add(event);
        LaboratoryTestResultTreeItemTree item = new LaboratoryTestResultTreeItemTree();
        List<LaboratoryTestResultTreeItemTree> items = new ArrayList<>();
        items.add(item);
        event.setTree(items);
        LaboratoryAnalyteResultCluster cluster = new LaboratoryAnalyteResultCluster();
        List<LaboratoryAnalyteResultCluster> clusters = new ArrayList<>();
        item.setLaboratoryAnalyteResult(clusters);
        clusters.add(cluster);
        cluster.setAnalyteNameValue("Test Analyte");
        cluster.setAnalyteResultMagnitude(23.12);
        cluster.setAnalyteResultUnits("mg");
        return analyteComposition;
    }

    @Configuration
    static class TestConfig {

    }
}
