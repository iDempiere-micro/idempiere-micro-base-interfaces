package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Org
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface ClientOrganization extends PersistentObject {

    /**
     * TableName=AD_Org
     */
    String Table_Name = "AD_Org";

    /**
     * AD_Table_ID=155
     */
    int Table_ID = 155;

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);


    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsSummary
     */
    String COLUMNNAME_IsSummary = "IsSummary";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Summary Level. This is a summary entity
     */
    void setIsSummary(boolean IsSummary);

    /**
     * Get Summary Level. This is a summary entity
     */
    boolean isSummary();

}
