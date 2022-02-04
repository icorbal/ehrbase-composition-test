package se.cambio.gaia.composition.analytereport8composition.definition;

import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-02-04T09:34:06.751301+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.6.0"
)
@OptionFor("DV_TEXT")
public class LaboratoryTestResultOverallTestStatusDvText implements RMEntity, LaboratoryTestResultOverallTestStatusChoice {
  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Overall test status/Overall test status
   * Description: The status of the laboratory test result as a whole.
   */
  @Path("|value")
  private String overallTestStatusValue;

  public void setOverallTestStatusValue(String overallTestStatusValue) {
     this.overallTestStatusValue = overallTestStatusValue;
  }

  public String getOverallTestStatusValue() {
     return this.overallTestStatusValue ;
  }
}
