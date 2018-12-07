package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ViewColumn
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ViewColumn {

    /**
     * TableName=AD_ViewColumn
     */
    String Table_Name = "AD_ViewColumn";

    /**
     * AD_Table_ID=200088
     */
    int Table_ID = 200088;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_ViewColumn_ID
     */
    String COLUMNNAME_AD_ViewColumn_ID = "AD_ViewColumn_ID";
    /**
     * Column name AD_ViewColumn_UU
     */
    String COLUMNNAME_AD_ViewColumn_UU = "AD_ViewColumn_UU";
    /**
     * Column name AD_ViewComponent_ID
     */
    String COLUMNNAME_AD_ViewComponent_ID = "AD_ViewComponent_ID";
    /**
     * Column name ColumnName
     */
    String COLUMNNAME_ColumnName = "ColumnName";
    /**
     * Column name ColumnSQL
     */
    String COLUMNNAME_ColumnSQL = "ColumnSQL";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DBDataType
     */
    String COLUMNNAME_DBDataType = "DBDataType";
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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Database View Column
     */
    int getAD_ViewColumn_ID();

    /**
     * Set Database View Column
     */
    void setAD_ViewColumn_ID(int AD_ViewColumn_ID);

    /**
     * Get AD_ViewColumn_UU
     */
    String getAD_ViewColumn_UU();

    /**
     * Set AD_ViewColumn_UU
     */
    void setAD_ViewColumn_UU(String AD_ViewColumn_UU);

    /**
     * Get Database View Component
     */
    int getAD_ViewComponent_ID();

    /**
     * Set Database View Component
     */
    void setAD_ViewComponent_ID(int AD_ViewComponent_ID);

    I_AD_ViewComponent getAD_ViewComponent() throws RuntimeException;

    /**
     * Get DB Column Name. Name of the column in the database
     */
    String getColumnName();

    /**
     * Set DB Column Name. Name of the column in the database
     */
    void setColumnName(String ColumnName);

    /**
     * Get Column SQL. Virtual Column (r/o)
     */
    String getColumnSQL();

    /**
     * Set Column SQL. Virtual Column (r/o)
     */
    void setColumnSQL(String ColumnSQL);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Database Data Type
     */
    String getDBDataType();

    /**
     * Set Database Data Type
     */
    void setDBDataType(String DBDataType);

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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
