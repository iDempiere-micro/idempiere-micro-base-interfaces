package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

/**
 * Generated Interface for AD_Role
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Role extends PersistentObject {

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


    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name AD_Tree_Menu_ID
     */
    String COLUMNNAME_AD_Tree_Menu_ID = "AD_Tree_Menu_ID";
    /**
     * Column name AD_Tree_Org_ID
     */
    String COLUMNNAME_AD_Tree_Org_ID = "AD_Tree_Org_ID";
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
     * Column name UserLevel
     */
    String COLUMNNAME_UserLevel = "UserLevel";

    /**
     * Get Role. Responsibility Role
     */
    int getRoleId();

    /**
     * Get Organization Tree. Trees are used for (financial) reporting and security access (via role)
     */
    int getTreeOrgId();

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
    int getCurrencyId();

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

    void setParentRole(@NotNull I_AD_Role mRole);

    int getIncludedSeqNo();

    void setIncludedSeqNo(int seqNo);

    @NotNull
    List<I_AD_Role> getIncludedRoles(boolean recursive);

    void loadAccess(boolean reload);

    void mergeAccesses(boolean reload);

    List<OrganizationAccessSummary> getOrgAccess();

    List<I_AD_Table_Access> loadTableAccess(boolean reload);

    @Nullable
    List<I_AD_Column_Access> loadColumnAccess(boolean reload);

    @Nullable
    List<I_AD_Record_Access> getRecordAccessArray();

    @Nullable
    List<I_AD_Record_Access> getRecordDependentAccessArray();

    @Nullable
    HashMap<Integer, Boolean> getAccessMap(@NotNull String varname);
}
