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

    /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

    /** Column name AD_SysConfig_ID */
  String COLUMNNAME_AD_SysConfig_ID = "AD_SysConfig_ID";
  /** Column name AD_SysConfig_UU */
  String COLUMNNAME_AD_SysConfig_UU = "AD_SysConfig_UU";
  /** Column name ConfigurationLevel */
  String COLUMNNAME_ConfigurationLevel = "ConfigurationLevel";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";

    /** Get Configuration Level. Configuration Level for this parameter */
  String getConfigurationLevel();

  /** Set Configuration Level. Configuration Level for this parameter */
  void setConfigurationLevel(String ConfigurationLevel);

    /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

}
