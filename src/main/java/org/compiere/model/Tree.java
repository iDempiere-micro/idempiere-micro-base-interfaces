package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Tree
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface Tree {

    /**
     * TableName=AD_Tree
     */
    String Table_Name = "AD_Tree";

    /**
     * AD_Table_ID=288
     */
    int Table_ID = 288;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_Tree_ID
     */
    String COLUMNNAME_AD_Tree_ID = "AD_Tree_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsAllNodes
     */
    String COLUMNNAME_IsAllNodes = "IsAllNodes";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsTreeDrivenByValue
     */
    String COLUMNNAME_IsTreeDrivenByValue = "IsTreeDrivenByValue";
    /**
     * Column name TreeType
     */
    String COLUMNNAME_TreeType = "TreeType";

    /**
     * Get Table. Database Table information
     */
    int getTreeTableId();

    /**
     * Get Tree. Identifies a Tree
     */
    int getTreeId();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

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
     * Set Driven by Search Key
     */
    void setIsTreeDrivenByValue(boolean IsTreeDrivenByValue);

    /**
     * Get Driven by Search Key
     */
    boolean isTreeDrivenByValue();

    /**
     * Get Type | Area. Element this tree is built on (i.e Product, Business Partner)
     */
    String getTreeType();

    /**
     * Set Type | Area. Element this tree is built on (i.e Product, Business Partner)
     */
    void setTreeType(String TreeType);

}
