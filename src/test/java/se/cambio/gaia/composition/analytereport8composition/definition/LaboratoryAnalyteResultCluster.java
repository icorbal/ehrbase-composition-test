package se.cambio.gaia.composition.analytereport8composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-CLUSTER.laboratory_test_analyte.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-02-04T09:34:06.770581+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.6.0"
)
public class LaboratoryAnalyteResultCluster implements LocatableEntity {
  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Laboratory analyte result/Analyte result sequence
   * Description: The intended position of this analyte result within the overall sequence of analyte results.
   * Comment: For example: '1' '2', '3'. Where multiple analyte results are reported, the 'Analyte result sequence' makes the order in which they were reported explicit.
   */
  @Path("/items[at0027]/value|magnitude")
  private Long analyteResultSequenceMagnitude;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Tree/Laboratory analyte result/Analyte result sequence/null_flavour
   */
  @Path("/items[at0027]/null_flavour|defining_code")
  private NullFlavour analyteResultSequenceNullFlavourDefiningCode;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Laboratory analyte result/Analyte name
   * Description: The name of the analyte result.
   * Comment: The value for this element is normally supplied in a specialisation, in a template or at run-time to reflect the actual analyte. For example: 'Serum sodium', 'Haemoglobin'. Coding with an external terminology is strongly recommended, such as LOINC, NPU, SNOMED CT, or local lab terminologies.
   */
  @Path("/items[at0024]/value|value")
  private String analyteNameValue;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Tree/Laboratory analyte result/Analyte name/null_flavour
   */
  @Path("/items[at0024]/null_flavour|defining_code")
  private NullFlavour analyteNameNullFlavourDefiningCode;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Laboratory analyte result/Analyte result
   * Description: The value of the analyte result.
   * Comment: For example '7.3 mmol/l', 'Raised'. The 'Any' data type will need to be constrained to an appropriate data type in a specialisation, a template or at run-time to reflect the actual analyte result. The Quantity data type has reference model attributes that include flags for normal/abnormal, reference ranges and approximations - see https://specifications.openehr.org/releases/RM/latest/data_types.html#_dv_quantity_class for more details.
   */
  @Path("/items[at0001]/value|magnitude")
  private Double analyteResultMagnitude;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Laboratory analyte result/Analyte result
   * Description: The value of the analyte result.
   * Comment: For example '7.3 mmol/l', 'Raised'. The 'Any' data type will need to be constrained to an appropriate data type in a specialisation, a template or at run-time to reflect the actual analyte result. The Quantity data type has reference model attributes that include flags for normal/abnormal, reference ranges and approximations - see https://specifications.openehr.org/releases/RM/latest/data_types.html#_dv_quantity_class for more details.
   */
  @Path("/items[at0001]/value|units")
  private String analyteResultUnits;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Tree/Laboratory analyte result/Analyte result/null_flavour
   */
  @Path("/items[at0001]/null_flavour|defining_code")
  private NullFlavour analyteResultNullFlavourDefiningCode;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Laboratory analyte result/Analyte result detail
   * Description: Further detail regarding an individual result.
   */
  @Path("/items[at0014]")
  private List<Cluster> analyteResultDetail;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Laboratory analyte result/Test method
   * Description: Description about the method used to perform the test on this analyte only.
   * Comment: If the test method applies to an entire panel, the test method can be captured using the 'Test method' data element within the OBSERVATION.laboratory_test_result
   */
  @Path("/items[at0028]/value|value")
  private String testMethodValue;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Tree/Laboratory analyte result/Test method/null_flavour
   */
  @Path("/items[at0028]/null_flavour|defining_code")
  private NullFlavour testMethodNullFlavourDefiningCode;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Laboratory analyte result/Comment
   * Description: Additional narrative about the analyte result, not captured in other fields.
   */
  @Path("/items[at0003]")
  private List<LaboratoryAnalyteResultCommentElement> comment;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Laboratory analyte result/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setAnalyteResultSequenceMagnitude(Long analyteResultSequenceMagnitude) {
     this.analyteResultSequenceMagnitude = analyteResultSequenceMagnitude;
  }

  public Long getAnalyteResultSequenceMagnitude() {
     return this.analyteResultSequenceMagnitude ;
  }

  public void setAnalyteResultSequenceNullFlavourDefiningCode(
      NullFlavour analyteResultSequenceNullFlavourDefiningCode) {
     this.analyteResultSequenceNullFlavourDefiningCode = analyteResultSequenceNullFlavourDefiningCode;
  }

  public NullFlavour getAnalyteResultSequenceNullFlavourDefiningCode() {
     return this.analyteResultSequenceNullFlavourDefiningCode ;
  }

  public void setAnalyteNameValue(String analyteNameValue) {
     this.analyteNameValue = analyteNameValue;
  }

  public String getAnalyteNameValue() {
     return this.analyteNameValue ;
  }

  public void setAnalyteNameNullFlavourDefiningCode(
      NullFlavour analyteNameNullFlavourDefiningCode) {
     this.analyteNameNullFlavourDefiningCode = analyteNameNullFlavourDefiningCode;
  }

  public NullFlavour getAnalyteNameNullFlavourDefiningCode() {
     return this.analyteNameNullFlavourDefiningCode ;
  }

  public void setAnalyteResultMagnitude(Double analyteResultMagnitude) {
     this.analyteResultMagnitude = analyteResultMagnitude;
  }

  public Double getAnalyteResultMagnitude() {
     return this.analyteResultMagnitude ;
  }

  public void setAnalyteResultUnits(String analyteResultUnits) {
     this.analyteResultUnits = analyteResultUnits;
  }

  public String getAnalyteResultUnits() {
     return this.analyteResultUnits ;
  }

  public void setAnalyteResultNullFlavourDefiningCode(
      NullFlavour analyteResultNullFlavourDefiningCode) {
     this.analyteResultNullFlavourDefiningCode = analyteResultNullFlavourDefiningCode;
  }

  public NullFlavour getAnalyteResultNullFlavourDefiningCode() {
     return this.analyteResultNullFlavourDefiningCode ;
  }

  public void setAnalyteResultDetail(List<Cluster> analyteResultDetail) {
     this.analyteResultDetail = analyteResultDetail;
  }

  public List<Cluster> getAnalyteResultDetail() {
     return this.analyteResultDetail ;
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

  public void setComment(List<LaboratoryAnalyteResultCommentElement> comment) {
     this.comment = comment;
  }

  public List<LaboratoryAnalyteResultCommentElement> getComment() {
     return this.comment ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
