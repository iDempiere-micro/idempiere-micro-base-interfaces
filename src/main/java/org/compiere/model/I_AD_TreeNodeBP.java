package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_TreeNodeBP
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_TreeNodeBP {

  /** TableName=AD_TreeNodeBP */
  String Table_Name = "AD_TreeNodeBP";

  /** AD_Table_ID=451 */
  int Table_ID = 451;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Column name AD_Tree_ID */
  String COLUMNNAME_AD_Tree_ID = "AD_Tree_ID";

  /** Set Tree. Identifies a Tree */
  void setAD_Tree_ID(int AD_Tree_ID);

  /** Get Tree. Identifies a Tree */
  int getAD_Tree_ID();

  I_AD_Tree getAD_Tree() throws RuntimeException;

  /** Column name AD_TreeNodeBP_UU */
  String COLUMNNAME_AD_TreeNodeBP_UU = "AD_TreeNodeBP_UU";

  /** Set AD_TreeNodeBP_UU */
  void setAD_TreeNodeBP_UU(String AD_TreeNodeBP_UU);

  /** Get AD_TreeNodeBP_UU */
  String getAD_TreeNodeBP_UU();

  /** Column name Created */
  String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Column name Node_ID */
  String COLUMNNAME_Node_ID = "Node_ID";

  /** Set Node */
  void setNode_ID(int Node_ID);

  /** Get Node */
  int getNode_ID();

  /** Column name Parent_ID */
  String COLUMNNAME_Parent_ID = "Parent_ID";

  /** Set Parent. Parent of Entity */
  void setParent_ID(int Parent_ID);

  /** Get Parent. Parent of Entity */
  int getParent_ID();

  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
