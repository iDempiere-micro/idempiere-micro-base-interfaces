package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Field
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Field {

  /** TableName=AD_Field */
  String Table_Name = "AD_Field";

  /** AD_Table_ID=107 */
  int Table_ID = 107;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Column_ID */
  String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
  /** Column name AD_FieldGroup_ID */
  String COLUMNNAME_AD_FieldGroup_ID = "AD_FieldGroup_ID";
  /** Column name AD_Field_ID */
  String COLUMNNAME_AD_Field_ID = "AD_Field_ID";
  /** Column name AD_FieldStyle_ID */
  String COLUMNNAME_AD_FieldStyle_ID = "AD_FieldStyle_ID";
  /** Column name AD_Field_UU */
  String COLUMNNAME_AD_Field_UU = "AD_Field_UU";
  /** Column name AD_LabelStyle_ID */
  String COLUMNNAME_AD_LabelStyle_ID = "AD_LabelStyle_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Reference_ID */
  String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
  /** Column name AD_Reference_Value_ID */
  String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";
  /** Column name AD_Tab_ID */
  String COLUMNNAME_AD_Tab_ID = "AD_Tab_ID";
  /** Column name AD_Val_Rule_ID */
  String COLUMNNAME_AD_Val_Rule_ID = "AD_Val_Rule_ID";
  /** Column name ColumnSpan */
  String COLUMNNAME_ColumnSpan = "ColumnSpan";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DefaultValue */
  String COLUMNNAME_DefaultValue = "DefaultValue";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DisplayLength */
  String COLUMNNAME_DisplayLength = "DisplayLength";
  /** Column name DisplayLogic */
  String COLUMNNAME_DisplayLogic = "DisplayLogic";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name Included_Tab_ID */
  String COLUMNNAME_Included_Tab_ID = "Included_Tab_ID";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsAdvancedField */
  String COLUMNNAME_IsAdvancedField = "IsAdvancedField";
  /** Column name IsAllowCopy */
  String COLUMNNAME_IsAllowCopy = "IsAllowCopy";
  /** Column name IsAlwaysUpdateable */
  String COLUMNNAME_IsAlwaysUpdateable = "IsAlwaysUpdateable";
  /** Column name IsCentrallyMaintained */
  String COLUMNNAME_IsCentrallyMaintained = "IsCentrallyMaintained";
  /** Column name IsDefaultFocus */
  String COLUMNNAME_IsDefaultFocus = "IsDefaultFocus";
  /** Column name IsDisplayed */
  String COLUMNNAME_IsDisplayed = "IsDisplayed";
  /** Column name IsDisplayedGrid */
  String COLUMNNAME_IsDisplayedGrid = "IsDisplayedGrid";
  /** Column name IsEncrypted */
  String COLUMNNAME_IsEncrypted = "IsEncrypted";
  /** Column name IsFieldOnly */
  String COLUMNNAME_IsFieldOnly = "IsFieldOnly";
  /** Column name IsHeading */
  String COLUMNNAME_IsHeading = "IsHeading";
  /** Column name IsMandatory */
  String COLUMNNAME_IsMandatory = "IsMandatory";
  /** Column name IsQuickEntry */
  String COLUMNNAME_IsQuickEntry = "IsQuickEntry";
  /** Column name IsReadOnly */
  String COLUMNNAME_IsReadOnly = "IsReadOnly";
  /** Column name IsSameLine */
  String COLUMNNAME_IsSameLine = "IsSameLine";
  /** Column name IsToolbarButton */
  String COLUMNNAME_IsToolbarButton = "IsToolbarButton";
  /** Column name IsUpdateable */
  String COLUMNNAME_IsUpdateable = "IsUpdateable";
  /** Column name MandatoryLogic */
  String COLUMNNAME_MandatoryLogic = "MandatoryLogic";
  /** Column name NumLines */
  String COLUMNNAME_NumLines = "NumLines";
  /** Column name ObscureType */
  String COLUMNNAME_ObscureType = "ObscureType";
  /** Column name ReadOnlyLogic */
  String COLUMNNAME_ReadOnlyLogic = "ReadOnlyLogic";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name SeqNoGrid */
  String COLUMNNAME_SeqNoGrid = "SeqNoGrid";
  /** Column name SortNo */
  String COLUMNNAME_SortNo = "SortNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name VFormat */
  String COLUMNNAME_VFormat = "VFormat";
  /** Column name XPosition */
  String COLUMNNAME_XPosition = "XPosition";

  /** Get Column. Column in the table */
  int getAD_Column_ID();

  /** Set Column. Column in the table */
  void setAD_Column_ID(int AD_Column_ID);

  I_AD_Column getAD_Column() throws RuntimeException;

  /** Get Field Group. Logical grouping of fields */
  int getAD_FieldGroup_ID();

  /** Set Field Group. Logical grouping of fields */
  void setAD_FieldGroup_ID(int AD_FieldGroup_ID);

  /** Get Field. Field on a database table */
  int getAD_Field_ID();

  /** Set Field. Field on a database table */
  void setAD_Field_ID(int AD_Field_ID);

  /** Get Field Style. Field CSS Style */
  int getAD_FieldStyle_ID();

  /** Set Field Style. Field CSS Style */
  void setAD_FieldStyle_ID(int AD_FieldStyle_ID);

  /** Get AD_Field_UU */
  String getAD_Field_UU();

  /** Set AD_Field_UU */
  void setAD_Field_UU(String AD_Field_UU);

  /** Get Label Style. Label CSS Style */
  int getAD_LabelStyle_ID();

  /** Set Label Style. Label CSS Style */
  void setAD_LabelStyle_ID(int AD_LabelStyle_ID);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Reference. System Reference and Validation */
  int getReferenceId();

  /** Set Reference. System Reference and Validation */
  void setAD_Reference_ID(int AD_Reference_ID);

  I_AD_Reference getAD_Reference() throws RuntimeException;

  /** Get Reference Key. Required to specify, if data type is Table or List */
  int getAD_Reference_Value_ID();

  /** Set Reference Key. Required to specify, if data type is Table or List */
  void setAD_Reference_Value_ID(int AD_Reference_Value_ID);

  I_AD_Reference getAD_Reference_Value() throws RuntimeException;

  /** Get Tab. Tab within a Window */
  int getAD_Tab_ID();

  /** Set Tab. Tab within a Window */
  void setAD_Tab_ID(int AD_Tab_ID);

  /** Set Dynamic Validation. Dynamic Validation Rule */
  void setAD_Val_Rule_ID(int AD_Val_Rule_ID);

  /** Get Dynamic Validation. Dynamic Validation Rule */
  int getValRule_ID();

  I_AD_Val_Rule getValRule() throws RuntimeException;

  /** Get Column Span. Number of column for a box of field */
  int getColumnSpan();

  /** Set Column Span. Number of column for a box of field */
  void setColumnSpan(int ColumnSpan);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Default Logic. Default value hierarchy, separated by ; */
  String getDefaultValue();

  /** Set Default Logic. Default value hierarchy, separated by ; */
  void setDefaultValue(String DefaultValue);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Display Length. Length of the display in characters */
  int getDisplayLength();

  /** Set Display Length. Length of the display in characters */
  void setDisplayLength(int DisplayLength);

  /**
   * Get Display Logic. If the Field is displayed, the result determines if the field is actually
   * displayed
   */
  String getDisplayLogic();

  /**
   * Set Display Logic. If the Field is displayed, the result determines if the field is actually
   * displayed
   */
  void setDisplayLogic(String DisplayLogic);

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Get Included Tab. Included Tab in this Tab (Master Detail) */
  int getIncluded_Tab_ID();

  /** Set Included Tab. Included Tab in this Tab (Master Detail) */
  void setIncluded_Tab_ID(int Included_Tab_ID);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Advanced Field */
  void setIsAdvancedField(boolean IsAdvancedField);

  /** Get Advanced Field */
  boolean isAdvancedField();

  /** Get Allow Copy. Determine if a column must be copied when pushing the button to copy record */
  String getIsAllowCopy();

  /** Set Allow Copy. Determine if a column must be copied when pushing the button to copy record */
  void setIsAllowCopy(String IsAllowCopy);

  /**
   * Get Always Updatable. The column is always updateable, even if the record is not active or
   * processed
   */
  String getIsAlwaysUpdateable();

  /**
   * Set Always Updatable. The column is always updateable, even if the record is not active or
   * processed
   */
  void setIsAlwaysUpdateable(String IsAlwaysUpdateable);

  /** Set Centrally maintained. Information maintained in System Element table */
  void setIsCentrallyMaintained(boolean IsCentrallyMaintained);

  /** Get Centrally maintained. Information maintained in System Element table */
  boolean isCentrallyMaintained();

  /** Set Default Focus */
  void setIsDefaultFocus(boolean IsDefaultFocus);

  /** Get Default Focus */
  boolean isDefaultFocus();

  /** Set Displayed. Determines, if this field is displayed */
  void setIsDisplayed(boolean IsDisplayed);

  /** Get Displayed. Determines, if this field is displayed */
  boolean isDisplayed();

  /** Set Show in Grid */
  void setIsDisplayedGrid(boolean IsDisplayedGrid);

  /** Get Show in Grid */
  boolean isDisplayedGrid();

  /** Set Encrypted. Display or Storage is encrypted */
  void setIsEncrypted(boolean IsEncrypted);

  /** Get Encrypted. Display or Storage is encrypted */
  boolean isEncrypted();

  /** Set Field Only. Label is not displayed */
  void setIsFieldOnly(boolean IsFieldOnly);

  /** Get Field Only. Label is not displayed */
  boolean isFieldOnly();

  /** Set Heading only. Field without Column - Only label is displayed */
  void setIsHeading(boolean IsHeading);

  /** Get Heading only. Field without Column - Only label is displayed */
  boolean isHeading();

  /** Get Mandatory. Data entry is required in this column */
  String getIsMandatory();

  /** Set Mandatory. Data entry is required in this column */
  void setIsMandatory(String IsMandatory);

  /** Set Quick Entry */
  void setIsQuickEntry(boolean IsQuickEntry);

  /** Get Quick Entry */
  boolean isQuickEntry();

  /** Set Read Only. Field is read only */
  void setIsReadOnly(boolean IsReadOnly);

  /** Get Read Only. Field is read only */
  boolean isReadOnly();

  /** Set Same Line. Displayed on same line as previous field */
  void setIsSameLine(boolean IsSameLine);

  /** Get Same Line. Displayed on same line as previous field */
  boolean isSameLine();

  /** Get Toolbar Button. Show the button on the toolbar, the window, or both */
  String getIsToolbarButton();

  /** Set Toolbar Button. Show the button on the toolbar, the window, or both */
  void setIsToolbarButton(String IsToolbarButton);

  /** Get Updatable. Determines, if the field can be updated */
  String getIsUpdateable();

  /** Set Updatable. Determines, if the field can be updated */
  void setIsUpdateable(String IsUpdateable);

  /** Get Mandatory Logic */
  String getMandatoryLogic();

  /** Set Mandatory Logic */
  void setMandatoryLogic(String MandatoryLogic);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Number of Lines. Number of lines for a field */
  int getNumLines();

  /** Set Number of Lines. Number of lines for a field */
  void setNumLines(int NumLines);

  /** Get Obscure. Type of obscuring the data (limiting the display) */
  String getObscureType();

  /** Set Obscure. Type of obscuring the data (limiting the display) */
  void setObscureType(String ObscureType);

  /**
   * Get Read Only Logic. Logic to determine if field is read only (applies only when field is
   * read-write)
   */
  String getReadOnlyLogic();

  /**
   * Set Read Only Logic. Logic to determine if field is read only (applies only when field is
   * read-write)
   */
  void setReadOnlyLogic(String ReadOnlyLogic);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Grid Sequence No */
  int getSeqNoGrid();

  /** Set Grid Sequence No */
  void setSeqNoGrid(int SeqNoGrid);

  /** Get Record Sort No. Determines in what order the records are displayed */
  BigDecimal getSortNo();

  /** Set Record Sort No. Determines in what order the records are displayed */
  void setSortNo(BigDecimal SortNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /**
   * Get Value Format. Format of the value; Can contain fixed format elements, Variables:
   * "_lLoOaAcCa09"
   */
  String getVFormat();

  /**
   * Set Value Format. Format of the value; Can contain fixed format elements, Variables:
   * "_lLoOaAcCa09"
   */
  void setVFormat(String VFormat);

  /** Get X Position. Absolute X (horizontal) position in 1/72 of an inch */
  int getXPosition();

  /** Set X Position. Absolute X (horizontal) position in 1/72 of an inch */
  void setXPosition(int XPosition);
}
