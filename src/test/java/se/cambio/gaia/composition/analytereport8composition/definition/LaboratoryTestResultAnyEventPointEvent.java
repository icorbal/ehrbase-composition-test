package se.cambio.gaia.composition.analytereport8composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.PointEventEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-02-04T09:34:06.805976+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.6.0"
)
@OptionFor("POINT_EVENT")
public class LaboratoryTestResultAnyEventPointEvent implements PointEventEntity, LaboratoryTestResultAnyEventChoice {
  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Tree
   * Description: @ internal @
   */
  @Path("/data[at0003]")
  private List<LaboratoryTestResultTreeItemTree> tree;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/Structured confounding factors
   * Description: Details of issues or circumstances that impact on the accurate interpretation of the measurement or test result.
   * Comment: For example: Last Normal Menstrual Period (LNMP).
   */
  @Path("/state[at0112]/items[at0114]")
  private List<Cluster> structuredConfoundingFactors;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Analyte_Report_8/Laboratory test result/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setTree(List<LaboratoryTestResultTreeItemTree> tree) {
     this.tree = tree;
  }

  public List<LaboratoryTestResultTreeItemTree> getTree() {
     return this.tree ;
  }

  public void setStructuredConfoundingFactors(List<Cluster> structuredConfoundingFactors) {
     this.structuredConfoundingFactors = structuredConfoundingFactors;
  }

  public List<Cluster> getStructuredConfoundingFactors() {
     return this.structuredConfoundingFactors ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }
}
