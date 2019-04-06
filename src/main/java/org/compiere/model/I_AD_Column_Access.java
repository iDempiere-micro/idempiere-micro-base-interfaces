package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Column_Access
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Column_Access {

    /**
     * AD_Table_ID=571
     */
    int Table_ID = 571;

    /**
     * TableName=AD_Column_Access
     */
    String Table_Name = "AD_Column_Access";

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name AD_Column_ID
     */
    String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
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
     * Get Column. Column in the table
     */
    int getColumnId();

    /**
     * Get Role. Responsibility Role
     */
    int getRoleId();

    /**
     * Get Table. Database Table information
     */
    int getColumnTableId();

    /**
     * Set Exclude. Exclude access to the data - if not selected Include access to the data
     */
    void setIsExclude(boolean IsExclude);

    /**
     * Get Exclude. Exclude access to the data - if not selected Include access to the data
     */
    boolean isExclude();

    /**
     * Set Read Only. Field is read only
     */
    void setIsReadOnly(boolean IsReadOnly);

    /**
     * Get Read Only. Field is read only
     */
    boolean isReadOnly();

}
