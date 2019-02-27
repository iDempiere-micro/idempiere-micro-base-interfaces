package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_TreeNode
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_TreeNode {

    /**
     * AD_Table_ID=289
     */
    int Table_ID = 289;

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);


    /**
     * Column name AD_Tree_ID
     */
    String COLUMNNAME_AD_Tree_ID = "AD_Tree_ID";
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
     * Set Tree. Identifies a Tree
     */
    void setTreeId(int AD_Tree_ID);

    /**
     * Set Node
     */
    void setNodeId(int Node_ID);

    /**
     * Set Parent. Parent of Entity
     */
    void setParentId(int Parent_ID);

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

}
