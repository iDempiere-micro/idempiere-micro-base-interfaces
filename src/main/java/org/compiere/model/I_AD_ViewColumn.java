package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ViewColumn
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ViewColumn {

  /** TableName=AD_ViewColumn */
  String Table_Name = "AD_ViewColumn";

  /** AD_Table_ID=200088 */
  int Table_ID = 200088;

    /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

    /** Column name AD_ViewColumn_ID */
  String COLUMNNAME_AD_ViewColumn_ID = "AD_ViewColumn_ID";
  /** Column name AD_ViewColumn_UU */
  String COLUMNNAME_AD_ViewColumn_UU = "AD_ViewColumn_UU";
  /** Column name AD_ViewComponent_ID */
  String COLUMNNAME_AD_ViewComponent_ID = "AD_ViewComponent_ID";
  /** Column name ColumnName */
  String COLUMNNAME_ColumnName = "ColumnName";
  /** Column name ColumnSQL */
  String COLUMNNAME_ColumnSQL = "ColumnSQL";
    /** Column name DBDataType */
  String COLUMNNAME_DBDataType = "DBDataType";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
    /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";

    /** Get Database View Component */
  int getAD_ViewComponent_ID();

  /** Set Database View Component */
  void setAD_ViewComponent_ID(int AD_ViewComponent_ID);

    /** Get DB Column Name. Name of the column in the database */
  String getColumnName();

    /** Get Column SQL. Virtual Column (r/o) */
  String getColumnSQL();

    /** Get Database Data Type */
  String getDBDataType();

    /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

}
