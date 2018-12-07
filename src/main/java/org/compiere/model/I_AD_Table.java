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

    /**
     * TableName=AD_Table
     */
    String Table_Name = "AD_Table";

    /**
     * AD_Table_ID=100
     */
    int Table_ID = 100;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AccessLevel
     */
    String COLUMNNAME_AccessLevel = "AccessLevel";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_Table_UU
     */
    String COLUMNNAME_AD_Table_UU = "AD_Table_UU";
    /**
     * Column name AD_Val_Rule_ID
     */
    String COLUMNNAME_AD_Val_Rule_ID = "AD_Val_Rule_ID";
    /**
     * Column name AD_Window_ID
     */
    String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
    /**
     * Column name CopyColumnsFromTable
     */
    String COLUMNNAME_CopyColumnsFromTable = "CopyColumnsFromTable";
    /**
     * Column name CopyComponentsFromView
     */
    String COLUMNNAME_CopyComponentsFromView = "CopyComponentsFromView";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DatabaseViewDrop
     */
    String COLUMNNAME_DatabaseViewDrop = "DatabaseViewDrop";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name ImportTable
     */
    String COLUMNNAME_ImportTable = "ImportTable";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsCentrallyMaintained
     */
    String COLUMNNAME_IsCentrallyMaintained = "IsCentrallyMaintained";
    /**
     * Column name IsChangeLog
     */
    String COLUMNNAME_IsChangeLog = "IsChangeLog";
    /**
     * Column name IsDeleteable
     */
    String COLUMNNAME_IsDeleteable = "IsDeleteable";

    // public I_AD_Window getAD_Window() throws RuntimeException;
    /**
     * Column name IsHighVolume
     */
    String COLUMNNAME_IsHighVolume = "IsHighVolume";
    /**
     * Column name IsSecurityEnabled
     */
    String COLUMNNAME_IsSecurityEnabled = "IsSecurityEnabled";
    /**
     * Column name IsView
     */
    String COLUMNNAME_IsView = "IsView";
    /**
     * Column name LoadSeq
     */
    String COLUMNNAME_LoadSeq = "LoadSeq";
    /**
     * Column name PO_Window_ID
     */
    String COLUMNNAME_PO_Window_ID = "PO_Window_ID";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name ReplicationType
     */
    String COLUMNNAME_ReplicationType = "ReplicationType";
    /**
     * Column name TableName
     */
    String COLUMNNAME_TableName = "TableName";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Organization = 1
     */
    String ACCESSLEVEL_Organization = "1";

    /**
     * Get Data Access Level. Access Level required
     */
    String getTableAccessLevel();

    /**
     * Set Data Access Level. Access Level required
     */
    void setTableAccessLevel(String AccessLevel);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    /**
     * Get AD_Table_UU
     */
    String getAD_Table_UU();

    /**
     * Set AD_Table_UU
     */
    void setAD_Table_UU(String AD_Table_UU);

    /**
     * Set Dynamic Validation. Dynamic Validation Rule
     */
    void setAD_Val_Rule_ID(int AD_Val_Rule_ID);

    /**
     * Get Dynamic Validation. Dynamic Validation Rule
     */
    int getValRule_ID();

    I_AD_Val_Rule getValRule() throws RuntimeException;

    /**
     * Get Window. Data entry or display window
     */
    int getAD_Window_ID();

    /**
     * Set Window. Data entry or display window
     */
    void setAD_Window_ID(int AD_Window_ID);

    /**
     * Get Copy Columns From Table
     */
    String getCopyColumnsFromTable();

    /**
     * Set Copy Columns From Table
     */
    void setCopyColumnsFromTable(String CopyColumnsFromTable);

    /**
     * Get Copy Components From View
     */
    String getCopyComponentsFromView();

    /**
     * Set Copy Components From View
     */
    void setCopyComponentsFromView(String CopyComponentsFromView);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Drop view
     */
    String getDatabaseViewDrop();

    /**
     * Set Drop view
     */
    void setDatabaseViewDrop(String DatabaseViewDrop);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    String getEntityType();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Get Import Table. Import Table Columns from Database
     */
    String getImportTable();

    /**
     * Set Import Table. Import Table Columns from Database
     */
    void setImportTable(String ImportTable);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Centrally maintained. Information maintained in System Element table
     */
    void setIsCentrallyMaintained(boolean IsCentrallyMaintained);

    /**
     * Get Centrally maintained. Information maintained in System Element table
     */
    boolean isCentrallyMaintained();

    /**
     * Set Maintain Change Log. Maintain a log of changes
     */
    void setIsChangeLog(boolean IsChangeLog);

    /**
     * Get Maintain Change Log. Maintain a log of changes
     */
    boolean isChangeLog();

    /**
     * Set Records deletable. Indicates if records can be deleted from the database
     */
    void setIsDeleteable(boolean IsDeleteable);

    /**
     * Get Records deletable. Indicates if records can be deleted from the database
     */
    boolean isDeleteable();

    /**
     * Set High Volume. Use Search instead of Pick list
     */
    void setIsHighVolume(boolean IsHighVolume);

    /**
     * Get High Volume. Use Search instead of Pick list
     */
    boolean isHighVolume();

    /**
     * Set Security enabled. If security is enabled, user access to data can be restricted via Roles
     */
    void setIsSecurityEnabled(boolean IsSecurityEnabled);

    /**
     * Get Security enabled. If security is enabled, user access to data can be restricted via Roles
     */
    boolean isSecurityEnabled();

    /**
     * Set View. This is a view
     */
    void setIsView(boolean IsView);

    /**
     * Get View. This is a view
     */
    boolean isView();

    /**
     * Get Sequence
     */
    int getLoadSeq();

    /**
     * Set Sequence
     */
    void setLoadSeq(int LoadSeq);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get PO Window. Purchase Order Window
     */
    int getPO_Window_ID();

    /**
     * Set PO Window. Purchase Order Window
     */
    void setPO_Window_ID(int PO_Window_ID);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Replication Type. Type of Data Replication
     */
    String getReplicationType();

    /**
     * Set Replication Type. Type of Data Replication
     */
    void setReplicationType(String ReplicationType);

    /**
     * Get DB Table Name. Name of the table in the database
     */
    String getTableName();

    /**
     * Set DB Table Name. Name of the table in the database
     */
    void setTableName(String TableName);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
