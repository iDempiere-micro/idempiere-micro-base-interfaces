package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Ref_Table
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface ReferenceTable {

    /**
     * AD_Table_ID=103
     */
    int Table_ID = 103;

    /**
     * TableName=AD_Ref_Table
     */
    String Table_Name = "AD_Ref_Table";


    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);


    /**
     * Column name AD_Display
     */
    String COLUMNNAME_AD_Display = "AD_Display";
    /**
     * Column name AD_Key
     */
    String COLUMNNAME_AD_Key = "AD_Key";
    /**
     * Column name AD_Reference_ID
     */
    String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name IsValueDisplayed
     */
    String COLUMNNAME_IsValueDisplayed = "IsValueDisplayed";

    /**
     * Get Table. Database Table information
     */
    int getRefTableId();

    Table getTable() throws RuntimeException;

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Set Display Value. Displays Value column with the Display column
     */
    void setIsValueDisplayed(boolean IsValueDisplayed);

}
