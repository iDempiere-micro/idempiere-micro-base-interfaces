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
     * AD_Table_ID=200037
     */
    int Table_ID = 200037;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name Method
     */
    String COLUMNNAME_Method = "Method";

    /**
     * Get Method
     */
    String getMethod();

}
