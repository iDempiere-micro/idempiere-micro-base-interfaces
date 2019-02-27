package org.compiere.model;

import java.math.BigDecimal;

public interface BaseTreeNode {
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
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

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
