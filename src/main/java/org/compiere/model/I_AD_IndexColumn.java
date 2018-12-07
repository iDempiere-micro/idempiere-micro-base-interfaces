package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_IndexColumn
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_IndexColumn {

  /** TableName=AD_IndexColumn */
  String Table_Name = "AD_IndexColumn";

  /** AD_Table_ID=200086 */
  int Table_ID = 200086;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Column_ID */
  String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
  /** Column name AD_IndexColumn_ID */
  String COLUMNNAME_AD_IndexColumn_ID = "AD_IndexColumn_ID";
  /** Column name AD_IndexColumn_UU */
  String COLUMNNAME_AD_IndexColumn_UU = "AD_IndexColumn_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_TableIndex_ID */
  String COLUMNNAME_AD_TableIndex_ID = "AD_TableIndex_ID";
  /** Column name ColumnSQL */
  String COLUMNNAME_ColumnSQL = "ColumnSQL";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Column. Column in the table */
  int getAD_Column_ID();

  /** Set Column. Column in the table */
  void setAD_Column_ID(int AD_Column_ID);

  I_AD_Column getAD_Column() throws RuntimeException;

  /** Get Table Index Column */
  int getAD_IndexColumn_ID();

  /** Set Table Index Column */
  void setAD_IndexColumn_ID(int AD_IndexColumn_ID);

  /** Get AD_IndexColumn_UU */
  String getAD_IndexColumn_UU();

  /** Set AD_IndexColumn_UU */
  void setAD_IndexColumn_UU(String AD_IndexColumn_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Table Index */
  int getAD_TableIndex_ID();

  /** Set Table Index */
  void setAD_TableIndex_ID(int AD_TableIndex_ID);

  I_AD_TableIndex getAD_TableIndex() throws RuntimeException;

  /** Get Column SQL. Virtual Column (r/o) */
  String getColumnSQL();

  /** Set Column SQL. Virtual Column (r/o) */
  void setColumnSQL(String ColumnSQL);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
