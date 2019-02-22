package org.compiere.model;

import java.math.BigDecimal;
import java.util.ArrayList;

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
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name BinaryData
     */
    String COLUMNNAME_BinaryData = "BinaryData";
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
    
    String ZIP = "zip";

    ArrayList<I_AD_AttachmentEntry> getItems();
    void setItems(ArrayList<I_AD_AttachmentEntry> items);

    byte[] getBinaryData();

    String getTitle();

    void setBinaryData(byte[] BinaryData);

    I_AD_AttachmentEntry getEntry(int i);

    void setTitle(String zip);
}
