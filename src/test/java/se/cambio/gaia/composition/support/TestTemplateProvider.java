package se.cambio.gaia.composition.support;

import static java.lang.String.format;
import org.apache.xmlbeans.XmlException;
import org.ehrbase.webtemplate.templateprovider.TemplateProvider;
import org.openehr.schemas.v1.OPERATIONALTEMPLATE;
import org.openehr.schemas.v1.TemplateDocument;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

public class TestTemplateProvider implements TemplateProvider {
    @Override
    public Optional<OPERATIONALTEMPLATE> find(String templateId) {
        InputStream is =
                getClass().getClassLoader()
                .getResourceAsStream(format("opt/%s.opt", templateId));
        try {
            return Optional.of(TemplateDocument.Factory.parse(is).getTemplate());
        } catch (XmlException | IOException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
