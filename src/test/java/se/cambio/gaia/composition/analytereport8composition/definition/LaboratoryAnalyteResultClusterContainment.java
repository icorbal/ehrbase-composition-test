package se.cambio.gaia.composition.analytereport8composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class LaboratoryAnalyteResultClusterContainment extends Containment {
  public SelectAqlField<LaboratoryAnalyteResultCluster> LABORATORY_ANALYTE_RESULT_CLUSTER = new AqlFieldImp<LaboratoryAnalyteResultCluster>(LaboratoryAnalyteResultCluster.class, "", "LaboratoryAnalyteResultCluster", LaboratoryAnalyteResultCluster.class, this);

  public SelectAqlField<Long> ANALYTE_RESULT_SEQUENCE_MAGNITUDE = new AqlFieldImp<Long>(LaboratoryAnalyteResultCluster.class, "/items[at0027]/value|magnitude", "analyteResultSequenceMagnitude", Long.class, this);

  public SelectAqlField<NullFlavour> ANALYTE_RESULT_SEQUENCE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(LaboratoryAnalyteResultCluster.class, "/items[at0027]/null_flavour|defining_code", "analyteResultSequenceNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> ANALYTE_NAME_VALUE = new AqlFieldImp<String>(LaboratoryAnalyteResultCluster.class, "/items[at0024]/value|value", "analyteNameValue", String.class, this);

  public SelectAqlField<NullFlavour> ANALYTE_NAME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(LaboratoryAnalyteResultCluster.class, "/items[at0024]/null_flavour|defining_code", "analyteNameNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Double> ANALYTE_RESULT_MAGNITUDE = new AqlFieldImp<Double>(LaboratoryAnalyteResultCluster.class, "/items[at0001]/value|magnitude", "analyteResultMagnitude", Double.class, this);

  public SelectAqlField<String> ANALYTE_RESULT_UNITS = new AqlFieldImp<String>(LaboratoryAnalyteResultCluster.class, "/items[at0001]/value|units", "analyteResultUnits", String.class, this);

  public SelectAqlField<NullFlavour> ANALYTE_RESULT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(LaboratoryAnalyteResultCluster.class, "/items[at0001]/null_flavour|defining_code", "analyteResultNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> ANALYTE_RESULT_DETAIL = new ListAqlFieldImp<Cluster>(LaboratoryAnalyteResultCluster.class, "/items[at0014]", "analyteResultDetail", Cluster.class, this);

  public SelectAqlField<String> TEST_METHOD_VALUE = new AqlFieldImp<String>(LaboratoryAnalyteResultCluster.class, "/items[at0028]/value|value", "testMethodValue", String.class, this);

  public SelectAqlField<NullFlavour> TEST_METHOD_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(LaboratoryAnalyteResultCluster.class, "/items[at0028]/null_flavour|defining_code", "testMethodNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<LaboratoryAnalyteResultCommentElement> COMMENT = new ListAqlFieldImp<LaboratoryAnalyteResultCommentElement>(LaboratoryAnalyteResultCluster.class, "/items[at0003]", "comment", LaboratoryAnalyteResultCommentElement.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(LaboratoryAnalyteResultCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private LaboratoryAnalyteResultClusterContainment() {
    super("openEHR-EHR-CLUSTER.laboratory_test_analyte.v1");
  }

  public static LaboratoryAnalyteResultClusterContainment getInstance() {
    return new LaboratoryAnalyteResultClusterContainment();
  }
}
