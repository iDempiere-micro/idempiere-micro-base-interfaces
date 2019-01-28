package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Client
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Client {

    /**
     * TableName=AD_Client
     */
    String Table_Name = "AD_Client";

    /**
     * AD_Table_ID=112
     */
    int Table_ID = 112;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Client_UU
     */
    String COLUMNNAME_AD_Client_UU = "AD_Client_UU";
    /**
     * Column name AD_Language
     */
    String COLUMNNAME_AD_Language = "AD_Language";
    /**
     * Column name AD_PasswordRule_ID
     */
    String COLUMNNAME_AD_PasswordRule_ID = "AD_PasswordRule_ID";
    /**
     * Column name AD_ReplicationStrategy_ID
     */
    String COLUMNNAME_AD_ReplicationStrategy_ID = "AD_ReplicationStrategy_ID";
    /**
     * Column name AutoArchive
     */
    String COLUMNNAME_AutoArchive = "AutoArchive";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocumentDir
     */
    String COLUMNNAME_DocumentDir = "DocumentDir";
    /**
     * Column name EMailTest
     */
    String COLUMNNAME_EMailTest = "EMailTest";
    /**
     * Column name IsMultiLingualDocument
     */
    String COLUMNNAME_IsMultiLingualDocument = "IsMultiLingualDocument";
    /**
     * Column name IsPostImmediate
     */
    String COLUMNNAME_IsPostImmediate = "IsPostImmediate";
    /**
     * Column name IsSecureSMTP
     */
    String COLUMNNAME_IsSecureSMTP = "IsSecureSMTP";
    /**
     * Column name IsServerEMail
     */
    String COLUMNNAME_IsServerEMail = "IsServerEMail";
    /**
     * Column name IsSmtpAuthorization
     */
    String COLUMNNAME_IsSmtpAuthorization = "IsSmtpAuthorization";
    /**
     * Column name IsUseASP
     */
    String COLUMNNAME_IsUseASP = "IsUseASP";
    /**
     * Column name IsUseBetaFunctions
     */
    String COLUMNNAME_IsUseBetaFunctions = "IsUseBetaFunctions";
    /**
     * Column name MMPolicy
     */
    String COLUMNNAME_MMPolicy = "MMPolicy";
    /**
     * Column name ModelValidationClasses
     */
    String COLUMNNAME_ModelValidationClasses = "ModelValidationClasses";
    /**
     * Column name RequestEMail
     */
    String COLUMNNAME_RequestEMail = "RequestEMail";
    /**
     * Column name RequestFolder
     */
    String COLUMNNAME_RequestFolder = "RequestFolder";
    /**
     * Column name RequestUser
     */
    String COLUMNNAME_RequestUser = "RequestUser";
    /**
     * Column name RequestUserPW
     */
    String COLUMNNAME_RequestUserPW = "RequestUserPW";
    /**
     * Column name SMTPHost
     */
    String COLUMNNAME_SMTPHost = "SMTPHost";
    /**
     * Column name SMTPPort
     */
    String COLUMNNAME_SMTPPort = "SMTPPort";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Get Language. Language for this entity
     */
    String getADLanguage();

    /**
     * Set Language. Language for this entity
     */
    void setADLanguage(String AD_Language);

    /**
     * Get Auto Archive. Enable and level of automatic Archive of documents
     */
    String getAutoArchive();

    /**
     * Set Auto Archive. Enable and level of automatic Archive of documents
     */
    void setAutoArchive(String AutoArchive);

    /**
     * Set Multi Lingual Documents. Documents are Multi Lingual
     */
    void setIsMultiLingualDocument(boolean IsMultiLingualDocument);

    /**
     * Get Multi Lingual Documents. Documents are Multi Lingual
     */
    boolean isMultiLingualDocument();

    /**
     * Set Post Immediately (Deprecated). Post the accounting immediately for testing (Deprecated)
     */
    void setIsPostImmediate(boolean IsPostImmediate);

    /**
     * Get SMTP SSL/TLS. Use SSL/TLS for SMTP
     */
    boolean isSecureSMTP();

    /**
     * Set Server EMail. Send EMail from Server
     */
    void setIsServerEMail(boolean IsServerEMail);

    /**
     * Set SMTP Authentication. Your mail server requires Authentication
     */
    void setIsSmtpAuthorization(boolean IsSmtpAuthorization);

    /**
     * Get SMTP Authentication. Your mail server requires Authentication
     */
    boolean isSmtpAuthorization();

    /**
     * Get IsUseASP
     */
    boolean isUseASP();

    /**
     * Set Use Beta Functions. Enable the use of Beta Functionality
     */
    void setIsUseBetaFunctions(boolean IsUseBetaFunctions);

    /**
     * Get Use Beta Functions. Enable the use of Beta Functionality
     */
    boolean isUseBetaFunctions();

    /**
     * Get Material Policy. Material Movement Policy
     */
    String getMMPolicy();

    /**
     * Set Material Policy. Material Movement Policy
     */
    void setMMPolicy(String MMPolicy);

    /**
     * Get Model Validation Classes. List of data model validation classes separated by ;
     */
    String getModelValidationClasses();

    /**
     * Get Request EMail. EMail address to send automated mails from or receive mails for automated
     * processing (fully qualified)
     */
    String getRequestEMail();

    /**
     * Get Request User. User Name (ID) of the email owner
     */
    String getRequestUser();

    /**
     * Get Request User Password. Password of the user name (ID) for mail processing
     */
    String getRequestUserPW();

    /**
     * Get Mail Host. Hostname of Mail Server for SMTP and IMAP
     */
    String getSMTPHost();

    /**
     * Get SMTP Port. SMTP Port Number
     */
    int getSMTPPort();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
