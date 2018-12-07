package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

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

  I_AD_Reference getAD_Reference() throws RuntimeException;

  /** Column name AD_Ref_List_ID */
  String COLUMNNAME_AD_Ref_List_ID = "AD_Ref_List_ID";

  /** Set Reference List. Reference List based on Table */
  void setAD_Ref_List_ID(int AD_Ref_List_ID);

  /** Get Reference List. Reference List based on Table */
  int getAD_Ref_List_ID();

  /** Column name AD_Ref_List_UU */
  String COLUMNNAME_AD_Ref_List_UU = "AD_Ref_List_UU";

  /** Set AD_Ref_List_UU */
  void setAD_Ref_List_UU(String AD_Ref_List_UU);

  /** Get AD_Ref_List_UU */
  String getAD_Ref_List_UU();

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

  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

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

  /** Column name ValidFrom */
  String COLUMNNAME_ValidFrom = "ValidFrom";

  /** Set Valid from. Valid from including this date (first day) */
  void setValidFrom(Timestamp ValidFrom);

  /** Get Valid from. Valid from including this date (first day) */
  Timestamp getValidFrom();

  /** Column name ValidTo */
  String COLUMNNAME_ValidTo = "ValidTo";

  /** Set Valid to. Valid to including this date (last day) */
  void setValidTo(Timestamp ValidTo);

  /** Get Valid to. Valid to including this date (last day) */
  Timestamp getValidTo();

  /** Column name Value */
  String COLUMNNAME_Value = "Value";

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();
}
