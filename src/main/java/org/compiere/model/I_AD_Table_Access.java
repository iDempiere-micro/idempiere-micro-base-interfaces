package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Table_Access
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Table_Access {

    /**
     * AD_Table_ID=565
     */
    int Table_ID = 565;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);



    /**
     * Column name AccessTypeRule
     */
    String COLUMNNAME_AccessTypeRule = "AccessTypeRule";
    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name IsExclude
     */
    String COLUMNNAME_IsExclude = "IsExclude";
    /**
     * Column name IsReadOnly
     */
    String COLUMNNAME_IsReadOnly = "IsReadOnly";

    /**
     * Get Access Type. The type of access for this rule
     */
    String getAccessTypeRule();

    /**
     * Get Role. Responsibility Role
     */
    int getRoleId();

    /**
     * Get Table. Database Table information
     */
    int getAccessTableId();

    /**
     * Set Exclude. Exclude access to the data - if not selected Include access to the data
     */
    void setIsExclude(boolean IsExclude);

    /**
     * Get Exclude. Exclude access to the data - if not selected Include access to the data
     */
    boolean isExclude();

    /**
     * Get Read Only. Field is read only
     */
    boolean isReadOnly();

}
