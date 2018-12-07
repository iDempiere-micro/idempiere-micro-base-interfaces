package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_TableIndex
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_TableIndex {

    /**
     * TableName=AD_TableIndex
     */
    String Table_Name = "AD_TableIndex";

    /**
     * AD_Table_ID=200085
     */
    int Table_ID = 200085;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Message_ID
     */
    String COLUMNNAME_AD_Message_ID = "AD_Message_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_TableIndex_ID
     */
    String COLUMNNAME_AD_TableIndex_ID = "AD_TableIndex_ID";
    /**
     * Column name AD_TableIndex_UU
     */
    String COLUMNNAME_AD_TableIndex_UU = "AD_TableIndex_UU";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
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
     * Column name IsCreateConstraint
     */
    String COLUMNNAME_IsCreateConstraint = "IsCreateConstraint";
    /**
     * Column name IsKey
     */
    String COLUMNNAME_IsKey = "IsKey";
    /**
     * Column name IsUnique
     */
    String COLUMNNAME_IsUnique = "IsUnique";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name TableIndexDrop
     */
    String COLUMNNAME_TableIndexDrop = "TableIndexDrop";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Message. System Message
     */
    int getAD_Message_ID();

    /**
     * Set Message. System Message
     */
    void setAD_Message_ID(int AD_Message_ID);

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

    I_AD_Table getAD_Table() throws RuntimeException;

    /**
     * Get Table Index
     */
    int getAD_TableIndex_ID();

    /**
     * Set Table Index
     */
    void setAD_TableIndex_ID(int AD_TableIndex_ID);

    /**
     * Get AD_TableIndex_UU
     */
    String getAD_TableIndex_UU();

    /**
     * Set AD_TableIndex_UU
     */
    void setAD_TableIndex_UU(String AD_TableIndex_UU);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

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
     * Set Create Constraint
     */
    void setIsCreateConstraint(boolean IsCreateConstraint);

    /**
     * Get Create Constraint
     */
    boolean isCreateConstraint();

    /**
     * Set Key column. This column is the key in this table
     */
    void setIsKey(boolean IsKey);

    /**
     * Get Key column. This column is the key in this table
     */
    boolean isKey();

    /**
     * Set Unique
     */
    void setIsUnique(boolean IsUnique);

    /**
     * Get Unique
     */
    boolean isUnique();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Drop table index
     */
    String getTableIndexDrop();

    /**
     * Set Drop table index
     */
    void setTableIndexDrop(String TableIndexDrop);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
