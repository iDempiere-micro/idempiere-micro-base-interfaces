package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Ref_List
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Ref_List {

    /**
     * TableName=AD_Ref_List
     */
    String Table_Name = "AD_Ref_List";

    /**
     * AD_Table_ID=104
     */
    int Table_ID = 104;

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);



    /**
     * Column name AD_Reference_ID
     */
    String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

}
