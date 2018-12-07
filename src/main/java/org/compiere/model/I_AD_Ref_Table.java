package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Ref_Table
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Ref_Table {

  /** TableName=AD_Ref_Table */
  String Table_Name = "AD_Ref_Table";

  /** AD_Table_ID=103 */
  int Table_ID = 103;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Display */
  String COLUMNNAME_AD_Display = "AD_Display";

  /** Set Display column. Column that will display */
  void setAD_Display(int AD_Display);

  /** Get Display column. Column that will display */
  int getAD_Display();

  I_AD_Column getAD_Disp() throws RuntimeException;

  /** Column name AD_InfoWindow_ID */
  String COLUMNNAME_AD_InfoWindow_ID = "AD_InfoWindow_ID";

  /** Set Info Window. Info and search/select Window */
  void setAD_InfoWindow_ID(int AD_InfoWindow_ID);

  /** Get Info Window. Info and search/select Window */
  int getAD_InfoWindow_ID();

  /** Column name AD_Key */
  String COLUMNNAME_AD_Key = "AD_Key";

  /** Set Key column. Unique identifier of a record */
  void setAD_Key(int AD_Key);

  /** Get Key column. Unique identifier of a record */
  int getAD_Key();

  I_AD_Column getAD_() throws RuntimeException;

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Column name AD_Reference_ID */
  String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";

  /** Set Reference. System Reference and Validation */
  void setAD_Reference_ID(int AD_Reference_ID);

  /** Get Reference. System Reference and Validation */
  int getAD_Reference_ID();

  I_AD_Reference getAD_Reference() throws RuntimeException;

  /** Column name AD_Ref_Table_UU */
  String COLUMNNAME_AD_Ref_Table_UU = "AD_Ref_Table_UU";

  /** Set AD_Ref_Table_UU */
  void setAD_Ref_Table_UU(String AD_Ref_Table_UU);

  /** Get AD_Ref_Table_UU */
  String getAD_Ref_Table_UU();

  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Column name AD_Window_ID */
  String COLUMNNAME_AD_Window_ID = "AD_Window_ID";

  /** Set Window. Data entry or display window */
  void setAD_Window_ID(int AD_Window_ID);

  /** Get Window. Data entry or display window */
  int getAD_Window_ID();

  /** Column name Created */
  String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Column name IsValueDisplayed */
  String COLUMNNAME_IsValueDisplayed = "IsValueDisplayed";

  /** Set Display Value. Displays Value column with the Display column */
  void setIsValueDisplayed(boolean IsValueDisplayed);

  /** Get Display Value. Displays Value column with the Display column */
  boolean isValueDisplayed();

  /** Column name OrderByClause */
  String COLUMNNAME_OrderByClause = "OrderByClause";

  /** Set Sql ORDER BY. Fully qualified ORDER BY clause */
  void setOrderByClause(String OrderByClause);

  /** Get Sql ORDER BY. Fully qualified ORDER BY clause */
  String getOrderByClause();

  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Column name WhereClause */
  String COLUMNNAME_WhereClause = "WhereClause";

  /** Set Sql WHERE. Fully qualified SQL WHERE clause */
  void setWhereClause(String WhereClause);

  /** Get Sql WHERE. Fully qualified SQL WHERE clause */
  String getWhereClause();
}
