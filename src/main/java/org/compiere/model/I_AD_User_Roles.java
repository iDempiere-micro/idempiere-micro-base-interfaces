package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_User_Roles
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_User_Roles {

    /**
     * TableName=AD_User_Roles
     */
    String Table_Name = "AD_User_Roles";

    /**
     * AD_Table_ID=157
     */
    int Table_ID = 157;

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
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";

    /**
     * Get Role. Responsibility Role
     */
    int getAD_Role_ID();

    /**
     * Set Role. Responsibility Role
     */
    void setAD_Role_ID(int AD_Role_ID);

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

}
