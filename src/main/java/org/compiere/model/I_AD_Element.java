package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Element
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Element {

    /**
     * TableName=AD_Element
     */
    String Table_Name = "AD_Element";

    /**
     * AD_Table_ID=276
     */
    int Table_ID = 276;

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Element_ID
     */
    String COLUMNNAME_AD_Element_ID = "AD_Element_ID";
    /**
     * Column name AD_Element_UU
     */
    String COLUMNNAME_AD_Element_UU = "AD_Element_UU";
    /**
     * Column name ColumnName
     */
    String COLUMNNAME_ColumnName = "ColumnName";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name PO_Description
     */
    String COLUMNNAME_PO_Description = "PO_Description";
    /**
     * Column name PO_Help
     */
    String COLUMNNAME_PO_Help = "PO_Help";
    /**
     * Column name PO_Name
     */
    String COLUMNNAME_PO_Name = "PO_Name";
    /**
     * Column name PO_PrintName
     */
    String COLUMNNAME_PO_PrintName = "PO_PrintName";
    /**
     * Column name PrintName
     */
    String COLUMNNAME_PrintName = "PrintName";

    /**
     * Get System Element. System Element enables the central maintenance of column description and
     * help.
     */
    int getAD_Element_ID();

    /**
     * Get DB Column Name. Name of the column in the database
     */
    String getColumnName();

    /**
     * Set DB Column Name. Name of the column in the database
     */
    void setColumnName(String ColumnName);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Get Print Text. The label text to be printed on a document or correspondence.
     */
    String getPrintName();

    /**
     * Set Print Text. The label text to be printed on a document or correspondence.
     */
    void setPrintName(String PrintName);

}
