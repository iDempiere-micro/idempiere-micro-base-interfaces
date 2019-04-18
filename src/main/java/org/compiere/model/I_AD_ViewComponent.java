package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_ViewComponent
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ViewComponent extends IPO {

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


    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_ViewComponent_ID
     */
    String COLUMNNAME_AD_ViewComponent_ID = "AD_ViewComponent_ID";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name FromClause
     */
    String COLUMNNAME_FromClause = "FromClause";
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
     * Set Table. Database Table information
     */
    void setViewTableId(int AD_Table_ID);

    /**
     * Get Database View Component
     */
    int getViewComponentId();

    /**
     * Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    String getEntityType();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    I_AD_ViewColumn[] getColumns(boolean b);
}
