package org.compiere.model;

import org.idempiere.icommon.model.INamedPO;
import software.hsharp.core.models.CanSetSearchKey;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for AD_User
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_User extends INamedPO, CanSetSearchKey {

    /**
     * TableName=AD_User
     */
    String Table_Name = "AD_User";

    /**
     * AD_Table_ID=114
     */
    int Table_ID = 114;

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);


    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name BP_Location_ID
     */
    String COLUMNNAME_BP_Location_ID = "BP_Location_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BPartner_Location_ID
     */
    String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_Greeting_ID
     */
    String COLUMNNAME_C_Greeting_ID = "C_Greeting_ID";
    /**
     * Column name C_Job_ID
     */
    String COLUMNNAME_C_Job_ID = "C_Job_ID";
    /**
     * Column name C_Location_ID
     */
    String COLUMNNAME_C_Location_ID = "C_Location_ID";
    /**
     * Column name DatePasswordChanged
     */
    String COLUMNNAME_DatePasswordChanged = "DatePasswordChanged";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EMail
     */
    String COLUMNNAME_EMail = "EMail";
    /**
     * Column name EMailUser
     */
    String COLUMNNAME_EMailUser = "EMailUser";
    /**
     * Column name EMailUserPW
     */
    String COLUMNNAME_EMailUserPW = "EMailUserPW";
    /**
     * Column name EMailVerify
     */
    String COLUMNNAME_EMailVerify = "EMailVerify";
    /**
     * Column name EMailVerifyDate
     */
    String COLUMNNAME_EMailVerifyDate = "EMailVerifyDate";
    /**
     * Column name IsFullBPAccess
     */
    String COLUMNNAME_IsFullBPAccess = "IsFullBPAccess";
    /**
     * Column name IsMenuAutoExpand
     */
    String COLUMNNAME_IsMenuAutoExpand = "IsMenuAutoExpand";
    /**
     * Column name LastContact
     */
    String COLUMNNAME_LastContact = "LastContact";
    /**
     * Column name LastResult
     */
    String COLUMNNAME_LastResult = "LastResult";
    /**
     * Column name LDAPUser
     */
    String COLUMNNAME_LDAPUser = "LDAPUser";
    /**
     * Column name NotificationType
     */
    String COLUMNNAME_NotificationType = "NotificationType";
    /**
     * Column name Password
     */
    String COLUMNNAME_Password = "Password";
    /**
     * Column name Phone
     */
    String COLUMNNAME_Phone = "Phone";
    /**
     * Column name R_DefaultMailText_ID
     */
    String COLUMNNAME_R_DefaultMailText_ID = "R_DefaultMailText_ID";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
    /**
     * Column name Salt
     */
    String COLUMNNAME_Salt = "Salt";
    /**
     * Column name Supervisor_ID
     */
    String COLUMNNAME_Supervisor_ID = "Supervisor_ID";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getUserId();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setBPartnerId(int C_BPartner_ID);

    /**
     * Set Date Password Changed
     */
    void setDatePasswordChanged(Timestamp DatePasswordChanged);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get EMail Address. Electronic Mail Address
     */
    String getEMail();

    /**
     * Set EMail Address. Electronic Mail Address
     */
    void setEMail(String EMail);

    /**
     * Get EMail User ID. User Name (ID) in the Mail System
     */
    String getEMailUser();

    /**
     * Set EMail User ID. User Name (ID) in the Mail System
     */
    void setEMailUser(String EMailUser);

    /**
     * Get EMail User Password. Password of your email user id
     */
    String getEMailUserPW();

    /**
     * Set EMail User Password. Password of your email user id
     */
    void setEMailUserPW(String EMailUserPW);

    /**
     * Get Verification Info. Verification information of EMail Address
     */
    String getEMailVerify();

    /**
     * Set Verification Info. Verification information of EMail Address
     */
    void setEMailVerify(String EMailVerify);

    /**
     * Get EMail Verify. Date Email was verified
     */
    Timestamp getEMailVerifyDate();

    /**
     * Set EMail Verify. Date Email was verified
     */
    void setEMailVerifyDate(Timestamp EMailVerifyDate);

    /**
     * Set Full BP Access. The user/contact has full access to Business Partner information and
     * resources
     */
    void setIsFullBPAccess(boolean IsFullBPAccess);

    /**
     * Get Auto expand menu. If ticked, the menu is automatically expanded
     */
    String getIsMenuAutoExpand();

    /**
     * Set Last Contact. Date this individual was last contacted
     */
    void setLastContact(Timestamp LastContact);

    /**
     * Set Last Result. Result of last contact
     */
    void setLastResult(String LastResult);

    /**
     * Get LDAP User Name. User Name used for authorization via LDAP (directory) services
     */
    String getLDAPUser();

    /**
     * Get Notification Type. Type of Notifications
     */
    String getNotificationType();

    /**
     * Set Notification Type. Type of Notifications
     */
    void setNotificationType(String NotificationType);

    /**
     * Get Password. Password of any length (case sensitive)
     */
    String getPassword();

    /**
     * Set Password. Password of any length (case sensitive)
     */
    void setPassword(String Password);

    /**
     * Get Phone.
     * Identifies a telephone number
     */
    String getPhone();

    /**
     * Set Phone. Identifies a telephone number
     */
    void setPhone(String Phone);

    /**
     * Get Salt. Random data added to improve password hash effectiveness
     */
    String getSalt();

    /**
     * Set Salt. Random data added to improve password hash effectiveness
     */
    void setSalt(String Salt);

    /**
     * Get Supervisor. Supervisor for this user/organization - used for escalation and approval
     */
    int getSupervisorId();
}
