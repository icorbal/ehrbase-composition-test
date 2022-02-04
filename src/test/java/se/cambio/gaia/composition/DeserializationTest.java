package se.cambio.gaia.composition;

import com.nedap.archie.rm.composition.Composition;
import org.ehrbase.client.flattener.Flattener;
import org.ehrbase.serialisation.jsonencoding.CanonicalJson;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import se.cambio.gaia.composition.analytereport8composition.AnalyteReport8Composition;
import se.cambio.gaia.composition.support.TestJsonCompositionProvider;
import se.cambio.gaia.composition.support.TestTemplateProvider;

import java.io.IOException;

public class DeserializationTest {

    @Test
    public void shouldDeserializeComposition() throws IOException {
        TestJsonCompositionProvider compositionProvider = new TestJsonCompositionProvider();
        Flattener flattener = new Flattener(new TestTemplateProvider());
        CanonicalJson cut = new CanonicalJson();
        String originalComposition = compositionProvider.find("analyte");

        Composition composition = cut.unmarshal(originalComposition);
        AnalyteReport8Composition analyteComposition =
                flattener.flatten(composition, AnalyteReport8Composition.class);
        Double value = analyteComposition.getLaboratoryTestResult().getAnyEvent().get(0)
                .getTree().get(0).getLaboratoryAnalyteResult().get(0)
                .getAnalyteResultMagnitude();
        assertThat(value, equalTo(23.12));
    }
}
