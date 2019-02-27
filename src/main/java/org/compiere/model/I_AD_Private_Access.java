package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Private_Access
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Private_Access {

    /**
     * AD_Table_ID=627
     */
    int Table_ID = 627;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name Record_ID
     */
    String COLUMNNAME_Record_ID = "Record_ID";

    /**
     * Set Table. Database Table information
     */
    void setTableId(int AD_Table_ID);

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setUserId(int AD_User_ID);

    /**
     * Set Record ID. Direct internal record ID
     */
    void setRecordId(int Record_ID);

}
