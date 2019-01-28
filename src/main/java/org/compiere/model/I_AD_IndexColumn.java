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

    /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Column_ID */
  String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
  /** Column name AD_IndexColumn_ID */
  String COLUMNNAME_AD_IndexColumn_ID = "AD_IndexColumn_ID";
  /** Column name AD_IndexColumn_UU */
  String COLUMNNAME_AD_IndexColumn_UU = "AD_IndexColumn_UU";
    /** Column name AD_TableIndex_ID */
  String COLUMNNAME_AD_TableIndex_ID = "AD_TableIndex_ID";
  /** Column name ColumnSQL */
  String COLUMNNAME_ColumnSQL = "ColumnSQL";
    /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
    /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";

    /** Get Column. Column in the table */
  int getAD_Column_ID();

  /** Set Column. Column in the table */
  void setAD_Column_ID(int AD_Column_ID);

    /** Get Table Index */
  int getAD_TableIndex_ID();

  /** Set Table Index */
  void setAD_TableIndex_ID(int AD_TableIndex_ID);

    /** Get Column SQL. Virtual Column (r/o) */
  String getColumnSQL();

    /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

}
