package se.cambio.gaia.composition.support;

import static java.lang.String.format;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class TestJsonCompositionProvider {
    public String find(String compositionName) throws IOException {
        return IOUtils.toString(
                Objects.requireNonNull(getClass().getClassLoader()
                        .getResourceAsStream(format("composition/%s.json", compositionName))),
                StandardCharsets.UTF_8
        );
    }
}
