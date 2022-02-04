package se.cambio.gaia.composition.analytereport8composition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Category;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;
import se.cambio.gaia.composition.analytereport8composition.definition.LaboratoryTestResultObservation;

public class AnalyteReport8CompositionContainment extends Containment {
  public SelectAqlField<AnalyteReport8Composition> ANALYTE_REPORT8_COMPOSITION = new AqlFieldImp<AnalyteReport8Composition>(AnalyteReport8Composition.class, "", "AnalyteReport8Composition", AnalyteReport8Composition.class, this);

  public SelectAqlField<Category> CATEGORY_DEFINING_CODE = new AqlFieldImp<Category>(AnalyteReport8Composition.class, "/category|defining_code", "categoryDefiningCode", Category.class, this);

  public SelectAqlField<String> REPORT_ID_VALUE = new AqlFieldImp<String>(AnalyteReport8Composition.class, "/context/other_context[at0001]/items[at0002]/value|value", "reportIdValue", String.class, this);

  public SelectAqlField<NullFlavour> REPORT_ID_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AnalyteReport8Composition.class, "/context/other_context[at0001]/items[at0002]/null_flavour|defining_code", "reportIdNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> STATUS_VALUE = new AqlFieldImp<String>(AnalyteReport8Composition.class, "/context/other_context[at0001]/items[at0005]/value|value", "statusValue", String.class, this);

  public SelectAqlField<NullFlavour> STATUS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AnalyteReport8Composition.class, "/context/other_context[at0001]/items[at0005]/null_flavour|defining_code", "statusNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(AnalyteReport8Composition.class, "/context/other_context[at0001]/items[at0006]", "extension", Cluster.class, this);

  public SelectAqlField<TemporalAccessor> START_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(AnalyteReport8Composition.class, "/context/start_time|value", "startTimeValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Participation> PARTICIPATIONS = new ListAqlFieldImp<Participation>(AnalyteReport8Composition.class, "/context/participations", "participations", Participation.class, this);

  public SelectAqlField<TemporalAccessor> END_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(AnalyteReport8Composition.class, "/context/end_time|value", "endTimeValue", TemporalAccessor.class, this);

  public SelectAqlField<String> LOCATION = new AqlFieldImp<String>(AnalyteReport8Composition.class, "/context/location", "location", String.class, this);

  public SelectAqlField<PartyIdentified> HEALTH_CARE_FACILITY = new AqlFieldImp<PartyIdentified>(AnalyteReport8Composition.class, "/context/health_care_facility", "healthCareFacility", PartyIdentified.class, this);

  public SelectAqlField<Setting> SETTING_DEFINING_CODE = new AqlFieldImp<Setting>(AnalyteReport8Composition.class, "/context/setting|defining_code", "settingDefiningCode", Setting.class, this);

  public SelectAqlField<LaboratoryTestResultObservation> LABORATORY_TEST_RESULT = new AqlFieldImp<LaboratoryTestResultObservation>(AnalyteReport8Composition.class, "/content[openEHR-EHR-OBSERVATION.laboratory_test_result.v1]", "laboratoryTestResult", LaboratoryTestResultObservation.class, this);

  public SelectAqlField<PartyProxy> COMPOSER = new AqlFieldImp<PartyProxy>(AnalyteReport8Composition.class, "/composer", "composer", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(AnalyteReport8Composition.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(AnalyteReport8Composition.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<Territory> TERRITORY = new AqlFieldImp<Territory>(AnalyteReport8Composition.class, "/territory", "territory", Territory.class, this);

  private AnalyteReport8CompositionContainment() {
    super("openEHR-EHR-COMPOSITION.report-result.v1");
  }

  public static AnalyteReport8CompositionContainment getInstance() {
    return new AnalyteReport8CompositionContainment();
  }
}
