package se.cambio.gaia.composition.analytereport8composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-02-04T09:34:06.819464+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.6.0"
)
public interface LaboratoryTestResultAnyEventChoice {
  List<LaboratoryTestResultTreeItemTree> getTree();

  void setTree(List<LaboratoryTestResultTreeItemTree> tree);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  List<Cluster> getStructuredConfoundingFactors();

  void setStructuredConfoundingFactors(List<Cluster> structuredConfoundingFactors);
}
