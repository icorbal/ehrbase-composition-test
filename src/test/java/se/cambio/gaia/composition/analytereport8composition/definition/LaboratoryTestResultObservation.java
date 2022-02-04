package se.cambio.gaia.composition.analytereport8composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-OBSERVATION.laboratory_test_result.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-02-04T09:34:06.692997+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.6.0"
)
public class LaboratoryTestResultObservation implements EntryEntity {
  /**
   * Path: Analyte_Report_8/Laboratory test result/origin
   */
  @Path("/data[at0001]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Receiving laboratory
   * Description: Details of the laboratory which received the request and has overall responsibility to manage reporting of the test, even if other labs perform specific aspects.
   * Comment: This slot is intended to carry details of the laboratory which received the request and has overall responsibility to manage reporting of the test, even if other labs perform specific aspects.
   *
   * The receiving laboratory may either perform the test or refer it to another laboratory. Where a different laboratory is responsible for performing the testing on specific analytes, it would be expected that these details would be carried in the 'Analyte result detail' SLOT within the CLUSTER.laboratory_test_analyte archetype.
   *
   */
  @Path("/protocol[at0004]/items[at0017]")
  private Cluster receivingLaboratory;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Test request details
   * Description: Details about the test request.
   * Comment: In most situations there is one test request and a single corresponding test result, however this repeating cluster allows for the situation where there may be multiple test requests reported using a single test result.
   *
   * As an example: 'a clinician asks for blood glucose in one request and Urea/electrolytes in a second request, but the lab analyser does both and the lab wishes to report these together'.
   */
  @Path("/protocol[at0004]/items[at0094]")
  private List<LaboratoryTestResultTestRequestDetailsCluster> testRequestDetails;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Test method
   * Description: Description about the method used to perform the test.
   * Comment: Coding with a terminology is desirable, where possible.
   */
  @Path("/protocol[at0004]/items[at0121]/value|value")
  private String testMethodValue;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Tree/Test method/null_flavour
   */
  @Path("/protocol[at0004]/items[at0121]/null_flavour|defining_code")
  private NullFlavour testMethodNullFlavourDefiningCode;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Testing details
   * Description: Structured details about the method of analysis, device or interpretation used.
   * Comment: For example: 'details of ELISA/nephelometry'.
   */
  @Path("/protocol[at0004]/items[at0110]")
  private List<Cluster> testingDetails;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0004]/items[at0117]")
  private List<Cluster> extension;

  /**
   * Path: Analyte_Report_8/Laboratory test result/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Analyte_Report_8/Laboratory test result/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Analyte_Report_8/Laboratory test result/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event
   * Description: Default, unspecified point in time or interval event which may be explicitly defined in a template or at run-time.
   */
  @Path("/data[at0001]/events[at0002]")
  @Choice
  private List<LaboratoryTestResultAnyEventChoice> anyEvent;

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
  }

  public void setReceivingLaboratory(Cluster receivingLaboratory) {
     this.receivingLaboratory = receivingLaboratory;
  }

  public Cluster getReceivingLaboratory() {
     return this.receivingLaboratory ;
  }

  public void setTestRequestDetails(
      List<LaboratoryTestResultTestRequestDetailsCluster> testRequestDetails) {
     this.testRequestDetails = testRequestDetails;
  }

  public List<LaboratoryTestResultTestRequestDetailsCluster> getTestRequestDetails() {
     return this.testRequestDetails ;
  }

  public void setTestMethodValue(String testMethodValue) {
     this.testMethodValue = testMethodValue;
  }

  public String getTestMethodValue() {
     return this.testMethodValue ;
  }

  public void setTestMethodNullFlavourDefiningCode(NullFlavour testMethodNullFlavourDefiningCode) {
     this.testMethodNullFlavourDefiningCode = testMethodNullFlavourDefiningCode;
  }

  public NullFlavour getTestMethodNullFlavourDefiningCode() {
     return this.testMethodNullFlavourDefiningCode ;
  }

  public void setTestingDetails(List<Cluster> testingDetails) {
     this.testingDetails = testingDetails;
  }

  public List<Cluster> getTestingDetails() {
     return this.testingDetails ;
  }

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setAnyEvent(List<LaboratoryTestResultAnyEventChoice> anyEvent) {
     this.anyEvent = anyEvent;
  }

  public List<LaboratoryTestResultAnyEventChoice> getAnyEvent() {
     return this.anyEvent ;
  }
}
