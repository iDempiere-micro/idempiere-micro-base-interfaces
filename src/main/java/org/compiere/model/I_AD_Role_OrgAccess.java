package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Role_OrgAccess
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Role_OrgAccess {

  /** TableName=AD_Role_OrgAccess */
  String Table_Name = "AD_Role_OrgAccess";

  /** AD_Table_ID=422 */
  int Table_ID = 422;

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

  /** Column name AD_Role_OrgAccess_UU */
  String COLUMNNAME_AD_Role_OrgAccess_UU = "AD_Role_OrgAccess_UU";

  /** Set AD_Role_OrgAccess_UU */
  void setAD_Role_OrgAccess_UU(String AD_Role_OrgAccess_UU);

  /** Get AD_Role_OrgAccess_UU */
  String getAD_Role_OrgAccess_UU();

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
