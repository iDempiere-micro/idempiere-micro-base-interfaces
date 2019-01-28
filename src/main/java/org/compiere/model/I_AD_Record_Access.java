package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Record_Access
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Record_Access {

    /**
     * TableName=AD_Record_Access
     */
    String Table_Name = "AD_Record_Access";

    /**
     * AD_Table_ID=567
     */
    int Table_ID = 567;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Record_Access_UU
     */
    String COLUMNNAME_AD_Record_Access_UU = "AD_Record_Access_UU";
    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name IsDependentEntities
     */
    String COLUMNNAME_IsDependentEntities = "IsDependentEntities";
    /**
     * Column name IsExclude
     */
    String COLUMNNAME_IsExclude = "IsExclude";
    /**
     * Column name IsReadOnly
     */
    String COLUMNNAME_IsReadOnly = "IsReadOnly";
    /**
     * Column name Record_ID
     */
    String COLUMNNAME_Record_ID = "Record_ID";

    /**
     * Get Role. Responsibility Role
     */
    int getAD_Role_ID();

    /**
     * Set Role. Responsibility Role
     */
    void setAD_Role_ID(int AD_Role_ID);

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    /**
     * Set Dependent Entities. Also check access in dependent entities
     */
    void setIsDependentEntities(boolean IsDependentEntities);

    /**
     * Get Dependent Entities. Also check access in dependent entities
     */
    boolean isDependentEntities();

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

    /**
     * Get Record ID. Direct internal record ID
     */
    int getRecord_ID();

    /**
     * Set Record ID. Direct internal record ID
     */
    void setRecord_ID(int Record_ID);

}
