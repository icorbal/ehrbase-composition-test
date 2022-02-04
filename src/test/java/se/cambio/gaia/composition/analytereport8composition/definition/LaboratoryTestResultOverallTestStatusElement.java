package se.cambio.gaia.composition.analytereport8composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-02-04T09:34:06.745142+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.6.0"
)
public class LaboratoryTestResultOverallTestStatusElement implements LocatableEntity {
  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Tree/Overall test status/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Overall test status
   * Description: The status of the laboratory test result as a whole.
   */
  @Path("/value")
  @Choice
  private LaboratoryTestResultOverallTestStatusChoice value2;

  public void setValue(NullFlavour value) {
     this.value = value;
  }

  public NullFlavour getValue() {
     return this.value ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setValue2(LaboratoryTestResultOverallTestStatusChoice value2) {
     this.value2 = value2;
  }

  public LaboratoryTestResultOverallTestStatusChoice getValue2() {
     return this.value2 ;
  }
}
