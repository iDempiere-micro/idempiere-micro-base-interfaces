package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Val_Rule
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Val_Rule {

  /** TableName=AD_Val_Rule */
  String Table_Name = "AD_Val_Rule";

  /** AD_Table_ID=108 */
  int Table_ID = 108;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Val_Rule_ID */
  String COLUMNNAME_AD_Val_Rule_ID = "AD_Val_Rule_ID";
  /** Column name AD_Val_Rule_UU */
  String COLUMNNAME_AD_Val_Rule_UU = "AD_Val_Rule_UU";
  /** Column name Code */
  String COLUMNNAME_Code = "Code";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Type */
  String COLUMNNAME_Type = "Type";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Set Dynamic Validation. Dynamic Validation Rule */
  void setAD_Val_Rule_ID(int AD_Val_Rule_ID);

  /** Get Dynamic Validation. Dynamic Validation Rule */
  int getValRule_ID();

  /** Set AD_Val_Rule_UU */
  void setAD_Val_Rule_UU(String AD_Val_Rule_UU);

  /** Get AD_Val_Rule_UU */
  String getValRule_UU();

  /** Get Validation code. Validation Code */
  String getCode();

  /** Set Validation code. Validation Code */
  void setCode(String Code);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Type. Type of Validation (SQL, Java Script, Java Language) */
  String getType();

  /** Set Type. Type of Validation (SQL, Java Script, Java Language) */
  void setType(String Type);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
