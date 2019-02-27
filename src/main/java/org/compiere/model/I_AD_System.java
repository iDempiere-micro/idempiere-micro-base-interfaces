package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_System
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_System {

    /**
     * TableName=AD_System
     */
    String Table_Name = "AD_System";

    /**
     * AD_Table_ID=531
     */
    int Table_ID = 531;

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);


    /**
     * Column name AD_System_ID
     */
    String COLUMNNAME_AD_System_ID = "AD_System_ID";
    /**
     * Column name IDRangeEnd
     */
    String COLUMNNAME_IDRangeEnd = "IDRangeEnd";
    /**
     * Column name IsFailOnMissingModelValidator
     */
    String COLUMNNAME_IsFailOnMissingModelValidator = "IsFailOnMissingModelValidator";
    /**
     * Column name SupportUnits
     */
    String COLUMNNAME_SupportUnits = "SupportUnits";

    /**
     * Get ID Range End. End if the ID Range used
     */
    BigDecimal getIDRangeEnd();

}
