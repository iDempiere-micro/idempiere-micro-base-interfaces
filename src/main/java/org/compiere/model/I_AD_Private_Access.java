package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Private_Access
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Private_Access {

  /** TableName=AD_Private_Access */
  String Table_Name = "AD_Private_Access";

  /** AD_Table_ID=627 */
  int Table_ID = 627;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Column name AD_Private_Access_UU */
  String COLUMNNAME_AD_Private_Access_UU = "AD_Private_Access_UU";

  /** Set AD_Private_Access_UU */
  void setAD_Private_Access_UU(String AD_Private_Access_UU);

  /** Get AD_Private_Access_UU */
  String getAD_Private_Access_UU();

  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

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

  /** Column name Record_ID */
  String COLUMNNAME_Record_ID = "Record_ID";

  /** Set Record ID. Direct internal record ID */
  void setRecord_ID(int Record_ID);

  /** Get Record ID. Direct internal record ID */
  int getRecord_ID();

  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
