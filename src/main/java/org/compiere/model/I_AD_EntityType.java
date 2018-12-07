package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_EntityType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_EntityType {

  /** TableName=AD_EntityType */
  String Table_Name = "AD_EntityType";

  /** AD_Table_ID=882 */
  int Table_ID = 882;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_EntityType_ID */
  String COLUMNNAME_AD_EntityType_ID = "AD_EntityType_ID";

  /** Set Entity Type. System Entity Type */
  void setAD_EntityType_ID(int AD_EntityType_ID);

  /** Get Entity Type. System Entity Type */
  int getAD_EntityType_ID();

  /** Column name AD_EntityType_UU */
  String COLUMNNAME_AD_EntityType_UU = "AD_EntityType_UU";

  /** Set AD_EntityType_UU */
  void setAD_EntityType_UU(String AD_EntityType_UU);

  /** Get AD_EntityType_UU */
  String getAD_EntityType_UU();

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Column name Classpath */
  String COLUMNNAME_Classpath = "Classpath";

  /** Set Classpath. Extension Classpath */
  void setClasspath(String Classpath);

  /** Get Classpath. Extension Classpath */
  String getClasspath();

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

  /** Column name ModelPackage */
  String COLUMNNAME_ModelPackage = "ModelPackage";

  /** Set ModelPackage. Java Package of the model classes */
  void setModelPackage(String ModelPackage);

  /** Get ModelPackage. Java Package of the model classes */
  String getModelPackage();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Process Now */
  boolean isProcessing();

  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Column name Version */
  String COLUMNNAME_Version = "Version";

  /** Set Version. Version of the table definition */
  void setVersion(String Version);

  /** Get Version. Version of the table definition */
  String getVersion();
}
