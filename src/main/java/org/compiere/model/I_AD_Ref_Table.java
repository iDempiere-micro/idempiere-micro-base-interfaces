package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Ref_Table
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Ref_Table {

    /**
     * TableName=AD_Ref_Table
     */
    String Table_Name = "AD_Ref_Table";

    /**
     * AD_Table_ID=103
     */
    int Table_ID = 103;

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Display
     */
    String COLUMNNAME_AD_Display = "AD_Display";
    /**
     * Column name AD_InfoWindow_ID
     */
    String COLUMNNAME_AD_InfoWindow_ID = "AD_InfoWindow_ID";
    /**
     * Column name AD_Key
     */
    String COLUMNNAME_AD_Key = "AD_Key";
    /**
     * Column name AD_Reference_ID
     */
    String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
    /**
     * Column name AD_Ref_Table_UU
     */
    String COLUMNNAME_AD_Ref_Table_UU = "AD_Ref_Table_UU";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_Window_ID
     */
    String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name IsValueDisplayed
     */
    String COLUMNNAME_IsValueDisplayed = "IsValueDisplayed";
    /**
     * Column name OrderByClause
     */
    String COLUMNNAME_OrderByClause = "OrderByClause";
    /**
     * Column name WhereClause
     */
    String COLUMNNAME_WhereClause = "WhereClause";

    /**
     * Get Display column. Column that will display
     */
    int getAD_Display();

    /**
     * Get Key column. Unique identifier of a record
     */
    int getAD_Key();

    /**
     * Get Reference. System Reference and Validation
     */
    int getReferenceId();

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    I_AD_Table getAD_Table() throws RuntimeException;

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Set Display Value. Displays Value column with the Display column
     */
    void setIsValueDisplayed(boolean IsValueDisplayed);

}
