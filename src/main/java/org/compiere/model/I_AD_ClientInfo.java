package org.compiere.model;

import java.math.BigDecimal;

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
     * Get Storage Provider
     */
    int getAD_StorageProvider_ID();

    /**
     * Get Activity Tree. Trees are used for (financial) reporting
     */
    int getAD_Tree_Activity_ID();

    /**
     * Set Activity Tree. Trees are used for (financial) reporting
     */
    void setAD_Tree_Activity_ID(int AD_Tree_Activity_ID);

    /**
     * Get BPartner Tree. Trees are used for (financial) reporting
     */
    int getAD_Tree_BPartner_ID();

    /**
     * Set BPartner Tree. Trees are used for (financial) reporting
     */
    void setAD_Tree_BPartner_ID(int AD_Tree_BPartner_ID);

    /**
     * Get Campaign Tree. Trees are used for (financial) reporting
     */
    int getAD_Tree_Campaign_ID();

    /**
     * Set Campaign Tree. Trees are used for (financial) reporting
     */
    void setAD_Tree_Campaign_ID(int AD_Tree_Campaign_ID);

    /**
     * Get Menu Tree. Tree of the menu
     */
    int getAD_Tree_Menu_ID();

    /**
     * Set Menu Tree. Tree of the menu
     */
    void setAD_Tree_Menu_ID(int AD_Tree_Menu_ID);

    /**
     * Get Organization Tree. Trees are used for (financial) reporting and security access (via role)
     */
    int getAD_Tree_Org_ID();

    /**
     * Set Organization Tree. Trees are used for (financial) reporting and security access (via role)
     */
    void setAD_Tree_Org_ID(int AD_Tree_Org_ID);

    /**
     * Get Product Tree. Trees are used for (financial) reporting
     */
    int getAD_Tree_Product_ID();

    /**
     * Set Product Tree. Trees are used for (financial) reporting
     */
    void setAD_Tree_Product_ID(int AD_Tree_Product_ID);

    /**
     * Get Project Tree. Trees are used for (financial) reporting
     */
    int getAD_Tree_Project_ID();

    /**
     * Set Project Tree. Trees are used for (financial) reporting
     */
    void setAD_Tree_Project_ID(int AD_Tree_Project_ID);

    /**
     * Get Sales Region Tree. Trees are used for (financial) reporting
     */
    int getAD_Tree_SalesRegion_ID();

    /**
     * Set Sales Region Tree. Trees are used for (financial) reporting
     */
    void setAD_Tree_SalesRegion_ID(int AD_Tree_SalesRegion_ID);

    /**
     * Get Primary Accounting Schema. Primary rules for accounting
     */
    int getC_AcctSchema1_ID();

    /**
     * Get Template B.Partner. Business Partner used for creating new Business Partners on the fly
     */
    int getC_BPartnerCashTrx_ID();

    /**
     * Get Calendar. Accounting Calendar Name
     */
    int getC_Calendar_ID();

    /**
     * Get Charge for Freight
     */
    int getC_ChargeFreight_ID();

    /**
     * Get UOM for Length. Standard Unit of Measure for Length
     */
    int getC_UOM_Length_ID();

    /**
     * Get UOM for Weight. Standard Unit of Measure for Weight
     */
    int getC_UOM_Weight_ID();

    /**
     * Set Discount calculated from Line Amounts. Payment Discount calculation does not include Taxes
     * and Charges
     */
    void setIsDiscountLineAmt(boolean IsDiscountLineAmt);

    /**
     * Get Product for Freight
     */
    int getM_ProductFreight_ID();

    /**
     * Get Archive Store
     */
    int getStorageArchive_ID();

}
