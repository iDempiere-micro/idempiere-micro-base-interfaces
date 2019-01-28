package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_StorageProvider
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_StorageProvider {

    /**
     * TableName=AD_StorageProvider
     */
    String Table_Name = "AD_StorageProvider";

    /**
     * AD_Table_ID=200037
     */
    int Table_ID = 200037;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_StorageProvider_ID
     */
    String COLUMNNAME_AD_StorageProvider_ID = "AD_StorageProvider_ID";
    /**
     * Column name AD_StorageProvider_UU
     */
    String COLUMNNAME_AD_StorageProvider_UU = "AD_StorageProvider_UU";
    /**
     * Column name Folder
     */
    String COLUMNNAME_Folder = "Folder";
    /**
     * Column name Method
     */
    String COLUMNNAME_Method = "Method";
    /**
     * Column name Password
     */
    String COLUMNNAME_Password = "Password";
    /**
     * Column name URL
     */
    String COLUMNNAME_URL = "URL";
    /**
     * Column name UserName
     */
    String COLUMNNAME_UserName = "UserName";

    /**
     * Get Method
     */
    String getMethod();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

}
