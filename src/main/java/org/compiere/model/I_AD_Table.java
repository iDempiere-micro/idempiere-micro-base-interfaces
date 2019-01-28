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

    /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AccessLevel */
  String COLUMNNAME_AccessLevel = "AccessLevel";
    /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name AD_Table_UU */
  String COLUMNNAME_AD_Table_UU = "AD_Table_UU";
  /** Column name AD_Val_Rule_ID */
  String COLUMNNAME_AD_Val_Rule_ID = "AD_Val_Rule_ID";
  /** Column name AD_Window_ID */
  String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
  /** Column name CopyColumnsFromTable */
  String COLUMNNAME_CopyColumnsFromTable = "CopyColumnsFromTable";
  /** Column name CopyComponentsFromView */
  String COLUMNNAME_CopyComponentsFromView = "CopyComponentsFromView";
    /** Column name DatabaseViewDrop */
  String COLUMNNAME_DatabaseViewDrop = "DatabaseViewDrop";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name ImportTable */
  String COLUMNNAME_ImportTable = "ImportTable";
    /** Column name IsCentrallyMaintained */
  String COLUMNNAME_IsCentrallyMaintained = "IsCentrallyMaintained";
  /** Column name IsChangeLog */
  String COLUMNNAME_IsChangeLog = "IsChangeLog";
  /** Column name IsDeleteable */
  String COLUMNNAME_IsDeleteable = "IsDeleteable";

  // public I_AD_Window getAD_Window() throws RuntimeException;
  /** Column name IsHighVolume */
  String COLUMNNAME_IsHighVolume = "IsHighVolume";
  /** Column name IsSecurityEnabled */
  String COLUMNNAME_IsSecurityEnabled = "IsSecurityEnabled";
  /** Column name IsView */
  String COLUMNNAME_IsView = "IsView";
  /** Column name LoadSeq */
  String COLUMNNAME_LoadSeq = "LoadSeq";
  /** Column name PO_Window_ID */
  String COLUMNNAME_PO_Window_ID = "PO_Window_ID";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name ReplicationType */
  String COLUMNNAME_ReplicationType = "ReplicationType";
  /** Column name TableName */
  String COLUMNNAME_TableName = "TableName";
    /** Organization = 1 */
  String ACCESSLEVEL_Organization = "1";

  /** Get Data Access Level. Access Level required */
  String getTableAccessLevel();

  /** Set Data Access Level. Access Level required */
  void setTableAccessLevel(String AccessLevel);

    /** Get Table. Database Table information */
  int getAD_Table_ID();

    /** Get Dynamic Validation. Dynamic Validation Rule */
  int getValRule_ID();

  I_AD_Val_Rule getValRule() throws RuntimeException;

    /** Get Created. Date this record was created */
  Timestamp getCreated();

    /** Get Description. Optional short description of the record */
  String getDescription();

    /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

    /** Get Active. The record is active in the system */
  boolean isActive();

    /** Set Maintain Change Log. Maintain a log of changes */
  void setIsChangeLog(boolean IsChangeLog);

    /** Set Records deletable. Indicates if records can be deleted from the database */
  void setIsDeleteable(boolean IsDeleteable);

  /** Get Records deletable. Indicates if records can be deleted from the database */
  boolean isDeleteable();

  /** Set High Volume. Use Search instead of Pick list */
  void setIsHighVolume(boolean IsHighVolume);

    /**
   * Set Security enabled. If security is enabled, user access to data can be restricted via Roles
   */
  void setIsSecurityEnabled(boolean IsSecurityEnabled);

    /** Set View. This is a view */
  void setIsView(boolean IsView);

  /** Get View. This is a view */
  boolean isView();

    /** Get Name. Alphanumeric identifier of the entity */
  String getName();

    /** Set Replication Type. Type of Data Replication */
  void setReplicationType(String ReplicationType);

  /** Get DB Table Name. Name of the table in the database */
  String getTableName();

}
