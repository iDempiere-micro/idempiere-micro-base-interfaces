package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Column
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Column {

  /** TableName=AD_Column */
  String Table_Name = "AD_Column";

  /** AD_Table_ID=101 */
  int Table_ID = 101;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Chart_ID */
  String COLUMNNAME_AD_Chart_ID = "AD_Chart_ID";

  /** Set Chart */
  void setAD_Chart_ID(int AD_Chart_ID);

  /** Get Chart */
  int getAD_Chart_ID();

  /** Column name AD_Column_ID */
  String COLUMNNAME_AD_Column_ID = "AD_Column_ID";

  /** Set Column. Column in the table */
  void setColumnId(int AD_Column_ID);

  /** Get Column. Column in the table */
  int getColumnId();

  /** Column name AD_Column_UU */
  String COLUMNNAME_AD_Column_UU = "AD_Column_UU";

  /** Set AD_Column_UU */
  void setAD_Column_UU(String AD_Column_UU);

  /** Get AD_Column_UU */
  String getAD_Column_UU();

  /** Column name AD_Element_ID */
  String COLUMNNAME_AD_Element_ID = "AD_Element_ID";

  /**
   * Set System Element. System Element enables the central maintenance of column description and
   * help.
   */
  void setAD_Element_ID(int AD_Element_ID);

  /**
   * Get System Element. System Element enables the central maintenance of column description and
   * help.
   */
  int getAD_Element_ID();

  I_AD_Element getAD_Element() throws RuntimeException;

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Column name AD_Process_ID */
  String COLUMNNAME_AD_Process_ID = "AD_Process_ID";

  /** Set Process. Process or Report */
  void setAD_Process_ID(int AD_Process_ID);

  /** Get Process. Process or Report */
  int getAD_Process_ID();

  /** Column name AD_Reference_ID */
  String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";

  /** Set Reference. System Reference and Validation */
  void setReferenceId(int AD_Reference_ID);

  /** Get Reference. System Reference and Validation */
  int getReferenceId();

  I_AD_Reference getReference() throws RuntimeException;

  /** Column name AD_Reference_Value_ID */
  String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";

  /** Set Reference Key. Required to specify, if data type is Table or List */
  void setAD_Reference_Value_ID(int AD_Reference_Value_ID);

  /** Get Reference Key. Required to specify, if data type is Table or List */
  int getAD_Reference_Value_ID();

  I_AD_Reference getAD_Reference_Value() throws RuntimeException;

  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Column name AD_Val_Rule_ID */
  String COLUMNNAME_AD_Val_Rule_ID = "AD_Val_Rule_ID";

  /** Set Dynamic Validation. Dynamic Validation Rule */
  void setAD_Val_Rule_ID(int AD_Val_Rule_ID);

  /** Get Dynamic Validation. Dynamic Validation Rule */
  int getValRule_ID();

  I_AD_Val_Rule getValRule() throws RuntimeException;

  /** Column name Callout */
  String COLUMNNAME_Callout = "Callout";

  /** Set Callout. Fully qualified class names and method - separated by semicolons */
  void setCallout(String Callout);

  /** Get Callout. Fully qualified class names and method - separated by semicolons */
  String getCallout();

  /** Column name ColumnName */
  String COLUMNNAME_ColumnName = "ColumnName";

  /** Set DB Column Name. Name of the column in the database */
  void setColumnName(String ColumnName);

  /** Get DB Column Name. Name of the column in the database */
  String getColumnName();

  /** Column name ColumnSQL */
  String COLUMNNAME_ColumnSQL = "ColumnSQL";

  /** Set Column SQL. Virtual Column (r/o) */
  void setColumnSQL(String ColumnSQL);

  /** Get Column SQL. Virtual Column (r/o) */
  String getColumnSQL();

  /** Column name Created */
  String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Column name DefaultValue */
  String COLUMNNAME_DefaultValue = "DefaultValue";

  /** Set Default Logic. Default value hierarchy, separated by ; */
  void setDefaultValue(String DefaultValue);

  /** Get Default Logic. Default value hierarchy, separated by ; */
  String getDefaultValue();

  /** Column name Description */
  String COLUMNNAME_Description = "Description";

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Column name FieldLength */
  String COLUMNNAME_FieldLength = "FieldLength";

  /** Set Length. Length of the column in the database */
  void setFieldLength(int FieldLength);

  /** Get Length. Length of the column in the database */
  int getFieldLength();

  /** Column name FKConstraintName */
  String COLUMNNAME_FKConstraintName = "FKConstraintName";

  /** Set Constraint Name */
  void setFKConstraintName(String FKConstraintName);

  /** Get Constraint Name */
  String getFKConstraintName();

  /** Column name FKConstraintType */
  String COLUMNNAME_FKConstraintType = "FKConstraintType";

  /** Set Constraint Type */
  void setFKConstraintType(String FKConstraintType);

  /** Get Constraint Type */
  String getFKConstraintType();

  /** Column name FormatPattern */
  String COLUMNNAME_FormatPattern = "FormatPattern";

  /** Set Format Pattern. The pattern used to format a number or date. */
  void setFormatPattern(String FormatPattern);

  /** Get Format Pattern. The pattern used to format a number or date. */
  String getFormatPattern();

  /** Column name Help */
  String COLUMNNAME_Help = "Help";

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Column name IsAllowCopy */
  String COLUMNNAME_IsAllowCopy = "IsAllowCopy";

  /** Set Allow Copy. Determine if a column must be copied when pushing the button to copy record */
  void setIsAllowCopy(boolean IsAllowCopy);

  /** Get Allow Copy. Determine if a column must be copied when pushing the button to copy record */
  boolean isAllowCopy();

  /** Column name IsAllowLogging */
  String COLUMNNAME_IsAllowLogging = "IsAllowLogging";

  /** Set Allow Logging. Determine if a column must be recorded into the change log */
  void setIsAllowLogging(boolean IsAllowLogging);

  /** Get Allow Logging. Determine if a column must be recorded into the change log */
  boolean isAllowLogging();

  /** Column name IsAlwaysUpdateable */
  String COLUMNNAME_IsAlwaysUpdateable = "IsAlwaysUpdateable";

  /**
   * Set Always Updatable. The column is always updateable, even if the record is not active or
   * processed
   */
  void setIsAlwaysUpdateable(boolean IsAlwaysUpdateable);

  /**
   * Get Always Updatable. The column is always updateable, even if the record is not active or
   * processed
   */
  boolean isAlwaysUpdateable();

  /** Column name IsAutocomplete */
  String COLUMNNAME_IsAutocomplete = "IsAutocomplete";

  /** Set Autocomplete. Automatic completion for textfields */
  void setIsAutocomplete(boolean IsAutocomplete);

  /** Get Autocomplete. Automatic completion for textfields */
  boolean isAutocomplete();

  /** Column name IsEncrypted */
  String COLUMNNAME_IsEncrypted = "IsEncrypted";

  /** Set Encrypted. Display or Storage is encrypted */
  void setIsEncrypted(String IsEncrypted);

  /** Get Encrypted. Display or Storage is encrypted */
  String getIsEncrypted();

  /** Column name IsIdentifier */
  String COLUMNNAME_IsIdentifier = "IsIdentifier";

  /** Set Identifier. This column is part of the record identifier */
  void setIsIdentifier(boolean IsIdentifier);

  /** Get Identifier. This column is part of the record identifier */
  boolean isIdentifier();

  /** Column name IsKey */
  String COLUMNNAME_IsKey = "IsKey";

  /** Set Key column. This column is the key in this table */
  void setIsKey(boolean IsKey);

  /** Get Key column. This column is the key in this table */
  boolean isKey();

  /** Column name IsMandatory */
  String COLUMNNAME_IsMandatory = "IsMandatory";

  /** Set Mandatory. Data entry is required in this column */
  void setIsMandatory(boolean IsMandatory);

  /** Get Mandatory. Data entry is required in this column */
  boolean isMandatory();

  /** Column name IsParent */
  String COLUMNNAME_IsParent = "IsParent";

  /**
   * Set Parent link column. This column is a link to the parent table (e.g. header from lines) -
   * incl. Association key columns
   */
  void setIsParent(boolean IsParent);

  /**
   * Get Parent link column. This column is a link to the parent table (e.g. header from lines) -
   * incl. Association key columns
   */
  boolean isParent();

  /** Column name IsSecure */
  String COLUMNNAME_IsSecure = "IsSecure";

  /** Set Secure content. Defines whether content must be treated as secure */
  void setIsSecure(boolean IsSecure);

  /** Get Secure content. Defines whether content must be treated as secure */
  boolean isSecure();

  /** Column name IsSelectionColumn */
  String COLUMNNAME_IsSelectionColumn = "IsSelectionColumn";

  /** Set Selection Column. Is this column used for finding rows in windows */
  void setIsSelectionColumn(boolean IsSelectionColumn);

  /** Get Selection Column. Is this column used for finding rows in windows */
  boolean isSelectionColumn();

  /** Column name IsSyncDatabase */
  String COLUMNNAME_IsSyncDatabase = "IsSyncDatabase";

  /**
   * Set Synchronize Database. Change database table definition when changing dictionary definition
   */
  void setIsSyncDatabase(String IsSyncDatabase);

  /**
   * Get Synchronize Database. Change database table definition when changing dictionary definition
   */
  String getIsSyncDatabase();

  /** Column name IsToolbarButton */
  String COLUMNNAME_IsToolbarButton = "IsToolbarButton";

  /** Set Toolbar Button. Show the button on the toolbar, the window, or both */
  void setIsToolbarButton(String IsToolbarButton);

  /** Get Toolbar Button. Show the button on the toolbar, the window, or both */
  String getIsToolbarButton();

  /** Column name IsTranslated */
  String COLUMNNAME_IsTranslated = "IsTranslated";

  /** Set Translated. This column is translated */
  void setIsTranslated(boolean IsTranslated);

  /** Get Translated. This column is translated */
  boolean isTranslated();

  /** Column name IsUpdateable */
  String COLUMNNAME_IsUpdateable = "IsUpdateable";

  /** Set Updatable. Determines, if the field can be updated */
  void setIsUpdateable(boolean IsUpdateable);

  /** Get Updatable. Determines, if the field can be updated */
  boolean isUpdateable();

  /** Column name MandatoryLogic */
  String COLUMNNAME_MandatoryLogic = "MandatoryLogic";

  /** Set Mandatory Logic */
  void setMandatoryLogic(String MandatoryLogic);

  /** Get Mandatory Logic */
  String getMandatoryLogic();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Column name PA_DashboardContent_ID */
  String COLUMNNAME_PA_DashboardContent_ID = "PA_DashboardContent_ID";

  /** Set Dashboard Content */
  void setPA_DashboardContent_ID(int PA_DashboardContent_ID);

  /** Get Dashboard Content */
  int getPA_DashboardContent_ID();

  /** Column name ReadOnlyLogic */
  String COLUMNNAME_ReadOnlyLogic = "ReadOnlyLogic";

  /**
   * Set Read Only Logic. Logic to determine if field is read only (applies only when field is
   * read-write)
   */
  void setReadOnlyLogic(String ReadOnlyLogic);

  /**
   * Get Read Only Logic. Logic to determine if field is read only (applies only when field is
   * read-write)
   */
  String getReadOnlyLogic();

  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Column name SeqNoSelection */
  String COLUMNNAME_SeqNoSelection = "SeqNoSelection";

  /** Set Selection Column Sequence. Selection Column Sequence */
  void setSeqNoSelection(int SeqNoSelection);

  /** Get Selection Column Sequence. Selection Column Sequence */
  int getSeqNoSelection();

  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Column name ValueMax */
  String COLUMNNAME_ValueMax = "ValueMax";

  /** Set Max. Value. Maximum Value for a field */
  void setValueMax(String ValueMax);

  /** Get Max. Value. Maximum Value for a field */
  String getValueMax();

  /** Column name ValueMin */
  String COLUMNNAME_ValueMin = "ValueMin";

  /** Set Min. Value. Minimum Value for a field */
  void setValueMin(String ValueMin);

  /** Get Min. Value. Minimum Value for a field */
  String getValueMin();

  /** Column name Version */
  String COLUMNNAME_Version = "Version";

  /** Set Version. Version of the table definition */
  void setVersion(BigDecimal Version);

  /** Get Version. Version of the table definition */
  BigDecimal getVersion();

  /** Column name VFormat */
  String COLUMNNAME_VFormat = "VFormat";

  /**
   * Set Value Format. Format of the value; Can contain fixed format elements, Variables:
   * "_lLoOaAcCa09"
   */
  void setVFormat(String VFormat);

  /**
   * Get Value Format. Format of the value; Can contain fixed format elements, Variables:
   * "_lLoOaAcCa09"
   */
  String getVFormat();
}
