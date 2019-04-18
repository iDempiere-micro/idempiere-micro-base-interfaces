package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_ClientInfo
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface ClientInfo {

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
     * Column name C_UOM_Weight_ID
     */
    String COLUMNNAME_C_UOM_Weight_ID = "C_UOM_Weight_ID";
    /**
     * Column name IsDiscountLineAmt
     */
    String COLUMNNAME_IsDiscountLineAmt = "IsDiscountLineAmt";
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
    int getStorageProviderId();

    /**
     * Set Activity Tree. Trees are used for (financial) reporting
     */
    void setTreeActivityId(int AD_Tree_Activity_ID);

    /**
     * Set BPartner Tree. Trees are used for (financial) reporting
     */
    void setTreeBPartnerId(int AD_Tree_BPartner_ID);

    /**
     * Set Campaign Tree. Trees are used for (financial) reporting
     */
    void setTreeCampaignId(int AD_Tree_Campaign_ID);

    /**
     * Set Menu Tree. Tree of the menu
     */
    void setTreeMenuId(int AD_Tree_Menu_ID);

    /**
     * Get Organization Tree. Trees are used for (financial) reporting and security access (via role)
     */
    int getTreeOrgId();

    /**
     * Set Organization Tree. Trees are used for (financial) reporting and security access (via role)
     */
    void setTreeOrgId(int AD_Tree_Org_ID);

    /**
     * Set Product Tree. Trees are used for (financial) reporting
     */
    void setTreeProductId(int AD_Tree_Product_ID);

    /**
     * Set Project Tree. Trees are used for (financial) reporting
     */
    void setTreeProjectId(int AD_Tree_Project_ID);

    /**
     * Set Sales Region Tree. Trees are used for (financial) reporting
     */
    void setTreeSalesRegionId(int AD_Tree_SalesRegion_ID);

    /**
     * Get Primary Accounting Schema. Primary rules for accounting
     */
    int getAcctSchema1Id();

    /**
     * Get Template B.Partner. Business Partner used for creating new Business Partners on the fly
     */
    int getBPartnerCashTrxId();

    /**
     * Get Calendar. Accounting Calendar Name
     */
    int getCalendarId();

    /**
     * Get Charge for Freight
     */
    int getChargeFreightId();

    /**
     * Get UOM for Length. Standard Unit of Measure for Length
     */
    int getUOMLengthId();

    /**
     * Get UOM for Weight. Standard Unit of Measure for Weight
     */
    int getUOMWeightId();

    /**
     * Set Discount calculated from Line Amounts. Payment Discount calculation does not include Taxes
     * and Charges
     */
    void setIsDiscountLineAmt(boolean IsDiscountLineAmt);

    /**
     * Get Product for Freight
     */
    int getProductFreightId();

}
