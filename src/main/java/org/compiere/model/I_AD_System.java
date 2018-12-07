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

    /**
     * TableName=AD_System
     */
    String Table_Name = "AD_System";

    /**
     * AD_Table_ID=531
     */
    int Table_ID = 531;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_System_ID
     */
    String COLUMNNAME_AD_System_ID = "AD_System_ID";
    /**
     * Column name AD_System_UU
     */
    String COLUMNNAME_AD_System_UU = "AD_System_UU";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name CustomPrefix
     */
    String COLUMNNAME_CustomPrefix = "CustomPrefix";
    /**
     * Column name DBAddress
     */
    String COLUMNNAME_DBAddress = "DBAddress";
    /**
     * Column name DBInstance
     */
    String COLUMNNAME_DBInstance = "DBInstance";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EncryptionKey
     */
    String COLUMNNAME_EncryptionKey = "EncryptionKey";
    /**
     * Column name IDRangeEnd
     */
    String COLUMNNAME_IDRangeEnd = "IDRangeEnd";
    /**
     * Column name IDRangeStart
     */
    String COLUMNNAME_IDRangeStart = "IDRangeStart";
    /**
     * Column name Info
     */
    String COLUMNNAME_Info = "Info";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsAllowStatistics
     */
    String COLUMNNAME_IsAllowStatistics = "IsAllowStatistics";
    /**
     * Column name IsAutoErrorReport
     */
    String COLUMNNAME_IsAutoErrorReport = "IsAutoErrorReport";
    /**
     * Column name IsFailOnBuildDiffer
     */
    String COLUMNNAME_IsFailOnBuildDiffer = "IsFailOnBuildDiffer";
    /**
     * Column name IsFailOnMissingModelValidator
     */
    String COLUMNNAME_IsFailOnMissingModelValidator =
            "IsFailOnMissingModelValidator";
    /**
     * Column name IsJustMigrated
     */
    String COLUMNNAME_IsJustMigrated = "IsJustMigrated";
    /**
     * Column name LastBuildInfo
     */
    String COLUMNNAME_LastBuildInfo = "LastBuildInfo";
    /**
     * Column name LastMigrationScriptApplied
     */
    String COLUMNNAME_LastMigrationScriptApplied = "LastMigrationScriptApplied";
    /**
     * Column name LDAPDomain
     */
    String COLUMNNAME_LDAPDomain = "LDAPDomain";
    /**
     * Column name LDAPHost
     */
    String COLUMNNAME_LDAPHost = "LDAPHost";
    /**
     * Column name NoProcessors
     */
    String COLUMNNAME_NoProcessors = "NoProcessors";
    /**
     * Column name OldName
     */
    String COLUMNNAME_OldName = "OldName";
    /**
     * Column name Password
     */
    String COLUMNNAME_Password = "Password";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name ProfileInfo
     */
    String COLUMNNAME_ProfileInfo = "ProfileInfo";
    /**
     * Column name Record_ID
     */
    String COLUMNNAME_Record_ID = "Record_ID";
    /**
     * Column name ReleaseNo
     */
    String COLUMNNAME_ReleaseNo = "ReleaseNo";
    /**
     * Column name ReplicationType
     */
    String COLUMNNAME_ReplicationType = "ReplicationType";
    /**
     * Column name StatisticsInfo
     */
    String COLUMNNAME_StatisticsInfo = "StatisticsInfo";
    /**
     * Column name Summary
     */
    String COLUMNNAME_Summary = "Summary";
    /**
     * Column name SupportEMail
     */
    String COLUMNNAME_SupportEMail = "SupportEMail";
    /**
     * Column name SupportExpDate
     */
    String COLUMNNAME_SupportExpDate = "SupportExpDate";
    /**
     * Column name SupportUnits
     */
    String COLUMNNAME_SupportUnits = "SupportUnits";
    /**
     * Column name SystemStatus
     */
    String COLUMNNAME_SystemStatus = "SystemStatus";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name UserName
     */
    String COLUMNNAME_UserName = "UserName";
    /**
     * Column name Version
     */
    String COLUMNNAME_Version = "Version";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get System. System Definition
     */
    int getAD_System_ID();

    /**
     * Set System. System Definition
     */
    void setAD_System_ID(int AD_System_ID);

    /**
     * Get AD_System_UU
     */
    String getAD_System_UU();

    /**
     * Set AD_System_UU
     */
    void setAD_System_UU(String AD_System_UU);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Custom Prefix. Prefix for Custom entities
     */
    String getCustomPrefix();

    /**
     * Set Custom Prefix. Prefix for Custom entities
     */
    void setCustomPrefix(String CustomPrefix);

    /**
     * Get DB Address. JDBC URL of the database server
     */
    String getDBAddress();

    /**
     * Set DB Address. JDBC URL of the database server
     */
    void setDBAddress(String DBAddress);

    /**
     * Get Database Name. Database Name
     */
    String getDBInstance();

    /**
     * Set Database Name. Database Name
     */
    void setDBInstance(String DBInstance);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Encryption Class. Encryption Class used for securing data content
     */
    String getEncryptionKey();

    /**
     * Set Encryption Class. Encryption Class used for securing data content
     */
    void setEncryptionKey(String EncryptionKey);

    /**
     * Get ID Range End. End if the ID Range used
     */
    BigDecimal getIDRangeEnd();

    /**
     * Set ID Range End. End if the ID Range used
     */
    void setIDRangeEnd(BigDecimal IDRangeEnd);

    /**
     * Get ID Range Start. Start of the ID Range used
     */
    BigDecimal getIDRangeStart();

    /**
     * Set ID Range Start. Start of the ID Range used
     */
    void setIDRangeStart(BigDecimal IDRangeStart);

    /**
     * Get Info. Information
     */
    String getInfo();

    /**
     * Set Info. Information
     */
    void setInfo(String Info);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Maintain Statistics. Maintain general statistics
     */
    void setIsAllowStatistics(boolean IsAllowStatistics);

    /**
     * Get Maintain Statistics. Maintain general statistics
     */
    boolean isAllowStatistics();

    /**
     * Set Error Reporting. Automatically report Errors
     */
    void setIsAutoErrorReport(boolean IsAutoErrorReport);

    /**
     * Get Error Reporting. Automatically report Errors
     */
    boolean isAutoErrorReport();

    /**
     * Set Fail if Build Differ
     */
    void setIsFailOnBuildDiffer(boolean IsFailOnBuildDiffer);

    /**
     * Get Fail if Build Differ
     */
    boolean isFailOnBuildDiffer();

    /**
     * Set Fail on Missing Model Validator
     */
    void setIsFailOnMissingModelValidator(boolean IsFailOnMissingModelValidator);

    /**
     * Get Fail on Missing Model Validator
     */
    boolean isFailOnMissingModelValidator();

    /**
     * Set Just Migrated. Value set by Migration for post-Migration tasks.
     */
    void setIsJustMigrated(boolean IsJustMigrated);

    /**
     * Get Just Migrated. Value set by Migration for post-Migration tasks.
     */
    boolean isJustMigrated();

    /**
     * Get Last Build Info
     */
    String getLastBuildInfo();

    /**
     * Set Last Build Info
     */
    void setLastBuildInfo(String LastBuildInfo);

    /**
     * Get Last Migration Script Applied. Register of the filename for the last migration script
     * applied on this database
     */
    String getLastMigrationScriptApplied();

    /**
     * Set Last Migration Script Applied. Register of the filename for the last migration script
     * applied on this database
     */
    void setLastMigrationScriptApplied(String LastMigrationScriptApplied);

    /**
     * Get LDAP Domain. Directory service domain name - e.g. idempiere.org
     */
    String getLDAPDomain();

    /**
     * Set LDAP Domain. Directory service domain name - e.g. idempiere.org
     */
    void setLDAPDomain(String LDAPDomain);

    /**
     * Get LDAP URL. Connection String to LDAP server starting with ldap://
     */
    String getLDAPHost();

    /**
     * Set LDAP URL. Connection String to LDAP server starting with ldap://
     */
    void setLDAPHost(String LDAPHost);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Processors. Number of Database Processors
     */
    int getNoProcessors();

    /**
     * Set Processors. Number of Database Processors
     */
    void setNoProcessors(int NoProcessors);

    /**
     * Get Old Name
     */
    String getOldName();

    /**
     * Set Old Name
     */
    void setOldName(String OldName);

    /**
     * Get Password. Password of any length (case sensitive)
     */
    String getPassword();

    /**
     * Set Password. Password of any length (case sensitive)
     */
    void setPassword(String Password);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Profile. Information to help profiling the system for solving support issues
     */
    String getProfileInfo();

    /**
     * Set Profile. Information to help profiling the system for solving support issues
     */
    void setProfileInfo(String ProfileInfo);

    /**
     * Get Record ID. Direct internal record ID
     */
    int getRecord_ID();

    /**
     * Set Record ID. Direct internal record ID
     */
    void setRecord_ID(int Record_ID);

    /**
     * Get Release No. Internal Release Number
     */
    String getReleaseNo();

    /**
     * Set Release No. Internal Release Number
     */
    void setReleaseNo(String ReleaseNo);

    /**
     * Get Replication Type. Type of Data Replication
     */
    String getReplicationType();

    /**
     * Set Replication Type. Type of Data Replication
     */
    void setReplicationType(String ReplicationType);

    /**
     * Get Statistics. Information to help profiling the system for solving support issues
     */
    String getStatisticsInfo();

    /**
     * Set Statistics. Information to help profiling the system for solving support issues
     */
    void setStatisticsInfo(String StatisticsInfo);

    /**
     * Get Summary. Textual summary of this request
     */
    String getSummary();

    /**
     * Set Summary. Textual summary of this request
     */
    void setSummary(String Summary);

    /**
     * Get Support EMail. EMail address to send support information and updates to
     */
    String getSupportEMail();

    /**
     * Set Support EMail. EMail address to send support information and updates to
     */
    void setSupportEMail(String SupportEMail);

    /**
     * Get Support Expires. Date when the iDempiere support expires
     */
    Timestamp getSupportExpDate();

    /**
     * Set Support Expires. Date when the iDempiere support expires
     */
    void setSupportExpDate(Timestamp SupportExpDate);

    /**
     * Get Internal Users. Number of Internal Users for iDempiere Support
     */
    int getSupportUnits();

    /**
     * Set Internal Users. Number of Internal Users for iDempiere Support
     */
    void setSupportUnits(int SupportUnits);

    /**
     * Get System Status. Status of the system - Support priority depends on system status
     */
    String getSystemStatus();

    /**
     * Set System Status. Status of the system - Support priority depends on system status
     */
    void setSystemStatus(String SystemStatus);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get User Name
     */
    String getUserName();

    /**
     * Set User Name
     */
    void setUserName(String UserName);

    /**
     * Get Version. Version of the table definition
     */
    String getVersion();

    /**
     * Set Version. Version of the table definition
     */
    void setVersion(String Version);
}
