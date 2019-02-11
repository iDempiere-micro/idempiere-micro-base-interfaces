package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Role
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Role {

    /**
     * TableName=AD_Role
     */
    String Table_Name = "AD_Role";

    /**
     * AD_Table_ID=156
     */
    int Table_ID = 156;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name AD_Role_UU
     */
    String COLUMNNAME_AD_Role_UU = "AD_Role_UU";
    /**
     * Column name AD_Tree_Menu_ID
     */
    String COLUMNNAME_AD_Tree_Menu_ID = "AD_Tree_Menu_ID";
    /**
     * Column name AD_Tree_Org_ID
     */
    String COLUMNNAME_AD_Tree_Org_ID = "AD_Tree_Org_ID";
    /**
     * Column name Allow_Info_Account
     */
    String COLUMNNAME_Allow_Info_Account = "Allow_Info_Account";
    /**
     * Column name Allow_Info_Asset
     */
    String COLUMNNAME_Allow_Info_Asset = "Allow_Info_Asset";
    /**
     * Column name Allow_Info_BPartner
     */
    String COLUMNNAME_Allow_Info_BPartner = "Allow_Info_BPartner";
    /**
     * Column name Allow_Info_InOut
     */
    String COLUMNNAME_Allow_Info_InOut = "Allow_Info_InOut";
    /**
     * Column name Allow_Info_Invoice
     */
    String COLUMNNAME_Allow_Info_Invoice = "Allow_Info_Invoice";
    /**
     * Column name Allow_Info_Order
     */
    String COLUMNNAME_Allow_Info_Order = "Allow_Info_Order";
    /**
     * Column name Allow_Info_Payment
     */
    String COLUMNNAME_Allow_Info_Payment = "Allow_Info_Payment";
    /**
     * Column name Allow_Info_Product
     */
    String COLUMNNAME_Allow_Info_Product = "Allow_Info_Product";
    /**
     * Column name Allow_Info_Resource
     */
    String COLUMNNAME_Allow_Info_Resource = "Allow_Info_Resource";
    /**
     * Column name Allow_Info_Schedule
     */
    String COLUMNNAME_Allow_Info_Schedule = "Allow_Info_Schedule";
    /**
     * Column name AmtApproval
     */
    String COLUMNNAME_AmtApproval = "AmtApproval";
    /**
     * Column name AmtApprovalAccum
     */
    String COLUMNNAME_AmtApprovalAccum = "AmtApprovalAccum";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name ConfirmQueryRecords
     */
    String COLUMNNAME_ConfirmQueryRecords = "ConfirmQueryRecords";
    /**
     * Column name DaysApprovalAccum
     */
    String COLUMNNAME_DaysApprovalAccum = "DaysApprovalAccum";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsAccessAdvanced
     */
    String COLUMNNAME_IsAccessAdvanced = "IsAccessAdvanced";
    /**
     * Column name IsAccessAllOrgs
     */
    String COLUMNNAME_IsAccessAllOrgs = "IsAccessAllOrgs";
    /**
     * Column name IsCanApproveOwnDoc
     */
    String COLUMNNAME_IsCanApproveOwnDoc = "IsCanApproveOwnDoc";
    /**
     * Column name IsCanExport
     */
    String COLUMNNAME_IsCanExport = "IsCanExport";
    /**
     * Column name IsCanReport
     */
    String COLUMNNAME_IsCanReport = "IsCanReport";
    /**
     * Column name IsChangeLog
     */
    String COLUMNNAME_IsChangeLog = "IsChangeLog";
    /**
     * Column name IsDiscountAllowedOnTotal
     */
    String COLUMNNAME_IsDiscountAllowedOnTotal = "IsDiscountAllowedOnTotal";
    /**
     * Column name IsDiscountUptoLimitPrice
     */
    String COLUMNNAME_IsDiscountUptoLimitPrice = "IsDiscountUptoLimitPrice";
    /**
     * Column name IsManual
     */
    String COLUMNNAME_IsManual = "IsManual";
    /**
     * Column name IsMasterRole
     */
    String COLUMNNAME_IsMasterRole = "IsMasterRole";
    /**
     * Column name IsMenuAutoExpand
     */
    String COLUMNNAME_IsMenuAutoExpand = "IsMenuAutoExpand";
    /**
     * Column name IsPersonalAccess
     */
    String COLUMNNAME_IsPersonalAccess = "IsPersonalAccess";
    /**
     * Column name IsPersonalLock
     */
    String COLUMNNAME_IsPersonalLock = "IsPersonalLock";
    /**
     * Column name IsShowAcct
     */
    String COLUMNNAME_IsShowAcct = "IsShowAcct";
    /**
     * Column name IsUseUserOrgAccess
     */
    String COLUMNNAME_IsUseUserOrgAccess = "IsUseUserOrgAccess";
    /**
     * Column name MaxQueryRecords
     */
    String COLUMNNAME_MaxQueryRecords = "MaxQueryRecords";
    /**
     * Column name OverwritePriceLimit
     */
    String COLUMNNAME_OverwritePriceLimit = "OverwritePriceLimit";
    /**
     * Column name PreferenceType
     */
    String COLUMNNAME_PreferenceType = "PreferenceType";
    /**
     * Column name Supervisor_ID
     */
    String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
    /**
     * Column name UserDiscount
     */
    String COLUMNNAME_UserDiscount = "UserDiscount";
    /**
     * Column name UserLevel
     */
    String COLUMNNAME_UserLevel = "UserLevel";

    /**
     * Get Role. Responsibility Role
     */
    int getAD_Role_ID();

    /**
     * Get Menu Tree. Tree of the menu
     */
    int getAD_Tree_Menu_ID();

    /**
     * Get Organization Tree. Trees are used for (financial) reporting and security access (via role)
     */
    int getAD_Tree_Org_ID();

    /**
     * Get Approval Amount. The approval amount limit for this role
     */
    BigDecimal getAmtApproval();

    /**
     * Get Approval Amount Accumulated. The approval amount limit for this role accumulated on a
     * period
     */
    BigDecimal getAmtApprovalAccum();

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

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

    /**
     * Get Days Approval Accumulated. The days approval indicates the days to take into account to
     * verify the accumulated approval amount.
     */
    int getDaysApprovalAccum();

    /**
     * Set Access Advanced
     */
    void setIsAccessAdvanced(boolean IsAccessAdvanced);

    /**
     * Get Access Advanced
     */
    boolean isAccessAdvanced();

    /**
     * Set Access all Orgs. Access all Organizations (no org access control) of the client
     */
    void setIsAccessAllOrgs(boolean IsAccessAllOrgs);

    /**
     * Get Access all Orgs. Access all Organizations (no org access control) of the client
     */
    boolean isAccessAllOrgs();

    /**
     * Get Approve own Documents. Users with this role can approve their own documents
     */
    boolean isCanApproveOwnDoc();

    /**
     * Set Can Export. Users with this role can export data
     */
    void setIsCanExport(boolean IsCanExport);

    /**
     * Get Can Export. Users with this role can export data
     */
    boolean isCanExport();

    /**
     * Set Can Report. Users with this role can create reports
     */
    void setIsCanReport(boolean IsCanReport);

    /**
     * Get Can Report. Users with this role can create reports
     */
    boolean isCanReport();

    /**
     * Set Maintain Change Log. Maintain a log of changes
     */
    void setIsChangeLog(boolean IsChangeLog);

    /**
     * Set Manual. This is a manual process
     */
    void setIsManual(boolean IsManual);

    /**
     * Get Manual. This is a manual process
     */
    boolean isManual();

    /**
     * Get Master Role. A master role cannot be assigned to users, it is intended to define access to
     * menu option and documents and inherit to other roles
     */
    boolean isMasterRole();

    /**
     * Get Auto expand menu. If ticked, the menu is automatically expanded
     */
    boolean isMenuAutoExpand();

    /**
     * Set Personal Access. Allow access to all personal records
     */
    void setIsPersonalAccess(boolean IsPersonalAccess);

    /**
     * Get Personal Access. Allow access to all personal records
     */
    boolean isPersonalAccess();

    /**
     * Set Personal Lock. Allow users with role to lock access to personal records
     */
    void setIsPersonalLock(boolean IsPersonalLock);

    /**
     * Set Show Accounting. Users with this role can see accounting information
     */
    void setIsShowAcct(boolean IsShowAcct);

    /**
     * Set Use User Org Access. Use Org Access defined by user instead of Role Org Access
     */
    void setIsUseUserOrgAccess(boolean IsUseUserOrgAccess);

    /**
     * Get Use User Org Access. Use Org Access defined by user instead of Role Org Access
     */
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

    /**
     * Get Overwrite Price Limit. Overwrite Price Limit if the Price List enforces the Price Limit
     */
    boolean isOverwritePriceLimit();

    /**
     * Set Overwrite Price Limit. Overwrite Price Limit if the Price List enforces the Price Limit
     */
    void setOverwritePriceLimit(boolean OverwritePriceLimit);

    /**
     * Get Preference Level. Determines what preferences the user can set
     */
    String getPreferenceType();

    /**
     * Set Preference Level. Determines what preferences the user can set
     */
    void setPreferenceType(String PreferenceType);

    /**
     * Get User Level. System Client Organization
     */
    String getUserLevel();

    /**
     * Set User Level. System Client Organization
     */
    void setUserLevel(String UserLevel);
}
