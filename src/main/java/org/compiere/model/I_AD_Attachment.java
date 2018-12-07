package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Attachment
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Attachment {

    /**
     * TableName=AD_Attachment
     */
    String Table_Name = "AD_Attachment";

    /**
     * AD_Table_ID=254
     */
    int Table_ID = 254;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Attachment_ID
     */
    String COLUMNNAME_AD_Attachment_ID = "AD_Attachment_ID";
    /**
     * Column name AD_Attachment_UU
     */
    String COLUMNNAME_AD_Attachment_UU = "AD_Attachment_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name BinaryData
     */
    String COLUMNNAME_BinaryData = "BinaryData";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Record_ID
     */
    String COLUMNNAME_Record_ID = "Record_ID";
    /**
     * Column name TextMsg
     */
    String COLUMNNAME_TextMsg = "TextMsg";
    /**
     * Column name Title
     */
    String COLUMNNAME_Title = "Title";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Attachment. Attachment for the document
     */
    int getAD_Attachment_ID();

    /**
     * Set Attachment. Attachment for the document
     */
    void setAD_Attachment_ID(int AD_Attachment_ID);

    /**
     * Get AD_Attachment_UU
     */
    String getAD_Attachment_UU();

    /**
     * Set AD_Attachment_UU
     */
    void setAD_Attachment_UU(String AD_Attachment_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    I_AD_Table getAD_Table() throws RuntimeException;

    /**
     * Get Binary Data. Binary Data
     */
    byte[] getBinaryData();

    /**
     * Set Binary Data. Binary Data
     */
    void setBinaryData(byte[] BinaryData);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Record ID. Direct internal record ID
     */
    int getRecord_ID();

    /**
     * Set Record ID. Direct internal record ID
     */
    void setRecord_ID(int Record_ID);

    /**
     * Get Text Message. Text Message
     */
    String getTextMsg();

    /**
     * Set Text Message. Text Message
     */
    void setTextMsg(String TextMsg);

    /**
     * Get Title. Name this entity is referred to as
     */
    String getTitle();

    /**
     * Set Title. Name this entity is referred to as
     */
    void setTitle(String Title);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    ArrayList<I_AD_AttachmentEntry> getItems();

    void cleanItems();

    void prepareItems();
}
