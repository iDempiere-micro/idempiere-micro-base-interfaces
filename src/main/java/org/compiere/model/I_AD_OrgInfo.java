package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_OrgInfo
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_OrgInfo {

    /**
     * TableName=AD_OrgInfo
     */
    String Table_Name = "AD_OrgInfo";

    /**
     * AD_Table_ID=228
     */
    int Table_ID = 228;

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /* Load Meta Data */

    /**
     * Column name AD_OrgType_ID
     */
    String COLUMNNAME_AD_OrgType_ID = "AD_OrgType_ID";
    /**
     * Column name C_Calendar_ID
     */
    String COLUMNNAME_C_Calendar_ID = "C_Calendar_ID";
    /**
     * Column name C_Location_ID
     */
    String COLUMNNAME_C_Location_ID = "C_Location_ID";
    /**
     * Column name DropShip_Warehouse_ID
     */
    String COLUMNNAME_DropShip_Warehouse_ID = "DropShip_Warehouse_ID";
    /**
     * Column name DUNS
     */
    String COLUMNNAME_DUNS = "DUNS";
    /**
     * Column name EMail
     */
    String COLUMNNAME_EMail = "EMail";
    /**
     * Column name Fax
     */
    String COLUMNNAME_Fax = "Fax";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name Parent_Org_ID
     */
    String COLUMNNAME_Parent_Org_ID = "Parent_Org_ID";
    /**
     * Column name Phone
     */
    String COLUMNNAME_Phone = "Phone";
    /**
     * Column name Phone2
     */
    String COLUMNNAME_Phone2 = "Phone2";
    /**
     * Column name Supervisor_ID
     */
    String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
    /**
     * Column name TaxID
     */
    String COLUMNNAME_TaxID = "TaxID";

    /**
     * Set Organization Type. Organization Type
     */
    void setOrgTypeId(int AD_OrgType_ID);

    /**
     * Get Calendar. Accounting Calendar Name
     */
    int getCalendarId();

    /**
     * Get Address. Location or Address
     */
    int getLocationId();

    /**
     * Set Address. Location or Address
     */
    void setLocationId(int C_Location_ID);

    /**
     * Get Drop Ship Warehouse. The (logical) warehouse to use for recording drop ship receipts and
     * shipments.
     */
    int getDropShipWarehouseId();

    /**
     * Set D-U-N-S. Dun & Bradstreet Number
     */
    void setDUNS(String DUNS);

    /**
     * Set EMail Address. Electronic Mail Address
     */
    void setEMail(String EMail);

    /**
     * Set Fax. Facsimile number
     */
    void setFax(String Fax);

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getWarehouseId();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    void setWarehouseId(int M_Warehouse_ID);

    /**
     * Get Parent Organization. Parent (superior) Organization
     */
    int getParentOrgId();

    /**
     * Set Phone. Identifies a telephone number
     */
    void setPhone(String Phone);

    /**
     * Set 2nd Phone. Identifies an alternate telephone number.
     */
    void setPhone2(String Phone2);

    /**
     * Get Supervisor. Supervisor for this user/organization - used for escalation and approval
     */
    int getSupervisorId();

    /**
     * Set Tax ID. Tax Identification
     */
    void setTaxID(String TaxID);

}
