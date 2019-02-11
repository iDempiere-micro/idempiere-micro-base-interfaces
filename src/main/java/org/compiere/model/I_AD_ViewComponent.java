package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_ViewComponent
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ViewComponent {

    /**
     * TableName=AD_ViewComponent
     */
    String Table_Name = "AD_ViewComponent";

    /**
     * AD_Table_ID=200087
     */
    int Table_ID = 200087;

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_ViewComponent_ID
     */
    String COLUMNNAME_AD_ViewComponent_ID = "AD_ViewComponent_ID";
    /**
     * Column name AD_ViewComponent_UU
     */
    String COLUMNNAME_AD_ViewComponent_UU = "AD_ViewComponent_UU";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name FromClause
     */
    String COLUMNNAME_FromClause = "FromClause";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name OtherClause
     */
    String COLUMNNAME_OtherClause = "OtherClause";
    /**
     * Column name Referenced_Table_ID
     */
    String COLUMNNAME_Referenced_Table_ID = "Referenced_Table_ID";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name WhereClause
     */
    String COLUMNNAME_WhereClause = "WhereClause";

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    /**
     * Get Database View Component
     */
    int getAD_ViewComponent_ID();

    /**
     * Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    String getEntityType();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Get Sql FROM. SQL FROM clause
     */
    String getFromClause();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Get Other SQL Clause. Other SQL Clause
     */
    String getOtherClause();

    /**
     * Get Referenced Table
     */
    int getReferenced_Table_ID();

    /**
     * Get Sql WHERE. Fully qualified SQL WHERE clause
     */
    String getWhereClause();

}
