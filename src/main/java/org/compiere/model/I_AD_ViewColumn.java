package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_ViewColumn
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ViewColumn {

    /**
     * TableName=AD_ViewColumn
     */
    String Table_Name = "AD_ViewColumn";

    /**
     * AD_Table_ID=200088
     */
    int Table_ID = 200088;

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);



    /**
     * Column name AD_ViewComponent_ID
     */
    String COLUMNNAME_AD_ViewComponent_ID = "AD_ViewComponent_ID";
    /**
     * Column name ColumnName
     */
    String COLUMNNAME_ColumnName = "ColumnName";
    /**
     * Column name ColumnSQL
     */
    String COLUMNNAME_ColumnSQL = "ColumnSQL";
    /**
     * Column name DBDataType
     */
    String COLUMNNAME_DBDataType = "DBDataType";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";

    /**
     * Set Database View Component
     */
    void setViewComponentId(int AD_ViewComponent_ID);

    /**
     * Get DB Column Name. Name of the column in the database
     */
    String getColumnName();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

}
