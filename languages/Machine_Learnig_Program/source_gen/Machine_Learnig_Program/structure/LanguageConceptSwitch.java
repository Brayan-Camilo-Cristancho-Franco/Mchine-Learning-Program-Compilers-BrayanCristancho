package Machine_Learnig_Program.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int ButtonExport = 0;
  public static final int DescriptionModel = 1;
  public static final int FamilyModel = 2;
  public static final int Head = 3;
  public static final int InputBody = 4;
  public static final int InputValue = 5;
  public static final int InputsBody = 6;
  public static final int InputsStatement = 7;
  public static final int LayerBody = 8;
  public static final int LayerValue = 9;
  public static final int LayersBody = 10;
  public static final int LayersStatement = 11;
  public static final int MLDocument = 12;
  public static final int ModelBody = 13;
  public static final int ModelStatement = 14;
  public static final int NameInput = 15;
  public static final int NameLayer = 16;
  public static final int NameModel = 17;
  public static final int NameOutput = 18;
  public static final int OutputBody = 19;
  public static final int OutputValue = 20;
  public static final int OutputsBody = 21;
  public static final int OutputsStatement = 22;
  public static final int Params = 23;
  public static final int ParamsLayer = 24;
  public static final int TypeInput = 25;
  public static final int TypeModel = 26;
  public static final int TypeOutput = 27;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xf03daa50cd2c41b9L, 0x926581a1c1e4c00cL);
    builder.put(0x16e61662a516fc48L, ButtonExport);
    builder.put(0x2a9f739d746c38d4L, DescriptionModel);
    builder.put(0x2a9f739d746c38d2L, FamilyModel);
    builder.put(0x2a9f739d746c36d0L, Head);
    builder.put(0x2a9f739d746c38d8L, InputBody);
    builder.put(0x2a9f739d746c38d7L, InputValue);
    builder.put(0x2a9f739d746c38d6L, InputsBody);
    builder.put(0x2a9f739d746c38d5L, InputsStatement);
    builder.put(0x2a9f739d746c3900L, LayerBody);
    builder.put(0x2a9f739d746c38ffL, LayerValue);
    builder.put(0x2a9f739d746c38feL, LayersBody);
    builder.put(0x2a9f739d746c38e3L, LayersStatement);
    builder.put(0x2a9f739d746aa77eL, MLDocument);
    builder.put(0x2a9f739d746c38e2L, ModelBody);
    builder.put(0x2a9f739d746c38e1L, ModelStatement);
    builder.put(0x2a9f739d746c38d9L, NameInput);
    builder.put(0x2a9f739d746c3901L, NameLayer);
    builder.put(0x2a9f739d746c38d1L, NameModel);
    builder.put(0x2a9f739d746c38dfL, NameOutput);
    builder.put(0x2a9f739d746c38deL, OutputBody);
    builder.put(0x2a9f739d746c38ddL, OutputValue);
    builder.put(0x2a9f739d746c38dcL, OutputsBody);
    builder.put(0x2a9f739d746c38dbL, OutputsStatement);
    builder.put(0x2a9f739d746c3903L, Params);
    builder.put(0x2a9f739d746c3902L, ParamsLayer);
    builder.put(0x2a9f739d746c38daL, TypeInput);
    builder.put(0x2a9f739d746c38d3L, TypeModel);
    builder.put(0x2a9f739d746c38e0L, TypeOutput);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
