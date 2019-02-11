package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_TreeNodeBP
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_TreeNodeBP {

    /**
     * TableName=AD_TreeNodeBP
     */
    String Table_Name = "AD_TreeNodeBP";

    /**
     * AD_Table_ID=451
     */
    int Table_ID = 451;

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name AD_Tree_ID
     */
    String COLUMNNAME_AD_Tree_ID = "AD_Tree_ID";
    /**
     * Column name AD_TreeNodeBP_UU
     */
    String COLUMNNAME_AD_TreeNodeBP_UU = "AD_TreeNodeBP_UU";
    /**
     * Column name Node_ID
     */
    String COLUMNNAME_Node_ID = "Node_ID";
    /**
     * Column name Parent_ID
     */
    String COLUMNNAME_Parent_ID = "Parent_ID";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";

    /**
     * Get Tree. Identifies a Tree
     */
    int getAD_Tree_ID();

    /**
     * Set Tree. Identifies a Tree
     */
    void setAD_Tree_ID(int AD_Tree_ID);

    /**
     * Set Node
     */
    void setNode_ID(int Node_ID);

    /**
     * Set Parent. Parent of Entity
     */
    void setParent_ID(int Parent_ID);

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

}
