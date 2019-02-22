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
     * Column name ModelPackage
     */
    String COLUMNNAME_ModelPackage = "ModelPackage";

    /**
     * Get Entity Type. System Entity Type
     */
    int getAD_EntityType_ID();

    /**
     * Get ModelPackage. Java Package of the model classes
     */
    String getModelPackage();

}
