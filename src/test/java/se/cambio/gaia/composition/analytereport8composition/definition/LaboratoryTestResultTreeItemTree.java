package se.cambio.gaia.composition.analytereport8composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-02-04T09:34:06.739562+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.6.0"
)
public class LaboratoryTestResultTreeItemTree implements LocatableEntity {
  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Test name
   * Description: Name of the laboratory investigation performed on the specimen(s).
   * Comment: A test result may be for a single analyte, or a group of items, including panel tests. It is strongly recommended that 'Test name' be coded with a terminology, for example LOINC or SNOMED CT. For example: 'Glucose', 'Urea and Electrolytes', 'Swab', 'Cortisol (am)', 'Potassium in perspiration' or 'Melanoma histopathology'. The name may sometimes include specimen type and patient state, for example 'Fasting blood glucose' or include other information, as 'Potassium (PNA blood gas)'.
   */
  @Path("/items[at0005]/value|value")
  private String testNameValue;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Tree/Test name/null_flavour
   */
  @Path("/items[at0005]/null_flavour|defining_code")
  private NullFlavour testNameNullFlavourDefiningCode;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Specimen detail
   * Description: Details about the physical substance that has been analysed.
   * Comment: If the specimen type is sufficiently specified with a code in the Test name, then this additional data is not required. Linking results to specific specimens may be recorded using 'Specimen identifier' elements in both the CLUSTER.specimen and the various results CLUSTER archetypes.
   */
  @Path("/items[at0065]")
  private List<Cluster> specimenDetail;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Overall test status
   * Description: The status of the laboratory test result as a whole.
   * Comment: The values have been specifically chosen to match those in the HL7 FHIR Diagnostic report, historically derived from HL7v2 practice. Other local codes/terms can be used via the Text 'choice'.
   *
   * This element is multiple occurrence to cater for the use cases where statuses for different aspects of the result have been split into several elements.
   */
  @Path("/items[at0073]")
  private List<LaboratoryTestResultOverallTestStatusElement> overallTestStatus;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Overall test status timestamp
   * Description: The date and/or time that ‘Overall test status’ was issued.
   */
  @Path("/items[at0075]/value|value")
  private TemporalAccessor overallTestStatusTimestampValue;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Tree/Overall test status timestamp/null_flavour
   */
  @Path("/items[at0075]/null_flavour|defining_code")
  private NullFlavour overallTestStatusTimestampNullFlavourDefiningCode;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Laboratory analyte result
   * Description: The result of a laboratory test for a single analyte value.
   */
  @Path("/items[openEHR-EHR-CLUSTER.laboratory_test_analyte.v1]")
  private List<LaboratoryAnalyteResultCluster> laboratoryAnalyteResult;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Conclusion
   * Description: Narrative description of the key findings.
   * Comment: For example: 'Pattern suggests significant renal impairment'. The content of the conclusion will vary, depending on the investigation performed. This conclusion should be aligned with the coded 'Test diagnosis'.
   */
  @Path("/items[at0057]/value|value")
  private String conclusionValue;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Tree/Conclusion/null_flavour
   */
  @Path("/items[at0057]/null_flavour|defining_code")
  private NullFlavour conclusionNullFlavourDefiningCode;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Structured test diagnosis
   * Description: A structured or complex diagnosis for the laboratory test.
   * Comment: For example: Anatomical pathology diagnoses consisting of several different axes such as morphology, etiology and function.
   */
  @Path("/items[at0122]")
  private List<Cluster> structuredTestDiagnosis;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Multimedia representation
   * Description: Digital image, video or diagram representing the test result.
   * Comment: Multiple formats are allowed but they should represent equivalent clinical content.
   */
  @Path("/items[at0118]")
  private List<Cluster> multimediaRepresentation;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Comment
   * Description: Additional narrative about the test result not captured in other fields.
   */
  @Path("/items[at0101]")
  private List<LaboratoryTestResultCommentElement> comment;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setTestNameValue(String testNameValue) {
     this.testNameValue = testNameValue;
  }

  public String getTestNameValue() {
     return this.testNameValue ;
  }

  public void setTestNameNullFlavourDefiningCode(NullFlavour testNameNullFlavourDefiningCode) {
     this.testNameNullFlavourDefiningCode = testNameNullFlavourDefiningCode;
  }

  public NullFlavour getTestNameNullFlavourDefiningCode() {
     return this.testNameNullFlavourDefiningCode ;
  }

  public void setSpecimenDetail(List<Cluster> specimenDetail) {
     this.specimenDetail = specimenDetail;
  }

  public List<Cluster> getSpecimenDetail() {
     return this.specimenDetail ;
  }

  public void setOverallTestStatus(
      List<LaboratoryTestResultOverallTestStatusElement> overallTestStatus) {
     this.overallTestStatus = overallTestStatus;
  }

  public List<LaboratoryTestResultOverallTestStatusElement> getOverallTestStatus() {
     return this.overallTestStatus ;
  }

  public void setOverallTestStatusTimestampValue(TemporalAccessor overallTestStatusTimestampValue) {
     this.overallTestStatusTimestampValue = overallTestStatusTimestampValue;
  }

  public TemporalAccessor getOverallTestStatusTimestampValue() {
     return this.overallTestStatusTimestampValue ;
  }

  public void setOverallTestStatusTimestampNullFlavourDefiningCode(
      NullFlavour overallTestStatusTimestampNullFlavourDefiningCode) {
     this.overallTestStatusTimestampNullFlavourDefiningCode = overallTestStatusTimestampNullFlavourDefiningCode;
  }

  public NullFlavour getOverallTestStatusTimestampNullFlavourDefiningCode() {
     return this.overallTestStatusTimestampNullFlavourDefiningCode ;
  }

  public void setLaboratoryAnalyteResult(
      List<LaboratoryAnalyteResultCluster> laboratoryAnalyteResult) {
     this.laboratoryAnalyteResult = laboratoryAnalyteResult;
  }

  public List<LaboratoryAnalyteResultCluster> getLaboratoryAnalyteResult() {
     return this.laboratoryAnalyteResult ;
  }

  public void setConclusionValue(String conclusionValue) {
     this.conclusionValue = conclusionValue;
  }

  public String getConclusionValue() {
     return this.conclusionValue ;
  }

  public void setConclusionNullFlavourDefiningCode(NullFlavour conclusionNullFlavourDefiningCode) {
     this.conclusionNullFlavourDefiningCode = conclusionNullFlavourDefiningCode;
  }

  public NullFlavour getConclusionNullFlavourDefiningCode() {
     return this.conclusionNullFlavourDefiningCode ;
  }

  public void setStructuredTestDiagnosis(List<Cluster> structuredTestDiagnosis) {
     this.structuredTestDiagnosis = structuredTestDiagnosis;
  }

  public List<Cluster> getStructuredTestDiagnosis() {
     return this.structuredTestDiagnosis ;
  }

  public void setMultimediaRepresentation(List<Cluster> multimediaRepresentation) {
     this.multimediaRepresentation = multimediaRepresentation;
  }

  public List<Cluster> getMultimediaRepresentation() {
     return this.multimediaRepresentation ;
  }

  public void setComment(List<LaboratoryTestResultCommentElement> comment) {
     this.comment = comment;
  }

  public List<LaboratoryTestResultCommentElement> getComment() {
     return this.comment ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
