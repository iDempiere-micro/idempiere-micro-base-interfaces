package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Org
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Org {

  /** TableName=AD_Org */
  String Table_Name = "AD_Org";

  /** AD_Table_ID=155 */
  int Table_ID = 155;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Column name AD_Org_UU */
  String COLUMNNAME_AD_Org_UU = "AD_Org_UU";

  /** Set AD_Org_UU */
  void setAD_Org_UU(String AD_Org_UU);

  /** Get AD_Org_UU */
  String getAD_Org_UU();

  /** Column name AD_ReplicationStrategy_ID */
  String COLUMNNAME_AD_ReplicationStrategy_ID = "AD_ReplicationStrategy_ID";

  /** Set Replication Strategy. Data Replication Strategy */
  void setADReplicationStrategyID(int AD_ReplicationStrategy_ID);

  /** Get Replication Strategy. Data Replication Strategy */
  int getADReplicationStrategyID();

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

  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Column name IsSummary */
  String COLUMNNAME_IsSummary = "IsSummary";

  /** Set Summary Level. This is a summary entity */
  void setIsSummary(boolean IsSummary);

  /** Get Summary Level. This is a summary entity */
  boolean isSummary();

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
