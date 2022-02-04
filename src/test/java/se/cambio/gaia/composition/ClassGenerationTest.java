package se.cambio.gaia.composition;

import com.squareup.javapoet.JavaFile;
import org.apache.xmlbeans.XmlException;
import org.ehrbase.client.classgenerator.ClassGenerator;
import org.ehrbase.client.classgenerator.ClassGeneratorConfig;
import org.ehrbase.client.classgenerator.ClassGeneratorResult;
import org.ehrbase.client.classgenerator.FieldGenerator;
import org.ehrbase.webtemplate.model.WebTemplate;
import org.ehrbase.webtemplate.parser.OPTParser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openehr.schemas.v1.OPERATIONALTEMPLATE;
import org.openehr.schemas.v1.TemplateDocument;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ClassGenerationTest.TestConfig.class)
public class ClassGenerationTest {

    @Value("opt/Analyte_Report_8.opt")
    Resource analyteReportOpt;

    public static final String GENERATED_CLASS_PATH = "generated-classes";
    public static final String PACKAGE_NAME = "se.cambio.gaia.composition";

    @Test
    public void shouldGenerateClassesFromOpt() throws IOException, XmlException {
        OPERATIONALTEMPLATE template =
                TemplateDocument.Factory.parse(
                                analyteReportOpt.getInputStream())
                        .getTemplate();
        WebTemplate webTemplate = new OPTParser(template).parse();
        ClassGeneratorConfig config = new ClassGeneratorConfig();
        config.setAddNullFlavor(true);
        ClassGenerator cut = new ClassGenerator(config);
        ClassGeneratorResult generate = cut.generate(PACKAGE_NAME, webTemplate);
        writeFiles(generate);
    }

    private void writeFiles(ClassGeneratorResult generate) throws IOException {
        Path path = Path.of(GENERATED_CLASS_PATH);
        System.out.println("Writing generated classes to: " + path.toUri());
        List<JavaFile> generateFiles = generate.writeFiles(path);
        FieldGenerator fieldGenerator = new FieldGenerator();
        fieldGenerator.generate(generateFiles).writeFiles(path);
    }

    @Configuration
    static class TestConfig {

    }
}
