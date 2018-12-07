package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Tree
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Tree {

    /**
     * TableName=AD_Tree
     */
    String Table_Name = "AD_Tree";

    /**
     * AD_Table_ID=288
     */
    int Table_ID = 288;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

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
     * Column name AD_Tree_ID
     */
    String COLUMNNAME_AD_Tree_ID = "AD_Tree_ID";
    /**
     * Column name AD_Tree_UU
     */
    String COLUMNNAME_AD_Tree_UU = "AD_Tree_UU";
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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsAllNodes
     */
    String COLUMNNAME_IsAllNodes = "IsAllNodes";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsLoadAllNodesImmediately
     */
    String COLUMNNAME_IsLoadAllNodesImmediately = "IsLoadAllNodesImmediately";
    /**
     * Column name IsTreeDrivenByValue
     */
    String COLUMNNAME_IsTreeDrivenByValue = "IsTreeDrivenByValue";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name TreeType
     */
    String COLUMNNAME_TreeType = "TreeType";
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
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    I_AD_Table getAD_Table() throws RuntimeException;

    /**
     * Get Tree. Identifies a Tree
     */
    int getAD_Tree_ID();

    /**
     * Set Tree. Identifies a Tree
     */
    void setAD_Tree_ID(int AD_Tree_ID);

    /**
     * Get AD_Tree_UU
     */
    String getAD_Tree_UU();

    /**
     * Set AD_Tree_UU
     */
    void setAD_Tree_UU(String AD_Tree_UU);

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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set All Nodes. All Nodes are included (Complete Tree)
     */
    void setIsAllNodes(boolean IsAllNodes);

    /**
     * Get All Nodes. All Nodes are included (Complete Tree)
     */
    boolean isAllNodes();

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Set Loads directly all nodes. If checked, all nodes are loaded before tree is displayed
     */
    void setIsLoadAllNodesImmediately(boolean IsLoadAllNodesImmediately);

    /**
     * Get Loads directly all nodes. If checked, all nodes are loaded before tree is displayed
     */
    boolean isLoadAllNodesImmediately();

    /**
     * Set Driven by Search Key
     */
    void setIsTreeDrivenByValue(boolean IsTreeDrivenByValue);

    /**
     * Get Driven by Search Key
     */
    boolean isTreeDrivenByValue();

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
     * Get Type | Area. Element this tree is built on (i.e Product, Business Partner)
     */
    String getTreeType();

    /**
     * Set Type | Area. Element this tree is built on (i.e Product, Business Partner)
     */
    void setTreeType(String TreeType);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
