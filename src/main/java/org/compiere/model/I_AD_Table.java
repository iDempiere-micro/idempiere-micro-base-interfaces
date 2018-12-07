package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Table
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Table {

  /** TableName=AD_Table */
  String Table_Name = "AD_Table";

  /** AD_Table_ID=100 */
  int Table_ID = 100;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AccessLevel */
  String COLUMNNAME_AccessLevel = "AccessLevel";

  /** Set Data Access Level. Access Level required */
  void setTableAccessLevel(String AccessLevel);

  /** Get Data Access Level. Access Level required */
  String getTableAccessLevel();

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Column name AD_Table_UU */
  String COLUMNNAME_AD_Table_UU = "AD_Table_UU";

  /** Set AD_Table_UU */
  void setAD_Table_UU(String AD_Table_UU);

  /** Get AD_Table_UU */
  String getAD_Table_UU();

  /** Column name AD_Val_Rule_ID */
  String COLUMNNAME_AD_Val_Rule_ID = "AD_Val_Rule_ID";

  /** Set Dynamic Validation. Dynamic Validation Rule */
  void setAD_Val_Rule_ID(int AD_Val_Rule_ID);

  /** Get Dynamic Validation. Dynamic Validation Rule */
  int getValRule_ID();

  I_AD_Val_Rule getValRule() throws RuntimeException;

  /** Column name AD_Window_ID */
  String COLUMNNAME_AD_Window_ID = "AD_Window_ID";

  /** Set Window. Data entry or display window */
  void setAD_Window_ID(int AD_Window_ID);

  /** Get Window. Data entry or display window */
  int getAD_Window_ID();

  // public I_AD_Window getAD_Window() throws RuntimeException;

  /** Column name CopyColumnsFromTable */
  String COLUMNNAME_CopyColumnsFromTable = "CopyColumnsFromTable";

  /** Set Copy Columns From Table */
  void setCopyColumnsFromTable(String CopyColumnsFromTable);

  /** Get Copy Columns From Table */
  String getCopyColumnsFromTable();

  /** Column name CopyComponentsFromView */
  String COLUMNNAME_CopyComponentsFromView = "CopyComponentsFromView";

  /** Set Copy Components From View */
  void setCopyComponentsFromView(String CopyComponentsFromView);

  /** Get Copy Components From View */
  String getCopyComponentsFromView();

  /** Column name Created */
  String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Column name DatabaseViewDrop */
  String COLUMNNAME_DatabaseViewDrop = "DatabaseViewDrop";

  /** Set Drop view */
  void setDatabaseViewDrop(String DatabaseViewDrop);

  /** Get Drop view */
  String getDatabaseViewDrop();

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

  /** Column name Help */
  String COLUMNNAME_Help = "Help";

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Column name ImportTable */
  String COLUMNNAME_ImportTable = "ImportTable";

  /** Set Import Table. Import Table Columns from Database */
  void setImportTable(String ImportTable);

  /** Get Import Table. Import Table Columns from Database */
  String getImportTable();

  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Column name IsCentrallyMaintained */
  String COLUMNNAME_IsCentrallyMaintained = "IsCentrallyMaintained";

  /** Set Centrally maintained. Information maintained in System Element table */
  void setIsCentrallyMaintained(boolean IsCentrallyMaintained);

  /** Get Centrally maintained. Information maintained in System Element table */
  boolean isCentrallyMaintained();

  /** Column name IsChangeLog */
  String COLUMNNAME_IsChangeLog = "IsChangeLog";

  /** Set Maintain Change Log. Maintain a log of changes */
  void setIsChangeLog(boolean IsChangeLog);

  /** Get Maintain Change Log. Maintain a log of changes */
  boolean isChangeLog();

  /** Column name IsDeleteable */
  String COLUMNNAME_IsDeleteable = "IsDeleteable";

  /** Set Records deletable. Indicates if records can be deleted from the database */
  void setIsDeleteable(boolean IsDeleteable);

  /** Get Records deletable. Indicates if records can be deleted from the database */
  boolean isDeleteable();

  /** Column name IsHighVolume */
  String COLUMNNAME_IsHighVolume = "IsHighVolume";

  /** Set High Volume. Use Search instead of Pick list */
  void setIsHighVolume(boolean IsHighVolume);

  /** Get High Volume. Use Search instead of Pick list */
  boolean isHighVolume();

  /** Column name IsSecurityEnabled */
  String COLUMNNAME_IsSecurityEnabled = "IsSecurityEnabled";

  /**
   * Set Security enabled. If security is enabled, user access to data can be restricted via Roles
   */
  void setIsSecurityEnabled(boolean IsSecurityEnabled);

  /**
   * Get Security enabled. If security is enabled, user access to data can be restricted via Roles
   */
  boolean isSecurityEnabled();

  /** Column name IsView */
  String COLUMNNAME_IsView = "IsView";

  /** Set View. This is a view */
  void setIsView(boolean IsView);

  /** Get View. This is a view */
  boolean isView();

  /** Column name LoadSeq */
  String COLUMNNAME_LoadSeq = "LoadSeq";

  /** Set Sequence */
  void setLoadSeq(int LoadSeq);

  /** Get Sequence */
  int getLoadSeq();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Column name PO_Window_ID */
  String COLUMNNAME_PO_Window_ID = "PO_Window_ID";

  /** Set PO Window. Purchase Order Window */
  void setPO_Window_ID(int PO_Window_ID);

  /** Get PO Window. Purchase Order Window */
  int getPO_Window_ID();

  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Process Now */
  boolean isProcessing();

  /** Column name ReplicationType */
  String COLUMNNAME_ReplicationType = "ReplicationType";

  /** Set Replication Type. Type of Data Replication */
  void setReplicationType(String ReplicationType);

  /** Get Replication Type. Type of Data Replication */
  String getReplicationType();

  /** Column name TableName */
  String COLUMNNAME_TableName = "TableName";

  /** Set DB Table Name. Name of the table in the database */
  void setTableName(String TableName);

  /** Get DB Table Name. Name of the table in the database */
  String getTableName();

  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Organization = 1 */
  String ACCESSLEVEL_Organization = "1";
}
