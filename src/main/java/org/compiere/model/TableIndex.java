package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_TableIndex
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface TableIndex {

    /**
     * AD_Table_ID=200085
     */
    int Table_ID = 200085;

    /**
     * TableName=AD_TableIndex
     */
    String Table_Name = "AD_TableIndex";

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);


    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_TableIndex_ID
     */
    String COLUMNNAME_AD_TableIndex_ID = "AD_TableIndex_ID";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name IsCreateConstraint
     */
    String COLUMNNAME_IsCreateConstraint = "IsCreateConstraint";
    /**
     * Column name IsKey
     */
    String COLUMNNAME_IsKey = "IsKey";
    /**
     * Column name IsUnique
     */
    String COLUMNNAME_IsUnique = "IsUnique";

    /**
     * Get Table. Database Table information
     */
    int getIndexTableId();

    /**
     * Get Table Index
     */
    int getTableIndexId();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Set Create Constraint
     */
    void setIsCreateConstraint(boolean IsCreateConstraint);

    /**
     * Get Create Constraint
     */
    boolean isCreateConstraint();

    /**
     * Get Key column. This column is the key in this table
     */
    boolean isKey();

    /**
     * Set Unique
     */
    void setIsUnique(boolean IsUnique);

    /**
     * Get Unique
     */
    boolean isUnique();

}
