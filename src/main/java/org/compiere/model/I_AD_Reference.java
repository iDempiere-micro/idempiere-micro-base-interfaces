package org.compiere.model;

import software.hsharp.core.models.INamedEntity;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Reference
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Reference extends INamedEntity {

    /**
     * TableName=AD_Reference
     */
    String Table_Name = "AD_Reference";

    /**
     * AD_Table_ID=102
     */
    int Table_ID = 102;

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);


    /**
     * Column name ValidationType
     */
    String COLUMNNAME_ValidationType = "ValidationType";

    /**
     * Get Validation type. Different method of validating data
     */
    String getValidationType();

}
