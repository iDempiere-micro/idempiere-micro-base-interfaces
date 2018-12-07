package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_SysConfig
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_SysConfig {

  /** TableName=AD_SysConfig */
  String Table_Name = "AD_SysConfig";

  /** AD_Table_ID=50009 */
  int Table_ID = 50009;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Column name AD_SysConfig_ID */
  String COLUMNNAME_AD_SysConfig_ID = "AD_SysConfig_ID";

  /** Set System Configurator */
  void setAD_SysConfig_ID(int AD_SysConfig_ID);

  /** Get System Configurator */
  int getAD_SysConfig_ID();

  /** Column name AD_SysConfig_UU */
  String COLUMNNAME_AD_SysConfig_UU = "AD_SysConfig_UU";

  /** Set AD_SysConfig_UU */
  void setAD_SysConfig_UU(String AD_SysConfig_UU);

  /** Get AD_SysConfig_UU */
  String getAD_SysConfig_UU();

  /** Column name ConfigurationLevel */
  String COLUMNNAME_ConfigurationLevel = "ConfigurationLevel";

  /** Set Configuration Level. Configuration Level for this parameter */
  void setConfigurationLevel(String ConfigurationLevel);

  /** Get Configuration Level. Configuration Level for this parameter */
  String getConfigurationLevel();

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

  /** Column name Value */
  String COLUMNNAME_Value = "Value";

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();
}
