package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Client
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Client {

  /** TableName=AD_Client */
  String Table_Name = "AD_Client";

  /** AD_Table_ID=112 */
  int Table_ID = 112;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Client_UU */
  String COLUMNNAME_AD_Client_UU = "AD_Client_UU";

  /** Set AD_Client_UU */
  void setADClientUU(String AD_Client_UU);

  /** Get AD_Client_UU */
  String getADClientUU();

  /** Column name AD_Language */
  String COLUMNNAME_AD_Language = "AD_Language";

  /** Set Language. Language for this entity */
  void setADLanguage(String AD_Language);

  /** Get Language. Language for this entity */
  String getADLanguage();

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Column name AD_PasswordRule_ID */
  String COLUMNNAME_AD_PasswordRule_ID = "AD_PasswordRule_ID";

  /** Set Password Policies */
  void setAD_PasswordRule_ID(int AD_PasswordRule_ID);

  /** Get Password Policies */
  int getADPasswordRule_ID();

  /** Column name AD_ReplicationStrategy_ID */
  String COLUMNNAME_AD_ReplicationStrategy_ID = "AD_ReplicationStrategy_ID";

  /** Set Replication Strategy. Data Replication Strategy */
  void setADReplicationStrategyID(int AD_ReplicationStrategy_ID);

  /** Get Replication Strategy. Data Replication Strategy */
  int getADReplicationStrategyID();

  /** Column name AutoArchive */
  String COLUMNNAME_AutoArchive = "AutoArchive";

  /** Set Auto Archive. Enable and level of automatic Archive of documents */
  void setAutoArchive(String AutoArchive);

  /** Get Auto Archive. Enable and level of automatic Archive of documents */
  String getAutoArchive();

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

  /** Column name DocumentDir */
  String COLUMNNAME_DocumentDir = "DocumentDir";

  /** Set Document Directory. Directory for documents from the application server */
  void setDocumentDir(String DocumentDir);

  /** Get Document Directory. Directory for documents from the application server */
  String getDocumentDir();

  /** Column name EMailTest */
  String COLUMNNAME_EMailTest = "EMailTest";

  /** Set EMail Test. Test EMail */
  void setEMailTest(String EMailTest);

  /** Get EMail Test. Test EMail */
  String getEMailTest();

  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Column name IsMultiLingualDocument */
  String COLUMNNAME_IsMultiLingualDocument = "IsMultiLingualDocument";

  /** Set Multi Lingual Documents. Documents are Multi Lingual */
  void setIsMultiLingualDocument(boolean IsMultiLingualDocument);

  /** Get Multi Lingual Documents. Documents are Multi Lingual */
  boolean isMultiLingualDocument();

  /** Column name IsPostImmediate */
  String COLUMNNAME_IsPostImmediate = "IsPostImmediate";

  /** Set Post Immediately (Deprecated). Post the accounting immediately for testing (Deprecated) */
  void setIsPostImmediate(boolean IsPostImmediate);

  /** Get Post Immediately (Deprecated). Post the accounting immediately for testing (Deprecated) */
  boolean isPostImmediate();

  /** Column name IsSecureSMTP */
  String COLUMNNAME_IsSecureSMTP = "IsSecureSMTP";

  /** Set SMTP SSL/TLS. Use SSL/TLS for SMTP */
  void setIsSecureSMTP(boolean IsSecureSMTP);

  /** Get SMTP SSL/TLS. Use SSL/TLS for SMTP */
  boolean isSecureSMTP();

  /** Column name IsServerEMail */
  String COLUMNNAME_IsServerEMail = "IsServerEMail";

  /** Set Server EMail. Send EMail from Server */
  void setIsServerEMail(boolean IsServerEMail);

  /** Get Server EMail. Send EMail from Server */
  boolean isServerEMail();

  /** Column name IsSmtpAuthorization */
  String COLUMNNAME_IsSmtpAuthorization = "IsSmtpAuthorization";

  /** Set SMTP Authentication. Your mail server requires Authentication */
  void setIsSmtpAuthorization(boolean IsSmtpAuthorization);

  /** Get SMTP Authentication. Your mail server requires Authentication */
  boolean isSmtpAuthorization();

  /** Column name IsUseASP */
  String COLUMNNAME_IsUseASP = "IsUseASP";

  /** Set IsUseASP */
  void setIsUseASP(boolean IsUseASP);

  /** Get IsUseASP */
  boolean isUseASP();

  /** Column name IsUseBetaFunctions */
  String COLUMNNAME_IsUseBetaFunctions = "IsUseBetaFunctions";

  /** Set Use Beta Functions. Enable the use of Beta Functionality */
  void setIsUseBetaFunctions(boolean IsUseBetaFunctions);

  /** Get Use Beta Functions. Enable the use of Beta Functionality */
  boolean isUseBetaFunctions();

  /** Column name MMPolicy */
  String COLUMNNAME_MMPolicy = "MMPolicy";

  /** Set Material Policy. Material Movement Policy */
  void setMMPolicy(String MMPolicy);

  /** Get Material Policy. Material Movement Policy */
  String getMMPolicy();

  /** Column name ModelValidationClasses */
  String COLUMNNAME_ModelValidationClasses = "ModelValidationClasses";

  /** Set Model Validation Classes. List of data model validation classes separated by ; */
  void setModelValidationClasses(String ModelValidationClasses);

  /** Get Model Validation Classes. List of data model validation classes separated by ; */
  String getModelValidationClasses();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Column name RequestEMail */
  String COLUMNNAME_RequestEMail = "RequestEMail";

  /**
   * Set Request EMail. EMail address to send automated mails from or receive mails for automated
   * processing (fully qualified)
   */
  void setRequestEMail(String RequestEMail);

  /**
   * Get Request EMail. EMail address to send automated mails from or receive mails for automated
   * processing (fully qualified)
   */
  String getRequestEMail();

  /** Column name RequestFolder */
  String COLUMNNAME_RequestFolder = "RequestFolder";

  /** Set Request Folder. EMail folder to process incoming emails; if empty INBOX is used */
  void setRequestFolder(String RequestFolder);

  /** Get Request Folder. EMail folder to process incoming emails; if empty INBOX is used */
  String getRequestFolder();

  /** Column name RequestUser */
  String COLUMNNAME_RequestUser = "RequestUser";

  /** Set Request User. User Name (ID) of the email owner */
  void setRequestUser(String RequestUser);

  /** Get Request User. User Name (ID) of the email owner */
  String getRequestUser();

  /** Column name RequestUserPW */
  String COLUMNNAME_RequestUserPW = "RequestUserPW";

  /** Set Request User Password. Password of the user name (ID) for mail processing */
  void setRequestUserPW(String RequestUserPW);

  /** Get Request User Password. Password of the user name (ID) for mail processing */
  String getRequestUserPW();

  /** Column name SMTPHost */
  String COLUMNNAME_SMTPHost = "SMTPHost";

  /** Set Mail Host. Hostname of Mail Server for SMTP and IMAP */
  void setSMTPHost(String SMTPHost);

  /** Get Mail Host. Hostname of Mail Server for SMTP and IMAP */
  String getSMTPHost();

  /** Column name SMTPPort */
  String COLUMNNAME_SMTPPort = "SMTPPort";

  /** Set SMTP Port. SMTP Port Number */
  void setSMTPPort(int SMTPPort);

  /** Get SMTP Port. SMTP Port Number */
  int getSMTPPort();

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
