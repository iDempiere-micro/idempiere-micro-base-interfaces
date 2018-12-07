package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Role
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Role {

  /** TableName=AD_Role */
  String Table_Name = "AD_Role";

  /** AD_Table_ID=156 */
  int Table_ID = 156;

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

  /** Column name AD_Role_UU */
  String COLUMNNAME_AD_Role_UU = "AD_Role_UU";

  /** Set AD_Role_UU */
  void setAD_Role_UU(String AD_Role_UU);

  /** Get AD_Role_UU */
  String getAD_Role_UU();

  /** Column name AD_Tree_Menu_ID */
  String COLUMNNAME_AD_Tree_Menu_ID = "AD_Tree_Menu_ID";

  /** Set Menu Tree. Tree of the menu */
  void setAD_Tree_Menu_ID(int AD_Tree_Menu_ID);

  /** Get Menu Tree. Tree of the menu */
  int getAD_Tree_Menu_ID();

  I_AD_Tree getAD_Tree_Menu() throws RuntimeException;

  /** Column name AD_Tree_Org_ID */
  String COLUMNNAME_AD_Tree_Org_ID = "AD_Tree_Org_ID";

  /**
   * Set Organization Tree. Trees are used for (financial) reporting and security access (via role)
   */
  void setAD_Tree_Org_ID(int AD_Tree_Org_ID);

  /**
   * Get Organization Tree. Trees are used for (financial) reporting and security access (via role)
   */
  int getAD_Tree_Org_ID();

  I_AD_Tree getAD_Tree_Org() throws RuntimeException;

  /** Column name Allow_Info_Account */
  String COLUMNNAME_Allow_Info_Account = "Allow_Info_Account";

  /** Set Allow Info Account */
  void setAllow_Info_Account(boolean Allow_Info_Account);

  /** Get Allow Info Account */
  boolean isAllow_Info_Account();

  /** Column name Allow_Info_Asset */
  String COLUMNNAME_Allow_Info_Asset = "Allow_Info_Asset";

  /** Set Allow Info Asset */
  void setAllow_Info_Asset(boolean Allow_Info_Asset);

  /** Get Allow Info Asset */
  boolean isAllow_Info_Asset();

  /** Column name Allow_Info_BPartner */
  String COLUMNNAME_Allow_Info_BPartner = "Allow_Info_BPartner";

  /** Set Allow Info BPartner */
  void setAllow_Info_BPartner(boolean Allow_Info_BPartner);

  /** Get Allow Info BPartner */
  boolean isAllow_Info_BPartner();

  /** Column name Allow_Info_InOut */
  String COLUMNNAME_Allow_Info_InOut = "Allow_Info_InOut";

  /** Set Allow Info InOut */
  void setAllow_Info_InOut(boolean Allow_Info_InOut);

  /** Get Allow Info InOut */
  boolean isAllow_Info_InOut();

  /** Column name Allow_Info_Invoice */
  String COLUMNNAME_Allow_Info_Invoice = "Allow_Info_Invoice";

  /** Set Allow Info Invoice */
  void setAllow_Info_Invoice(boolean Allow_Info_Invoice);

  /** Get Allow Info Invoice */
  boolean isAllow_Info_Invoice();

  /** Column name Allow_Info_Order */
  String COLUMNNAME_Allow_Info_Order = "Allow_Info_Order";

  /** Set Allow Info Order */
  void setAllow_Info_Order(boolean Allow_Info_Order);

  /** Get Allow Info Order */
  boolean isAllow_Info_Order();

  /** Column name Allow_Info_Payment */
  String COLUMNNAME_Allow_Info_Payment = "Allow_Info_Payment";

  /** Set Allow Info Payment */
  void setAllow_Info_Payment(boolean Allow_Info_Payment);

  /** Get Allow Info Payment */
  boolean isAllow_Info_Payment();

  /** Column name Allow_Info_Product */
  String COLUMNNAME_Allow_Info_Product = "Allow_Info_Product";

  /** Set Allow Info Product */
  void setAllow_Info_Product(boolean Allow_Info_Product);

  /** Get Allow Info Product */
  boolean isAllow_Info_Product();

  /** Column name Allow_Info_Resource */
  String COLUMNNAME_Allow_Info_Resource = "Allow_Info_Resource";

  /** Set Allow Info Resource */
  void setAllow_Info_Resource(boolean Allow_Info_Resource);

  /** Get Allow Info Resource */
  boolean isAllow_Info_Resource();

  /** Column name Allow_Info_Schedule */
  String COLUMNNAME_Allow_Info_Schedule = "Allow_Info_Schedule";

  /** Set Allow Info Schedule */
  void setAllow_Info_Schedule(boolean Allow_Info_Schedule);

  /** Get Allow Info Schedule */
  boolean isAllow_Info_Schedule();

  /** Column name AmtApproval */
  String COLUMNNAME_AmtApproval = "AmtApproval";

  /** Set Approval Amount. The approval amount limit for this role */
  void setAmtApproval(BigDecimal AmtApproval);

  /** Get Approval Amount. The approval amount limit for this role */
  BigDecimal getAmtApproval();

  /** Column name AmtApprovalAccum */
  String COLUMNNAME_AmtApprovalAccum = "AmtApprovalAccum";

  /**
   * Set Approval Amount Accumulated. The approval amount limit for this role accumulated on a
   * period
   */
  void setAmtApprovalAccum(BigDecimal AmtApprovalAccum);

  /**
   * Get Approval Amount Accumulated. The approval amount limit for this role accumulated on a
   * period
   */
  BigDecimal getAmtApprovalAccum();

  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Column name ConfirmQueryRecords */
  String COLUMNNAME_ConfirmQueryRecords = "ConfirmQueryRecords";

  /**
   * Set Confirm Query Records. Require Confirmation if more records will be returned by the query
   * (If not defined 500)
   */
  void setConfirmQueryRecords(int ConfirmQueryRecords);

  /**
   * Get Confirm Query Records. Require Confirmation if more records will be returned by the query
   * (If not defined 500)
   */
  int getConfirmQueryRecords();

  /** Column name Created */
  String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Column name DaysApprovalAccum */
  String COLUMNNAME_DaysApprovalAccum = "DaysApprovalAccum";

  /**
   * Set Days Approval Accumulated. The days approval indicates the days to take into account to
   * verify the accumulated approval amount.
   */
  void setDaysApprovalAccum(int DaysApprovalAccum);

  /**
   * Get Days Approval Accumulated. The days approval indicates the days to take into account to
   * verify the accumulated approval amount.
   */
  int getDaysApprovalAccum();

  /** Column name Description */
  String COLUMNNAME_Description = "Description";

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Column name IsAccessAdvanced */
  String COLUMNNAME_IsAccessAdvanced = "IsAccessAdvanced";

  /** Set Access Advanced */
  void setIsAccessAdvanced(boolean IsAccessAdvanced);

  /** Get Access Advanced */
  boolean isAccessAdvanced();

  /** Column name IsAccessAllOrgs */
  String COLUMNNAME_IsAccessAllOrgs = "IsAccessAllOrgs";

  /** Set Access all Orgs. Access all Organizations (no org access control) of the client */
  void setIsAccessAllOrgs(boolean IsAccessAllOrgs);

  /** Get Access all Orgs. Access all Organizations (no org access control) of the client */
  boolean isAccessAllOrgs();

  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Column name IsCanApproveOwnDoc */
  String COLUMNNAME_IsCanApproveOwnDoc = "IsCanApproveOwnDoc";

  /** Set Approve own Documents. Users with this role can approve their own documents */
  void setIsCanApproveOwnDoc(boolean IsCanApproveOwnDoc);

  /** Get Approve own Documents. Users with this role can approve their own documents */
  boolean isCanApproveOwnDoc();

  /** Column name IsCanExport */
  String COLUMNNAME_IsCanExport = "IsCanExport";

  /** Set Can Export. Users with this role can export data */
  void setIsCanExport(boolean IsCanExport);

  /** Get Can Export. Users with this role can export data */
  boolean isCanExport();

  /** Column name IsCanReport */
  String COLUMNNAME_IsCanReport = "IsCanReport";

  /** Set Can Report. Users with this role can create reports */
  void setIsCanReport(boolean IsCanReport);

  /** Get Can Report. Users with this role can create reports */
  boolean isCanReport();

  /** Column name IsChangeLog */
  String COLUMNNAME_IsChangeLog = "IsChangeLog";

  /** Set Maintain Change Log. Maintain a log of changes */
  void setIsChangeLog(boolean IsChangeLog);

  /** Get Maintain Change Log. Maintain a log of changes */
  boolean isChangeLog();

  /** Column name IsDiscountAllowedOnTotal */
  String COLUMNNAME_IsDiscountAllowedOnTotal = "IsDiscountAllowedOnTotal";

  /** Set IsDiscountAllowedOnTotal */
  void setIsDiscountAllowedOnTotal(boolean IsDiscountAllowedOnTotal);

  /** Get IsDiscountAllowedOnTotal */
  boolean isDiscountAllowedOnTotal();

  /** Column name IsDiscountUptoLimitPrice */
  String COLUMNNAME_IsDiscountUptoLimitPrice = "IsDiscountUptoLimitPrice";

  /** Set IsDiscountUptoLimitPrice */
  void setIsDiscountUptoLimitPrice(boolean IsDiscountUptoLimitPrice);

  /** Get IsDiscountUptoLimitPrice */
  boolean isDiscountUptoLimitPrice();

  /** Column name IsManual */
  String COLUMNNAME_IsManual = "IsManual";

  /** Set Manual. This is a manual process */
  void setIsManual(boolean IsManual);

  /** Get Manual. This is a manual process */
  boolean isManual();

  /** Column name IsMasterRole */
  String COLUMNNAME_IsMasterRole = "IsMasterRole";

  /**
   * Set Master Role. A master role cannot be assigned to users, it is intended to define access to
   * menu option and documents and inherit to other roles
   */
  void setIsMasterRole(boolean IsMasterRole);

  /**
   * Get Master Role. A master role cannot be assigned to users, it is intended to define access to
   * menu option and documents and inherit to other roles
   */
  boolean isMasterRole();

  /** Column name IsMenuAutoExpand */
  String COLUMNNAME_IsMenuAutoExpand = "IsMenuAutoExpand";

  /** Set Auto expand menu. If ticked, the menu is automatically expanded */
  void setIsMenuAutoExpand(boolean IsMenuAutoExpand);

  /** Get Auto expand menu. If ticked, the menu is automatically expanded */
  boolean isMenuAutoExpand();

  /** Column name IsPersonalAccess */
  String COLUMNNAME_IsPersonalAccess = "IsPersonalAccess";

  /** Set Personal Access. Allow access to all personal records */
  void setIsPersonalAccess(boolean IsPersonalAccess);

  /** Get Personal Access. Allow access to all personal records */
  boolean isPersonalAccess();

  /** Column name IsPersonalLock */
  String COLUMNNAME_IsPersonalLock = "IsPersonalLock";

  /** Set Personal Lock. Allow users with role to lock access to personal records */
  void setIsPersonalLock(boolean IsPersonalLock);

  /** Get Personal Lock. Allow users with role to lock access to personal records */
  boolean isPersonalLock();

  /** Column name IsShowAcct */
  String COLUMNNAME_IsShowAcct = "IsShowAcct";

  /** Set Show Accounting. Users with this role can see accounting information */
  void setIsShowAcct(boolean IsShowAcct);

  /** Get Show Accounting. Users with this role can see accounting information */
  boolean isShowAcct();

  /** Column name IsUseUserOrgAccess */
  String COLUMNNAME_IsUseUserOrgAccess = "IsUseUserOrgAccess";

  /** Set Use User Org Access. Use Org Access defined by user instead of Role Org Access */
  void setIsUseUserOrgAccess(boolean IsUseUserOrgAccess);

  /** Get Use User Org Access. Use Org Access defined by user instead of Role Org Access */
  boolean isUseUserOrgAccess();

  /** Column name MaxQueryRecords */
  String COLUMNNAME_MaxQueryRecords = "MaxQueryRecords";

  /**
   * Set Max Query Records. If defined, you cannot query more records as defined - the query
   * criteria needs to be changed to query less records
   */
  void setMaxQueryRecords(int MaxQueryRecords);

  /**
   * Get Max Query Records. If defined, you cannot query more records as defined - the query
   * criteria needs to be changed to query less records
   */
  int getMaxQueryRecords();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Column name OverwritePriceLimit */
  String COLUMNNAME_OverwritePriceLimit = "OverwritePriceLimit";

  /** Set Overwrite Price Limit. Overwrite Price Limit if the Price List enforces the Price Limit */
  void setOverwritePriceLimit(boolean OverwritePriceLimit);

  /** Get Overwrite Price Limit. Overwrite Price Limit if the Price List enforces the Price Limit */
  boolean isOverwritePriceLimit();

  /** Column name PreferenceType */
  String COLUMNNAME_PreferenceType = "PreferenceType";

  /** Set Preference Level. Determines what preferences the user can set */
  void setPreferenceType(String PreferenceType);

  /** Get Preference Level. Determines what preferences the user can set */
  String getPreferenceType();

  /** Column name Supervisor_ID */
  String COLUMNNAME_Supervisor_ID = "Supervisor_ID";

  /** Set Supervisor. Supervisor for this user/organization - used for escalation and approval */
  void setSupervisor_ID(int Supervisor_ID);

  /** Get Supervisor. Supervisor for this user/organization - used for escalation and approval */
  int getSupervisor_ID();

  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Column name UserDiscount */
  String COLUMNNAME_UserDiscount = "UserDiscount";

  /** Set UserDiscount */
  void setUserDiscount(BigDecimal UserDiscount);

  /** Get UserDiscount */
  BigDecimal getUserDiscount();

  /** Column name UserLevel */
  String COLUMNNAME_UserLevel = "UserLevel";

  /** Set User Level. System Client Organization */
  void setUserLevel(String UserLevel);

  /** Get User Level. System Client Organization */
  String getUserLevel();
}
