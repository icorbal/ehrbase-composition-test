package se.cambio.gaia.composition;

import com.squareup.javapoet.JavaFile;
import static java.lang.String.format;
import org.ehrbase.client.classgenerator.ClassGenerator;
import org.ehrbase.client.classgenerator.ClassGeneratorConfig;
import org.ehrbase.client.classgenerator.ClassGeneratorResult;
import org.ehrbase.client.classgenerator.FieldGenerator;
import org.ehrbase.webtemplate.model.WebTemplate;
import org.ehrbase.webtemplate.parser.OPTParser;
import org.junit.Test;
import org.openehr.schemas.v1.OPERATIONALTEMPLATE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.cambio.gaia.composition.support.TestTemplateProvider;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class ClassGenerationTest {

    public static final String GENERATED_CLASS_PATH = "generated-classes";
    public static final String PACKAGE_NAME = "se.cambio.gaia.composition";
    public static final String TEMPLATE_NAME = "Analyte_Report_8";

    Logger logger = LoggerFactory.getLogger(ClassGenerationTest.class);

    @Test
    public void shouldGenerateClassesFromOpt() throws IOException {
        TestTemplateProvider testTemplateProvider = new TestTemplateProvider();
        OPERATIONALTEMPLATE template =
                testTemplateProvider.find(TEMPLATE_NAME).get();
        generateOptClasses(template);
    }

    private void generateOptClasses(OPERATIONALTEMPLATE template) throws IOException {
        WebTemplate webTemplate = new OPTParser(template).parse();
        ClassGeneratorConfig config = new ClassGeneratorConfig();
        config.setAddNullFlavor(true);
        ClassGenerator cut = new ClassGenerator(config);
        ClassGeneratorResult generate = cut.generate(PACKAGE_NAME, webTemplate);
        writeFiles(generate);
    }

    private void writeFiles(ClassGeneratorResult generate) throws IOException {
        Path path = Path.of(GENERATED_CLASS_PATH);
        logger.info(format("Writing generated classes to: %s ", path.toUri()));
        List<JavaFile> generateFiles = generate.writeFiles(path);
        FieldGenerator fieldGenerator = new FieldGenerator();
        fieldGenerator.generate(generateFiles).writeFiles(path);
    }
}
