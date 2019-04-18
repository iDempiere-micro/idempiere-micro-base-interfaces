package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Element
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Element extends PersistentObject, HasName {

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


    /**
     * Column name AD_Element_ID
     */
    String COLUMNNAME_AD_Element_ID = "AD_Element_ID";
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
     * Column name PrintName
     */
    String COLUMNNAME_PrintName = "PrintName";

    /**
     * Get System Element. System Element enables the central maintenance of column description and
     * help.
     */
    int getElementId();

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

    void saveEx();
}
