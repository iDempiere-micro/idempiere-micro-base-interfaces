package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Reference
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Reference {

  /** TableName=AD_Reference */
  String Table_Name = "AD_Reference";

  /** AD_Table_ID=102 */
  int Table_ID = 102;

    /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

    /** Column name AD_Reference_ID */
  String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
  /** Column name AD_Reference_UU */
  String COLUMNNAME_AD_Reference_UU = "AD_Reference_UU";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
    /** Column name IsOrderByValue */
  String COLUMNNAME_IsOrderByValue = "IsOrderByValue";
    /** Column name ValidationType */
  String COLUMNNAME_ValidationType = "ValidationType";
  /** Column name VFormat */
  String COLUMNNAME_VFormat = "VFormat";

    /** Get Name. Alphanumeric identifier of the entity */
  String getName();

    /** Get Validation type. Different method of validating data */
  String getValidationType();

}
