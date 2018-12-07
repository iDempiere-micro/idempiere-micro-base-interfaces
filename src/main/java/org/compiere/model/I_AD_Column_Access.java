package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Column_Access
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Column_Access {

  /** TableName=AD_Column_Access */
  String Table_Name = "AD_Column_Access";

  /** AD_Table_ID=571 */
  int Table_ID = 571;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Column_Access_UU */
  String COLUMNNAME_AD_Column_Access_UU = "AD_Column_Access_UU";

  /** Set AD_Column_Access_UU */
  void setAD_Column_Access_UU(String AD_Column_Access_UU);

  /** Get AD_Column_Access_UU */
  String getAD_Column_Access_UU();

  /** Column name AD_Column_ID */
  String COLUMNNAME_AD_Column_ID = "AD_Column_ID";

  /** Set Column. Column in the table */
  void setAD_Column_ID(int AD_Column_ID);

  /** Get Column. Column in the table */
  int getAD_Column_ID();

  I_AD_Column getAD_Column() throws RuntimeException;

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Column name AD_Role_ID */
  String COLUMNNAME_AD_Role_ID = "AD_Role_ID";

  /** Set Role. Responsibility Role */
  void setAD_Role_ID(int AD_Role_ID);

  /** Get Role. Responsibility Role */
  int getAD_Role_ID();

  I_AD_Role getAD_Role() throws RuntimeException;

  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  I_AD_Table getAD_Table() throws RuntimeException;

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

  /** Column name IsExclude */
  String COLUMNNAME_IsExclude = "IsExclude";

  /** Set Exclude. Exclude access to the data - if not selected Include access to the data */
  void setIsExclude(boolean IsExclude);

  /** Get Exclude. Exclude access to the data - if not selected Include access to the data */
  boolean isExclude();

  /** Column name IsReadOnly */
  String COLUMNNAME_IsReadOnly = "IsReadOnly";

  /** Set Read Only. Field is read only */
  void setIsReadOnly(boolean IsReadOnly);

  /** Get Read Only. Field is read only */
  boolean isReadOnly();

  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
