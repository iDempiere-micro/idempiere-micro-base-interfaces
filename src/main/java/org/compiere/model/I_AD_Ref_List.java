package org.compiere.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for AD_Ref_List
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Ref_List {

  /** TableName=AD_Ref_List */
  String Table_Name = "AD_Ref_List";

  /** AD_Table_ID=104 */
  int Table_ID = 104;

    /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

    /** Column name AD_Reference_ID */
  String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
  /** Column name AD_Ref_List_ID */
  String COLUMNNAME_AD_Ref_List_ID = "AD_Ref_List_ID";
  /** Column name AD_Ref_List_UU */
  String COLUMNNAME_AD_Ref_List_UU = "AD_Ref_List_UU";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
    /** Column name ValidFrom */
  String COLUMNNAME_ValidFrom = "ValidFrom";
  /** Column name ValidTo */
  String COLUMNNAME_ValidTo = "ValidTo";

    /** Get Reference. System Reference and Validation */
  int getReferenceId();

    /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

}
