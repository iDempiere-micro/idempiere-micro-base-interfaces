package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ClientInfo
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ClientInfo {

    /**
     * TableName=AD_ClientInfo
     */
    String Table_Name = "AD_ClientInfo";

    /**
     * AD_Table_ID=227
     */
    int Table_ID = 227;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_ClientInfo_UU
     */
    String COLUMNNAME_AD_ClientInfo_UU = "AD_ClientInfo_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_StorageProvider_ID
     */
    String COLUMNNAME_AD_StorageProvider_ID = "AD_StorageProvider_ID";
    /**
     * Column name AD_Tree_Activity_ID
     */
    String COLUMNNAME_AD_Tree_Activity_ID = "AD_Tree_Activity_ID";
    /**
     * Column name AD_Tree_BPartner_ID
     */
    String COLUMNNAME_AD_Tree_BPartner_ID = "AD_Tree_BPartner_ID";
    /**
     * Column name AD_Tree_Campaign_ID
     */
    String COLUMNNAME_AD_Tree_Campaign_ID = "AD_Tree_Campaign_ID";
    /**
     * Column name AD_Tree_Menu_ID
     */
    String COLUMNNAME_AD_Tree_Menu_ID = "AD_Tree_Menu_ID";
    /**
     * Column name AD_Tree_Org_ID
     */
    String COLUMNNAME_AD_Tree_Org_ID = "AD_Tree_Org_ID";
    /**
     * Column name AD_Tree_Product_ID
     */
    String COLUMNNAME_AD_Tree_Product_ID = "AD_Tree_Product_ID";
    /**
     * Column name AD_Tree_Project_ID
     */
    String COLUMNNAME_AD_Tree_Project_ID = "AD_Tree_Project_ID";
    /**
     * Column name AD_Tree_SalesRegion_ID
     */
    String COLUMNNAME_AD_Tree_SalesRegion_ID = "AD_Tree_SalesRegion_ID";
    /**
     * Column name C_AcctSchema1_ID
     */
    String COLUMNNAME_C_AcctSchema1_ID = "C_AcctSchema1_ID";
    /**
     * Column name C_BPartnerCashTrx_ID
     */
    String COLUMNNAME_C_BPartnerCashTrx_ID = "C_BPartnerCashTrx_ID";
    /**
     * Column name C_Calendar_ID
     */
    String COLUMNNAME_C_Calendar_ID = "C_Calendar_ID";
    /**
     * Column name C_ChargeFreight_ID
     */
    String COLUMNNAME_C_ChargeFreight_ID = "C_ChargeFreight_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_UOM_Length_ID
     */
    String COLUMNNAME_C_UOM_Length_ID = "C_UOM_Length_ID";
    /**
     * Column name C_UOM_Time_ID
     */
    String COLUMNNAME_C_UOM_Time_ID = "C_UOM_Time_ID";
    /**
     * Column name C_UOM_Volume_ID
     */
    String COLUMNNAME_C_UOM_Volume_ID = "C_UOM_Volume_ID";
    /**
     * Column name C_UOM_Weight_ID
     */
    String COLUMNNAME_C_UOM_Weight_ID = "C_UOM_Weight_ID";
    /**
     * Column name FY_StartDate
     */
    String COLUMNNAME_FY_StartDate = "FY_StartDate";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsConfirmOnDocClose
     */
    String COLUMNNAME_IsConfirmOnDocClose = "IsConfirmOnDocClose";
    /**
     * Column name IsConfirmOnDocVoid
     */
    String COLUMNNAME_IsConfirmOnDocVoid = "IsConfirmOnDocVoid";
    /**
     * Column name IsDiscountLineAmt
     */
    String COLUMNNAME_IsDiscountLineAmt = "IsDiscountLineAmt";
    /**
     * Column name KeepLogDays
     */
    String COLUMNNAME_KeepLogDays = "KeepLogDays";
    /**
     * Column name Logo_ID
     */
    String COLUMNNAME_Logo_ID = "Logo_ID";
    /**
     * Column name LogoReport_ID
     */
    String COLUMNNAME_LogoReport_ID = "LogoReport_ID";
    /**
     * Column name LogoWeb_ID
     */
    String COLUMNNAME_LogoWeb_ID = "LogoWeb_ID";
    /**
     * Column name M_ProductFreight_ID
     */
    String COLUMNNAME_M_ProductFreight_ID = "M_ProductFreight_ID";
    /**
     * Column name StorageArchive_ID
     */
    String COLUMNNAME_StorageArchive_ID = "StorageArchive_ID";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get AD_ClientInfo_UU
     */
    String getAD_ClientInfo_UU();

    /**
     * Set AD_ClientInfo_UU
     */
    void setAD_ClientInfo_UU(String AD_ClientInfo_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Storage Provider
     */
    int getAD_StorageProvider_ID();

    /**
     * Set Storage Provider
     */
    void setAD_StorageProvider_ID(int AD_StorageProvider_ID);

    I_AD_StorageProvider getAD_StorageProvider() throws RuntimeException;

    /**
     * Get Activity Tree. Trees are used for (financial) reporting
     */
    int getAD_Tree_Activity_ID();

    /**
     * Set Activity Tree. Trees are used for (financial) reporting
     */
    void setAD_Tree_Activity_ID(int AD_Tree_Activity_ID);

    I_AD_Tree getAD_Tree_Activity() throws RuntimeException;

    /**
     * Get BPartner Tree. Trees are used for (financial) reporting
     */
    int getAD_Tree_BPartner_ID();

    /**
     * Set BPartner Tree. Trees are used for (financial) reporting
     */
    void setAD_Tree_BPartner_ID(int AD_Tree_BPartner_ID);

    I_AD_Tree getAD_Tree_BPartner() throws RuntimeException;

    /**
     * Get Campaign Tree. Trees are used for (financial) reporting
     */
    int getAD_Tree_Campaign_ID();

    /**
     * Set Campaign Tree. Trees are used for (financial) reporting
     */
    void setAD_Tree_Campaign_ID(int AD_Tree_Campaign_ID);

    I_AD_Tree getAD_Tree_Campaign() throws RuntimeException;

    /**
     * Get Menu Tree. Tree of the menu
     */
    int getAD_Tree_Menu_ID();

    /**
     * Set Menu Tree. Tree of the menu
     */
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

    /**
     * Get Product Tree. Trees are used for (financial) reporting
     */
    int getAD_Tree_Product_ID();

    /**
     * Set Product Tree. Trees are used for (financial) reporting
     */
    void setAD_Tree_Product_ID(int AD_Tree_Product_ID);

    I_AD_Tree getAD_Tree_Product() throws RuntimeException;

    /**
     * Get Project Tree. Trees are used for (financial) reporting
     */
    int getAD_Tree_Project_ID();

    /**
     * Set Project Tree. Trees are used for (financial) reporting
     */
    void setAD_Tree_Project_ID(int AD_Tree_Project_ID);

    I_AD_Tree getAD_Tree_Project() throws RuntimeException;

    /**
     * Get Sales Region Tree. Trees are used for (financial) reporting
     */
    int getAD_Tree_SalesRegion_ID();

    /**
     * Set Sales Region Tree. Trees are used for (financial) reporting
     */
    void setAD_Tree_SalesRegion_ID(int AD_Tree_SalesRegion_ID);

    I_AD_Tree getAD_Tree_SalesRegion() throws RuntimeException;

    /**
     * Get Primary Accounting Schema. Primary rules for accounting
     */
    int getC_AcctSchema1_ID();

    /**
     * Set Primary Accounting Schema. Primary rules for accounting
     */
    void setC_AcctSchema1_ID(int C_AcctSchema1_ID);

    /**
     * Get Template B.Partner. Business Partner used for creating new Business Partners on the fly
     */
    int getC_BPartnerCashTrx_ID();

    /**
     * Set Template B.Partner. Business Partner used for creating new Business Partners on the fly
     */
    void setC_BPartnerCashTrx_ID(int C_BPartnerCashTrx_ID);

    /**
     * Get Calendar. Accounting Calendar Name
     */
    int getC_Calendar_ID();

    /**
     * Set Calendar. Accounting Calendar Name
     */
    void setC_Calendar_ID(int C_Calendar_ID);

    /**
     * Get Charge for Freight
     */
    int getC_ChargeFreight_ID();

    /**
     * Set Charge for Freight
     */
    void setC_ChargeFreight_ID(int C_ChargeFreight_ID);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get UOM for Length. Standard Unit of Measure for Length
     */
    int getC_UOM_Length_ID();

    /**
     * Set UOM for Length. Standard Unit of Measure for Length
     */
    void setC_UOM_Length_ID(int C_UOM_Length_ID);

    /**
     * Get UOM for Time. Standard Unit of Measure for Time
     */
    int getC_UOM_Time_ID();

    /**
     * Set UOM for Time. Standard Unit of Measure for Time
     */
    void setC_UOM_Time_ID(int C_UOM_Time_ID);

    /**
     * Get UOM for Volume. Standard Unit of Measure for Volume
     */
    int getC_UOM_Volume_ID();

    /**
     * Set UOM for Volume. Standard Unit of Measure for Volume
     */
    void setC_UOM_Volume_ID(int C_UOM_Volume_ID);

    /**
     * Get UOM for Weight. Standard Unit of Measure for Weight
     */
    int getC_UOM_Weight_ID();

    /**
     * Set UOM for Weight. Standard Unit of Measure for Weight
     */
    void setC_UOM_Weight_ID(int C_UOM_Weight_ID);

    /**
     * Get Financial Year Start Date
     */
    Timestamp getFY_StartDate();

    /**
     * Set Financial Year Start Date
     */
    void setFY_StartDate(Timestamp FY_StartDate);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Show Confirmation On Document Action Close
     */
    void setIsConfirmOnDocClose(boolean IsConfirmOnDocClose);

    /**
     * Get Show Confirmation On Document Action Close
     */
    boolean isConfirmOnDocClose();

    /**
     * Set Show Confirmation On Document Action Void
     */
    void setIsConfirmOnDocVoid(boolean IsConfirmOnDocVoid);

    /**
     * Get Show Confirmation On Document Action Void
     */
    boolean isConfirmOnDocVoid();

    /**
     * Set Discount calculated from Line Amounts. Payment Discount calculation does not include Taxes
     * and Charges
     */
    void setIsDiscountLineAmt(boolean IsDiscountLineAmt);

    /**
     * Get Discount calculated from Line Amounts. Payment Discount calculation does not include Taxes
     * and Charges
     */
    boolean isDiscountLineAmt();

    /**
     * Get Days to keep Log. Number of days to keep the log entries
     */
    int getKeepLogDays();

    /**
     * Set Days to keep Log. Number of days to keep the log entries
     */
    void setKeepLogDays(int KeepLogDays);

    /**
     * Get Logo
     */
    int getLogo_ID();

    /**
     * Set Logo
     */
    void setLogo_ID(int Logo_ID);

    /**
     * Get Logo Report
     */
    int getLogoReport_ID();

    /**
     * Set Logo Report
     */
    void setLogoReport_ID(int LogoReport_ID);

    /**
     * Get Logo Web
     */
    int getLogoWeb_ID();

    /**
     * Set Logo Web
     */
    void setLogoWeb_ID(int LogoWeb_ID);

    /**
     * Get Product for Freight
     */
    int getM_ProductFreight_ID();

    /**
     * Set Product for Freight
     */
    void setM_ProductFreight_ID(int M_ProductFreight_ID);

    /**
     * Get Archive Store
     */
    int getStorageArchive_ID();

    /**
     * Set Archive Store
     */
    void setStorageArchive_ID(int StorageArchive_ID);

    I_AD_StorageProvider getStorageArchive() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
