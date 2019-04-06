package org.compiere.model;

/**
 * Generated Interface for AD_User_OrgAccess
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_User_OrgAccess extends BaseOrgAccess {

    /**
     * AD_Table_ID=769
     */
    int Table_ID = 769;

    /**
     * TableName=AD_User_OrgAccess
     */
    String Table_Name = "AD_User_OrgAccess";

    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";


    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getUserId();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setUserId(int AD_User_ID);
}
