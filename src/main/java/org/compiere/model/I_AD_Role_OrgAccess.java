package org.compiere.model;

/**
 * Generated Interface for AD_Role_OrgAccess
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Role_OrgAccess extends BaseOrgAccess {

    /**
     * AD_Table_ID=422
     */
    int Table_ID = 422;

    /**
     * TableName=AD_Role_OrgAccess
     */
    String Table_Name = "AD_Role_OrgAccess";

    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";

    /**
     * Get Role. Responsibility Role
     */
    int getRoleId();

    /**
     * Set Role. Responsibility Role
     */
    void setRoleId(int AD_Role_ID);
}
