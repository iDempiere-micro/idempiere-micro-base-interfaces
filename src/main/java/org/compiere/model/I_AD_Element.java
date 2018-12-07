package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Element
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Element {

  /** TableName=AD_Element */
  String Table_Name = "AD_Element";

  /** AD_Table_ID=276 */
  int Table_ID = 276;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Element_ID */
  String COLUMNNAME_AD_Element_ID = "AD_Element_ID";
  /** Column name AD_Element_UU */
  String COLUMNNAME_AD_Element_UU = "AD_Element_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name ColumnName */
  String COLUMNNAME_ColumnName = "ColumnName";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name PO_Description */
  String COLUMNNAME_PO_Description = "PO_Description";
  /** Column name PO_Help */
  String COLUMNNAME_PO_Help = "PO_Help";
  /** Column name PO_Name */
  String COLUMNNAME_PO_Name = "PO_Name";
  /** Column name PO_PrintName */
  String COLUMNNAME_PO_PrintName = "PO_PrintName";
  /** Column name PrintName */
  String COLUMNNAME_PrintName = "PrintName";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /**
   * Get System Element. System Element enables the central maintenance of column description and
   * help.
   */
  int getAD_Element_ID();

  /**
   * Set System Element. System Element enables the central maintenance of column description and
   * help.
   */
  void setAD_Element_ID(int AD_Element_ID);

  /** Get AD_Element_UU */
  String getAD_Element_UU();

  /** Set AD_Element_UU */
  void setAD_Element_UU(String AD_Element_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get DB Column Name. Name of the column in the database */
  String getColumnName();

  /** Set DB Column Name. Name of the column in the database */
  void setColumnName(String ColumnName);

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

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get PO Description. Description in PO Screens */
  String getPO_Description();

  /** Set PO Description. Description in PO Screens */
  void setPO_Description(String PO_Description);

  /** Get PO Help. Help for PO Screens */
  String getPO_Help();

  /** Set PO Help. Help for PO Screens */
  void setPO_Help(String PO_Help);

  /** Get PO Name. Name on PO Screens */
  String getPO_Name();

  /** Set PO Name. Name on PO Screens */
  void setPO_Name(String PO_Name);

  /** Get PO Print name. Print name on PO Screens/Reports */
  String getPO_PrintName();

  /** Set PO Print name. Print name on PO Screens/Reports */
  void setPO_PrintName(String PO_PrintName);

  /** Get Print Text. The label text to be printed on a document or correspondence. */
  String getPrintName();

  /** Set Print Text. The label text to be printed on a document or correspondence. */
  void setPrintName(String PrintName);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
