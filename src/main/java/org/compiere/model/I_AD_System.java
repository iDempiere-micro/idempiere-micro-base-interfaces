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

    /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

    /** Column name AD_System_ID */
  String COLUMNNAME_AD_System_ID = "AD_System_ID";
  /** Column name AD_System_UU */
  String COLUMNNAME_AD_System_UU = "AD_System_UU";
    /** Column name CustomPrefix */
  String COLUMNNAME_CustomPrefix = "CustomPrefix";
  /** Column name DBAddress */
  String COLUMNNAME_DBAddress = "DBAddress";
  /** Column name DBInstance */
  String COLUMNNAME_DBInstance = "DBInstance";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EncryptionKey */
  String COLUMNNAME_EncryptionKey = "EncryptionKey";
  /** Column name IDRangeEnd */
  String COLUMNNAME_IDRangeEnd = "IDRangeEnd";
  /** Column name IDRangeStart */
  String COLUMNNAME_IDRangeStart = "IDRangeStart";
  /** Column name Info */
  String COLUMNNAME_Info = "Info";
    /** Column name IsAllowStatistics */
  String COLUMNNAME_IsAllowStatistics = "IsAllowStatistics";
  /** Column name IsAutoErrorReport */
  String COLUMNNAME_IsAutoErrorReport = "IsAutoErrorReport";
  /** Column name IsFailOnBuildDiffer */
  String COLUMNNAME_IsFailOnBuildDiffer = "IsFailOnBuildDiffer";
  /** Column name IsFailOnMissingModelValidator */
  String COLUMNNAME_IsFailOnMissingModelValidator = "IsFailOnMissingModelValidator";
  /** Column name IsJustMigrated */
  String COLUMNNAME_IsJustMigrated = "IsJustMigrated";
  /** Column name LastBuildInfo */
  String COLUMNNAME_LastBuildInfo = "LastBuildInfo";
  /** Column name LastMigrationScriptApplied */
  String COLUMNNAME_LastMigrationScriptApplied = "LastMigrationScriptApplied";
  /** Column name LDAPDomain */
  String COLUMNNAME_LDAPDomain = "LDAPDomain";
  /** Column name LDAPHost */
  String COLUMNNAME_LDAPHost = "LDAPHost";
  /** Column name NoProcessors */
  String COLUMNNAME_NoProcessors = "NoProcessors";
  /** Column name OldName */
  String COLUMNNAME_OldName = "OldName";
  /** Column name Password */
  String COLUMNNAME_Password = "Password";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name ProfileInfo */
  String COLUMNNAME_ProfileInfo = "ProfileInfo";
  /** Column name Record_ID */
  String COLUMNNAME_Record_ID = "Record_ID";
  /** Column name ReleaseNo */
  String COLUMNNAME_ReleaseNo = "ReleaseNo";
  /** Column name ReplicationType */
  String COLUMNNAME_ReplicationType = "ReplicationType";
  /** Column name StatisticsInfo */
  String COLUMNNAME_StatisticsInfo = "StatisticsInfo";
  /** Column name Summary */
  String COLUMNNAME_Summary = "Summary";
  /** Column name SupportEMail */
  String COLUMNNAME_SupportEMail = "SupportEMail";
  /** Column name SupportExpDate */
  String COLUMNNAME_SupportExpDate = "SupportExpDate";
  /** Column name SupportUnits */
  String COLUMNNAME_SupportUnits = "SupportUnits";
  /** Column name SystemStatus */
  String COLUMNNAME_SystemStatus = "SystemStatus";
    /** Column name UserName */
  String COLUMNNAME_UserName = "UserName";
  /** Column name Version */
  String COLUMNNAME_Version = "Version";

    /** Get ID Range End. End if the ID Range used */
  BigDecimal getIDRangeEnd();

    /** Get Fail on Missing Model Validator */
  boolean isFailOnMissingModelValidator();

    /** Set Internal Users. Number of Internal Users for iDempiere Support */
  void setSupportUnits(int SupportUnits);

}
