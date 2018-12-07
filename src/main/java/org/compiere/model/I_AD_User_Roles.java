package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_User_Roles
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_User_Roles {

  /** TableName=AD_User_Roles */
  String Table_Name = "AD_User_Roles";

  /** AD_Table_ID=157 */
  int Table_ID = 157;

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

  /** Column name AD_Role_ID */
  String COLUMNNAME_AD_Role_ID = "AD_Role_ID";

  /** Set Role. Responsibility Role */
  void setAD_Role_ID(int AD_Role_ID);

  /** Get Role. Responsibility Role */
  int getAD_Role_ID();

  I_AD_Role getAD_Role() throws RuntimeException;

  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Column name AD_User_Roles_UU */
  String COLUMNNAME_AD_User_Roles_UU = "AD_User_Roles_UU";

  /** Set AD_User_Roles_UU */
  void setAD_User_Roles_UU(String AD_User_Roles_UU);

  /** Get AD_User_Roles_UU */
  String getAD_User_Roles_UU();

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

  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
