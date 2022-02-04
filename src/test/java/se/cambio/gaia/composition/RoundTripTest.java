package se.cambio.gaia.composition;

import com.nedap.archie.rm.composition.Composition;
import org.ehrbase.client.flattener.Flattener;
import org.ehrbase.client.flattener.Unflattener;
import org.ehrbase.serialisation.jsonencoding.CanonicalJson;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import se.cambio.gaia.composition.analytereport8composition.AnalyteReport8Composition;
import se.cambio.gaia.composition.support.TestJsonCompositionProvider;
import se.cambio.gaia.composition.support.TestTemplateProvider;

import java.io.IOException;

public class RoundTripTest {

    @Test
    public void shouldAllowRoundTrip() throws IOException {
        TestJsonCompositionProvider compositionProvider = new TestJsonCompositionProvider();
        TestTemplateProvider templateProvider = new TestTemplateProvider();
        CanonicalJson cut = new CanonicalJson();

        String originalComposition = compositionProvider.find("analyte");

        // Deserialization
        Flattener flattener = new Flattener(templateProvider);
        Composition composition = cut.unmarshal(originalComposition);
        AnalyteReport8Composition analyteComposition =
                flattener.flatten(composition, AnalyteReport8Composition.class);

        // Serialization
        Unflattener unflattener = new Unflattener(templateProvider);
        composition = (Composition) unflattener.unflatten(analyteComposition);
        String serializedComposition = cut.marshal(composition);

        assertThat(serializedComposition, equalTo(originalComposition));
    }
}
