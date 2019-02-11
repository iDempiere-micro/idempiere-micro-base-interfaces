package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_EntityType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_EntityType {

    /**
     * TableName=AD_EntityType
     */
    String Table_Name = "AD_EntityType";

    /**
     * AD_Table_ID=882
     */
    int Table_ID = 882;

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_EntityType_ID
     */
    String COLUMNNAME_AD_EntityType_ID = "AD_EntityType_ID";
    /**
     * Column name AD_EntityType_UU
     */
    String COLUMNNAME_AD_EntityType_UU = "AD_EntityType_UU";
    /**
     * Column name Classpath
     */
    String COLUMNNAME_Classpath = "Classpath";
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
     * Column name ModelPackage
     */
    String COLUMNNAME_ModelPackage = "ModelPackage";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Version
     */
    String COLUMNNAME_Version = "Version";

    /**
     * Get Entity Type. System Entity Type
     */
    int getAD_EntityType_ID();

    /**
     * Get ModelPackage. Java Package of the model classes
     */
    String getModelPackage();

}
