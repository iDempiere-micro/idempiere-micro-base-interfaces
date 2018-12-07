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
  /** Column name AD_Role_ID */
  String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
  /** Column name AD_Role_UU */
  String COLUMNNAME_AD_Role_UU = "AD_Role_UU";
  /** Column name AD_Tree_Menu_ID */
  String COLUMNNAME_AD_Tree_Menu_ID = "AD_Tree_Menu_ID";
  /** Column name AD_Tree_Org_ID */
  String COLUMNNAME_AD_Tree_Org_ID = "AD_Tree_Org_ID";
  /** Column name Allow_Info_Account */
  String COLUMNNAME_Allow_Info_Account = "Allow_Info_Account";
  /** Column name Allow_Info_Asset */
  String COLUMNNAME_Allow_Info_Asset = "Allow_Info_Asset";
  /** Column name Allow_Info_BPartner */
  String COLUMNNAME_Allow_Info_BPartner = "Allow_Info_BPartner";
  /** Column name Allow_Info_InOut */
  String COLUMNNAME_Allow_Info_InOut = "Allow_Info_InOut";
  /** Column name Allow_Info_Invoice */
  String COLUMNNAME_Allow_Info_Invoice = "Allow_Info_Invoice";
  /** Column name Allow_Info_Order */
  String COLUMNNAME_Allow_Info_Order = "Allow_Info_Order";
  /** Column name Allow_Info_Payment */
  String COLUMNNAME_Allow_Info_Payment = "Allow_Info_Payment";
  /** Column name Allow_Info_Product */
  String COLUMNNAME_Allow_Info_Product = "Allow_Info_Product";
  /** Column name Allow_Info_Resource */
  String COLUMNNAME_Allow_Info_Resource = "Allow_Info_Resource";
  /** Column name Allow_Info_Schedule */
  String COLUMNNAME_Allow_Info_Schedule = "Allow_Info_Schedule";
  /** Column name AmtApproval */
  String COLUMNNAME_AmtApproval = "AmtApproval";
  /** Column name AmtApprovalAccum */
  String COLUMNNAME_AmtApprovalAccum = "AmtApprovalAccum";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name ConfirmQueryRecords */
  String COLUMNNAME_ConfirmQueryRecords = "ConfirmQueryRecords";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DaysApprovalAccum */
  String COLUMNNAME_DaysApprovalAccum = "DaysApprovalAccum";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsAccessAdvanced */
  String COLUMNNAME_IsAccessAdvanced = "IsAccessAdvanced";
  /** Column name IsAccessAllOrgs */
  String COLUMNNAME_IsAccessAllOrgs = "IsAccessAllOrgs";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsCanApproveOwnDoc */
  String COLUMNNAME_IsCanApproveOwnDoc = "IsCanApproveOwnDoc";
  /** Column name IsCanExport */
  String COLUMNNAME_IsCanExport = "IsCanExport";
  /** Column name IsCanReport */
  String COLUMNNAME_IsCanReport = "IsCanReport";
  /** Column name IsChangeLog */
  String COLUMNNAME_IsChangeLog = "IsChangeLog";
  /** Column name IsDiscountAllowedOnTotal */
  String COLUMNNAME_IsDiscountAllowedOnTotal = "IsDiscountAllowedOnTotal";
  /** Column name IsDiscountUptoLimitPrice */
  String COLUMNNAME_IsDiscountUptoLimitPrice = "IsDiscountUptoLimitPrice";
  /** Column name IsManual */
  String COLUMNNAME_IsManual = "IsManual";
  /** Column name IsMasterRole */
  String COLUMNNAME_IsMasterRole = "IsMasterRole";
  /** Column name IsMenuAutoExpand */
  String COLUMNNAME_IsMenuAutoExpand = "IsMenuAutoExpand";
  /** Column name IsPersonalAccess */
  String COLUMNNAME_IsPersonalAccess = "IsPersonalAccess";
  /** Column name IsPersonalLock */
  String COLUMNNAME_IsPersonalLock = "IsPersonalLock";
  /** Column name IsShowAcct */
  String COLUMNNAME_IsShowAcct = "IsShowAcct";
  /** Column name IsUseUserOrgAccess */
  String COLUMNNAME_IsUseUserOrgAccess = "IsUseUserOrgAccess";
  /** Column name MaxQueryRecords */
  String COLUMNNAME_MaxQueryRecords = "MaxQueryRecords";
  /** Column name OverwritePriceLimit */
  String COLUMNNAME_OverwritePriceLimit = "OverwritePriceLimit";
  /** Column name PreferenceType */
  String COLUMNNAME_PreferenceType = "PreferenceType";
  /** Column name Supervisor_ID */
  String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name UserDiscount */
  String COLUMNNAME_UserDiscount = "UserDiscount";
  /** Column name UserLevel */
  String COLUMNNAME_UserLevel = "UserLevel";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Role. Responsibility Role */
  int getAD_Role_ID();

  /** Set Role. Responsibility Role */
  void setAD_Role_ID(int AD_Role_ID);

  /** Get AD_Role_UU */
  String getAD_Role_UU();

  /** Set AD_Role_UU */
  void setAD_Role_UU(String AD_Role_UU);

  /** Get Menu Tree. Tree of the menu */
  int getAD_Tree_Menu_ID();

  /** Set Menu Tree. Tree of the menu */
  void setAD_Tree_Menu_ID(int AD_Tree_Menu_ID);

  I_AD_Tree getAD_Tree_Menu() throws RuntimeException;

  /**
   * Get Organization Tree. Trees are used for (financial) reporting and security access (via role)
   */
  int getAD_Tree_Org_ID();

  /**
   * Set Organization Tree. Trees are used for (financial) reporting and security access (via role)
   */
  void setAD_Tree_Org_ID(int AD_Tree_Org_ID);

  I_AD_Tree getAD_Tree_Org() throws RuntimeException;

  /** Get Allow Info Account */
  boolean isAllow_Info_Account();

  /** Set Allow Info Account */
  void setAllow_Info_Account(boolean Allow_Info_Account);

  /** Get Allow Info Asset */
  boolean isAllow_Info_Asset();

  /** Set Allow Info Asset */
  void setAllow_Info_Asset(boolean Allow_Info_Asset);

  /** Get Allow Info BPartner */
  boolean isAllow_Info_BPartner();

  /** Set Allow Info BPartner */
  void setAllow_Info_BPartner(boolean Allow_Info_BPartner);

  /** Get Allow Info InOut */
  boolean isAllow_Info_InOut();

  /** Set Allow Info InOut */
  void setAllow_Info_InOut(boolean Allow_Info_InOut);

  /** Get Allow Info Invoice */
  boolean isAllow_Info_Invoice();

  /** Set Allow Info Invoice */
  void setAllow_Info_Invoice(boolean Allow_Info_Invoice);

  /** Get Allow Info Order */
  boolean isAllow_Info_Order();

  /** Set Allow Info Order */
  void setAllow_Info_Order(boolean Allow_Info_Order);

  /** Get Allow Info Payment */
  boolean isAllow_Info_Payment();

  /** Set Allow Info Payment */
  void setAllow_Info_Payment(boolean Allow_Info_Payment);

  /** Get Allow Info Product */
  boolean isAllow_Info_Product();

  /** Set Allow Info Product */
  void setAllow_Info_Product(boolean Allow_Info_Product);

  /** Get Allow Info Resource */
  boolean isAllow_Info_Resource();

  /** Set Allow Info Resource */
  void setAllow_Info_Resource(boolean Allow_Info_Resource);

  /** Get Allow Info Schedule */
  boolean isAllow_Info_Schedule();

  /** Set Allow Info Schedule */
  void setAllow_Info_Schedule(boolean Allow_Info_Schedule);

  /** Get Approval Amount. The approval amount limit for this role */
  BigDecimal getAmtApproval();

  /** Set Approval Amount. The approval amount limit for this role */
  void setAmtApproval(BigDecimal AmtApproval);

  /**
   * Get Approval Amount Accumulated. The approval amount limit for this role accumulated on a
   * period
   */
  BigDecimal getAmtApprovalAccum();

  /**
   * Set Approval Amount Accumulated. The approval amount limit for this role accumulated on a
   * period
   */
  void setAmtApprovalAccum(BigDecimal AmtApprovalAccum);

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  /**
   * Get Confirm Query Records. Require Confirmation if more records will be returned by the query
   * (If not defined 500)
   */
  int getConfirmQueryRecords();

  /**
   * Set Confirm Query Records. Require Confirmation if more records will be returned by the query
   * (If not defined 500)
   */
  void setConfirmQueryRecords(int ConfirmQueryRecords);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /**
   * Get Days Approval Accumulated. The days approval indicates the days to take into account to
   * verify the accumulated approval amount.
   */
  int getDaysApprovalAccum();

  /**
   * Set Days Approval Accumulated. The days approval indicates the days to take into account to
   * verify the accumulated approval amount.
   */
  void setDaysApprovalAccum(int DaysApprovalAccum);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Access Advanced */
  void setIsAccessAdvanced(boolean IsAccessAdvanced);

  /** Get Access Advanced */
  boolean isAccessAdvanced();

  /** Set Access all Orgs. Access all Organizations (no org access control) of the client */
  void setIsAccessAllOrgs(boolean IsAccessAllOrgs);

  /** Get Access all Orgs. Access all Organizations (no org access control) of the client */
  boolean isAccessAllOrgs();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Approve own Documents. Users with this role can approve their own documents */
  void setIsCanApproveOwnDoc(boolean IsCanApproveOwnDoc);

  /** Get Approve own Documents. Users with this role can approve their own documents */
  boolean isCanApproveOwnDoc();

  /** Set Can Export. Users with this role can export data */
  void setIsCanExport(boolean IsCanExport);

  /** Get Can Export. Users with this role can export data */
  boolean isCanExport();

  /** Set Can Report. Users with this role can create reports */
  void setIsCanReport(boolean IsCanReport);

  /** Get Can Report. Users with this role can create reports */
  boolean isCanReport();

  /** Set Maintain Change Log. Maintain a log of changes */
  void setIsChangeLog(boolean IsChangeLog);

  /** Get Maintain Change Log. Maintain a log of changes */
  boolean isChangeLog();

  /** Set IsDiscountAllowedOnTotal */
  void setIsDiscountAllowedOnTotal(boolean IsDiscountAllowedOnTotal);

  /** Get IsDiscountAllowedOnTotal */
  boolean isDiscountAllowedOnTotal();

  /** Set IsDiscountUptoLimitPrice */
  void setIsDiscountUptoLimitPrice(boolean IsDiscountUptoLimitPrice);

  /** Get IsDiscountUptoLimitPrice */
  boolean isDiscountUptoLimitPrice();

  /** Set Manual. This is a manual process */
  void setIsManual(boolean IsManual);

  /** Get Manual. This is a manual process */
  boolean isManual();

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

  /** Set Auto expand menu. If ticked, the menu is automatically expanded */
  void setIsMenuAutoExpand(boolean IsMenuAutoExpand);

  /** Get Auto expand menu. If ticked, the menu is automatically expanded */
  boolean isMenuAutoExpand();

  /** Set Personal Access. Allow access to all personal records */
  void setIsPersonalAccess(boolean IsPersonalAccess);

  /** Get Personal Access. Allow access to all personal records */
  boolean isPersonalAccess();

  /** Set Personal Lock. Allow users with role to lock access to personal records */
  void setIsPersonalLock(boolean IsPersonalLock);

  /** Get Personal Lock. Allow users with role to lock access to personal records */
  boolean isPersonalLock();

  /** Set Show Accounting. Users with this role can see accounting information */
  void setIsShowAcct(boolean IsShowAcct);

  /** Get Show Accounting. Users with this role can see accounting information */
  boolean isShowAcct();

  /** Set Use User Org Access. Use Org Access defined by user instead of Role Org Access */
  void setIsUseUserOrgAccess(boolean IsUseUserOrgAccess);

  /** Get Use User Org Access. Use Org Access defined by user instead of Role Org Access */
  boolean isUseUserOrgAccess();

  /**
   * Get Max Query Records. If defined, you cannot query more records as defined - the query
   * criteria needs to be changed to query less records
   */
  int getMaxQueryRecords();

  /**
   * Set Max Query Records. If defined, you cannot query more records as defined - the query
   * criteria needs to be changed to query less records
   */
  void setMaxQueryRecords(int MaxQueryRecords);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Overwrite Price Limit. Overwrite Price Limit if the Price List enforces the Price Limit */
  boolean isOverwritePriceLimit();

  /** Set Overwrite Price Limit. Overwrite Price Limit if the Price List enforces the Price Limit */
  void setOverwritePriceLimit(boolean OverwritePriceLimit);

  /** Get Preference Level. Determines what preferences the user can set */
  String getPreferenceType();

  /** Set Preference Level. Determines what preferences the user can set */
  void setPreferenceType(String PreferenceType);

  /** Get Supervisor. Supervisor for this user/organization - used for escalation and approval */
  int getSupervisor_ID();

  /** Set Supervisor. Supervisor for this user/organization - used for escalation and approval */
  void setSupervisor_ID(int Supervisor_ID);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get UserDiscount */
  BigDecimal getUserDiscount();

  /** Set UserDiscount */
  void setUserDiscount(BigDecimal UserDiscount);

  /** Get User Level. System Client Organization */
  String getUserLevel();

  /** Set User Level. System Client Organization */
  void setUserLevel(String UserLevel);
}
