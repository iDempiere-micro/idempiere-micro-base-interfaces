package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_PInstance_Log
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_PInstance_Log {

    /**
     * TableName=AD_PInstance_Log
     */
    String Table_Name = "AD_PInstance_Log";

    /**
     * AD_Table_ID=578
     */
    int Table_ID = 578;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_PInstance_ID
     */
    String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
    /**
     * Column name AD_PInstance_Log_UU
     */
    String COLUMNNAME_AD_PInstance_Log_UU = "AD_PInstance_Log_UU";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name Log_ID
     */
    String COLUMNNAME_Log_ID = "Log_ID";
    /**
     * Column name P_Date
     */
    String COLUMNNAME_P_Date = "P_Date";
    /**
     * Column name P_ID
     */
    String COLUMNNAME_P_ID = "P_ID";
    /**
     * Column name P_Msg
     */
    String COLUMNNAME_P_Msg = "P_Msg";
    /**
     * Column name P_Number
     */
    String COLUMNNAME_P_Number = "P_Number";
    /**
     * Column name Record_ID
     */
    String COLUMNNAME_Record_ID = "Record_ID";

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

}
