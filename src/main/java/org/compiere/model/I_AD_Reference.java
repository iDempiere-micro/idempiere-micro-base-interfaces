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

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Column name AD_Reference_ID */
  String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";

  /** Set Reference. System Reference and Validation */
  void setAD_Reference_ID(int AD_Reference_ID);

  /** Get Reference. System Reference and Validation */
  int getAD_Reference_ID();

  /** Column name AD_Reference_UU */
  String COLUMNNAME_AD_Reference_UU = "AD_Reference_UU";

  /** Set AD_Reference_UU */
  void setAD_Reference_UU(String AD_Reference_UU);

  /** Get AD_Reference_UU */
  String getAD_Reference_UU();

  /** Column name Created */
  String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Column name Description */
  String COLUMNNAME_Description = "Description";

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Column name Help */
  String COLUMNNAME_Help = "Help";

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Column name IsOrderByValue */
  String COLUMNNAME_IsOrderByValue = "IsOrderByValue";

  /** Set Order By Value. Order list using the value column instead of the name column */
  void setIsOrderByValue(boolean IsOrderByValue);

  /** Get Order By Value. Order list using the value column instead of the name column */
  boolean isOrderByValue();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Column name ValidationType */
  String COLUMNNAME_ValidationType = "ValidationType";

  /** Set Validation type. Different method of validating data */
  void setValidationType(String ValidationType);

  /** Get Validation type. Different method of validating data */
  String getValidationType();

  /** Column name VFormat */
  String COLUMNNAME_VFormat = "VFormat";

  /**
   * Set Value Format. Format of the value; Can contain fixed format elements, Variables:
   * "_lLoOaAcCa09"
   */
  void setVFormat(String VFormat);

  /**
   * Get Value Format. Format of the value; Can contain fixed format elements, Variables:
   * "_lLoOaAcCa09"
   */
  String getVFormat();
}
