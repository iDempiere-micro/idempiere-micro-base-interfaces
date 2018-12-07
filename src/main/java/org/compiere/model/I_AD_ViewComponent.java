package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ViewComponent
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ViewComponent {

    /**
     * TableName=AD_ViewComponent
     */
    String Table_Name = "AD_ViewComponent";

    /**
     * AD_Table_ID=200087
     */
    int Table_ID = 200087;

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
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_ViewComponent_ID
     */
    String COLUMNNAME_AD_ViewComponent_ID = "AD_ViewComponent_ID";
    /**
     * Column name AD_ViewComponent_UU
     */
    String COLUMNNAME_AD_ViewComponent_UU = "AD_ViewComponent_UU";
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
     * Column name FromClause
     */
    String COLUMNNAME_FromClause = "FromClause";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name OtherClause
     */
    String COLUMNNAME_OtherClause = "OtherClause";
    /**
     * Column name Referenced_Table_ID
     */
    String COLUMNNAME_Referenced_Table_ID = "Referenced_Table_ID";
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
     * Column name WhereClause
     */
    String COLUMNNAME_WhereClause = "WhereClause";

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
     * Get Database View Component
     */
    int getAD_ViewComponent_ID();

    /**
     * Set Database View Component
     */
    void setAD_ViewComponent_ID(int AD_ViewComponent_ID);

    /**
     * Get AD_ViewComponent_UU
     */
    String getAD_ViewComponent_UU();

    /**
     * Set AD_ViewComponent_UU
     */
    void setAD_ViewComponent_UU(String AD_ViewComponent_UU);

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
     * Get Sql FROM. SQL FROM clause
     */
    String getFromClause();

    /**
     * Set Sql FROM. SQL FROM clause
     */
    void setFromClause(String FromClause);

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
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Other SQL Clause. Other SQL Clause
     */
    String getOtherClause();

    /**
     * Set Other SQL Clause. Other SQL Clause
     */
    void setOtherClause(String OtherClause);

    /**
     * Get Referenced Table
     */
    int getReferenced_Table_ID();

    /**
     * Set Referenced Table
     */
    void setReferenced_Table_ID(int Referenced_Table_ID);

    I_AD_Table getReferenced_Table() throws RuntimeException;

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

    /**
     * Get Sql WHERE. Fully qualified SQL WHERE clause
     */
    String getWhereClause();

    /**
     * Set Sql WHERE. Fully qualified SQL WHERE clause
     */
    void setWhereClause(String WhereClause);
}
