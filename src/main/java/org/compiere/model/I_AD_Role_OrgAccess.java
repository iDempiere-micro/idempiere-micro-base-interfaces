package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Role_OrgAccess
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Role_OrgAccess {

    /**
     * AD_Table_ID=422
     */
    int Table_ID = 422;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);



    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name IsReadOnly
     */
    String COLUMNNAME_IsReadOnly = "IsReadOnly";

    /**
     * Get Role. Responsibility Role
     */
    int getRoleId();

    /**
     * Set Role. Responsibility Role
     */
    void setRoleId(int AD_Role_ID);

    /**
     * Set Read Only. Field is read only
     */
    void setIsReadOnly(boolean IsReadOnly);

    /**
     * Get Read Only. Field is read only
     */
    boolean isReadOnly();

}
