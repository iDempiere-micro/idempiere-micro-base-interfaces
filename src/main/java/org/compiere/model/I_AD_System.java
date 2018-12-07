package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_System
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_System {

  /** TableName=AD_System */
  String Table_Name = "AD_System";

  /** AD_Table_ID=531 */
  int Table_ID = 531;

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

  /** Column name AD_System_ID */
  String COLUMNNAME_AD_System_ID = "AD_System_ID";

  /** Set System. System Definition */
  void setAD_System_ID(int AD_System_ID);

  /** Get System. System Definition */
  int getAD_System_ID();

  /** Column name AD_System_UU */
  String COLUMNNAME_AD_System_UU = "AD_System_UU";

  /** Set AD_System_UU */
  void setAD_System_UU(String AD_System_UU);

  /** Get AD_System_UU */
  String getAD_System_UU();

  /** Column name Created */
  String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Column name CustomPrefix */
  String COLUMNNAME_CustomPrefix = "CustomPrefix";

  /** Set Custom Prefix. Prefix for Custom entities */
  void setCustomPrefix(String CustomPrefix);

  /** Get Custom Prefix. Prefix for Custom entities */
  String getCustomPrefix();

  /** Column name DBAddress */
  String COLUMNNAME_DBAddress = "DBAddress";

  /** Set DB Address. JDBC URL of the database server */
  void setDBAddress(String DBAddress);

  /** Get DB Address. JDBC URL of the database server */
  String getDBAddress();

  /** Column name DBInstance */
  String COLUMNNAME_DBInstance = "DBInstance";

  /** Set Database Name. Database Name */
  void setDBInstance(String DBInstance);

  /** Get Database Name. Database Name */
  String getDBInstance();

  /** Column name Description */
  String COLUMNNAME_Description = "Description";

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Column name EncryptionKey */
  String COLUMNNAME_EncryptionKey = "EncryptionKey";

  /** Set Encryption Class. Encryption Class used for securing data content */
  void setEncryptionKey(String EncryptionKey);

  /** Get Encryption Class. Encryption Class used for securing data content */
  String getEncryptionKey();

  /** Column name IDRangeEnd */
  String COLUMNNAME_IDRangeEnd = "IDRangeEnd";

  /** Set ID Range End. End if the ID Range used */
  void setIDRangeEnd(BigDecimal IDRangeEnd);

  /** Get ID Range End. End if the ID Range used */
  BigDecimal getIDRangeEnd();

  /** Column name IDRangeStart */
  String COLUMNNAME_IDRangeStart = "IDRangeStart";

  /** Set ID Range Start. Start of the ID Range used */
  void setIDRangeStart(BigDecimal IDRangeStart);

  /** Get ID Range Start. Start of the ID Range used */
  BigDecimal getIDRangeStart();

  /** Column name Info */
  String COLUMNNAME_Info = "Info";

  /** Set Info. Information */
  void setInfo(String Info);

  /** Get Info. Information */
  String getInfo();

  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Column name IsAllowStatistics */
  String COLUMNNAME_IsAllowStatistics = "IsAllowStatistics";

  /** Set Maintain Statistics. Maintain general statistics */
  void setIsAllowStatistics(boolean IsAllowStatistics);

  /** Get Maintain Statistics. Maintain general statistics */
  boolean isAllowStatistics();

  /** Column name IsAutoErrorReport */
  String COLUMNNAME_IsAutoErrorReport = "IsAutoErrorReport";

  /** Set Error Reporting. Automatically report Errors */
  void setIsAutoErrorReport(boolean IsAutoErrorReport);

  /** Get Error Reporting. Automatically report Errors */
  boolean isAutoErrorReport();

  /** Column name IsFailOnBuildDiffer */
  String COLUMNNAME_IsFailOnBuildDiffer = "IsFailOnBuildDiffer";

  /** Set Fail if Build Differ */
  void setIsFailOnBuildDiffer(boolean IsFailOnBuildDiffer);

  /** Get Fail if Build Differ */
  boolean isFailOnBuildDiffer();

  /** Column name IsFailOnMissingModelValidator */
  String COLUMNNAME_IsFailOnMissingModelValidator =
      "IsFailOnMissingModelValidator";

  /** Set Fail on Missing Model Validator */
  void setIsFailOnMissingModelValidator(boolean IsFailOnMissingModelValidator);

  /** Get Fail on Missing Model Validator */
  boolean isFailOnMissingModelValidator();

  /** Column name IsJustMigrated */
  String COLUMNNAME_IsJustMigrated = "IsJustMigrated";

  /** Set Just Migrated. Value set by Migration for post-Migration tasks. */
  void setIsJustMigrated(boolean IsJustMigrated);

  /** Get Just Migrated. Value set by Migration for post-Migration tasks. */
  boolean isJustMigrated();

  /** Column name LastBuildInfo */
  String COLUMNNAME_LastBuildInfo = "LastBuildInfo";

  /** Set Last Build Info */
  void setLastBuildInfo(String LastBuildInfo);

  /** Get Last Build Info */
  String getLastBuildInfo();

  /** Column name LastMigrationScriptApplied */
  String COLUMNNAME_LastMigrationScriptApplied = "LastMigrationScriptApplied";

  /**
   * Set Last Migration Script Applied. Register of the filename for the last migration script
   * applied on this database
   */
  void setLastMigrationScriptApplied(String LastMigrationScriptApplied);

  /**
   * Get Last Migration Script Applied. Register of the filename for the last migration script
   * applied on this database
   */
  String getLastMigrationScriptApplied();

  /** Column name LDAPDomain */
  String COLUMNNAME_LDAPDomain = "LDAPDomain";

  /** Set LDAP Domain. Directory service domain name - e.g. idempiere.org */
  void setLDAPDomain(String LDAPDomain);

  /** Get LDAP Domain. Directory service domain name - e.g. idempiere.org */
  String getLDAPDomain();

  /** Column name LDAPHost */
  String COLUMNNAME_LDAPHost = "LDAPHost";

  /** Set LDAP URL. Connection String to LDAP server starting with ldap:// */
  void setLDAPHost(String LDAPHost);

  /** Get LDAP URL. Connection String to LDAP server starting with ldap:// */
  String getLDAPHost();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Column name NoProcessors */
  String COLUMNNAME_NoProcessors = "NoProcessors";

  /** Set Processors. Number of Database Processors */
  void setNoProcessors(int NoProcessors);

  /** Get Processors. Number of Database Processors */
  int getNoProcessors();

  /** Column name OldName */
  String COLUMNNAME_OldName = "OldName";

  /** Set Old Name */
  void setOldName(String OldName);

  /** Get Old Name */
  String getOldName();

  /** Column name Password */
  String COLUMNNAME_Password = "Password";

  /** Set Password. Password of any length (case sensitive) */
  void setPassword(String Password);

  /** Get Password. Password of any length (case sensitive) */
  String getPassword();

  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Process Now */
  boolean isProcessing();

  /** Column name ProfileInfo */
  String COLUMNNAME_ProfileInfo = "ProfileInfo";

  /** Set Profile. Information to help profiling the system for solving support issues */
  void setProfileInfo(String ProfileInfo);

  /** Get Profile. Information to help profiling the system for solving support issues */
  String getProfileInfo();

  /** Column name Record_ID */
  String COLUMNNAME_Record_ID = "Record_ID";

  /** Set Record ID. Direct internal record ID */
  void setRecord_ID(int Record_ID);

  /** Get Record ID. Direct internal record ID */
  int getRecord_ID();

  /** Column name ReleaseNo */
  String COLUMNNAME_ReleaseNo = "ReleaseNo";

  /** Set Release No. Internal Release Number */
  void setReleaseNo(String ReleaseNo);

  /** Get Release No. Internal Release Number */
  String getReleaseNo();

  /** Column name ReplicationType */
  String COLUMNNAME_ReplicationType = "ReplicationType";

  /** Set Replication Type. Type of Data Replication */
  void setReplicationType(String ReplicationType);

  /** Get Replication Type. Type of Data Replication */
  String getReplicationType();

  /** Column name StatisticsInfo */
  String COLUMNNAME_StatisticsInfo = "StatisticsInfo";

  /** Set Statistics. Information to help profiling the system for solving support issues */
  void setStatisticsInfo(String StatisticsInfo);

  /** Get Statistics. Information to help profiling the system for solving support issues */
  String getStatisticsInfo();

  /** Column name Summary */
  String COLUMNNAME_Summary = "Summary";

  /** Set Summary. Textual summary of this request */
  void setSummary(String Summary);

  /** Get Summary. Textual summary of this request */
  String getSummary();

  /** Column name SupportEMail */
  String COLUMNNAME_SupportEMail = "SupportEMail";

  /** Set Support EMail. EMail address to send support information and updates to */
  void setSupportEMail(String SupportEMail);

  /** Get Support EMail. EMail address to send support information and updates to */
  String getSupportEMail();

  /** Column name SupportExpDate */
  String COLUMNNAME_SupportExpDate = "SupportExpDate";

  /** Set Support Expires. Date when the iDempiere support expires */
  void setSupportExpDate(Timestamp SupportExpDate);

  /** Get Support Expires. Date when the iDempiere support expires */
  Timestamp getSupportExpDate();

  /** Column name SupportUnits */
  String COLUMNNAME_SupportUnits = "SupportUnits";

  /** Set Internal Users. Number of Internal Users for iDempiere Support */
  void setSupportUnits(int SupportUnits);

  /** Get Internal Users. Number of Internal Users for iDempiere Support */
  int getSupportUnits();

  /** Column name SystemStatus */
  String COLUMNNAME_SystemStatus = "SystemStatus";

  /** Set System Status. Status of the system - Support priority depends on system status */
  void setSystemStatus(String SystemStatus);

  /** Get System Status. Status of the system - Support priority depends on system status */
  String getSystemStatus();

  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Column name UserName */
  String COLUMNNAME_UserName = "UserName";

  /** Set User Name */
  void setUserName(String UserName);

  /** Get User Name */
  String getUserName();

  /** Column name Version */
  String COLUMNNAME_Version = "Version";

  /** Set Version. Version of the table definition */
  void setVersion(String Version);

  /** Get Version. Version of the table definition */
  String getVersion();
}
