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

  /** TableName=AD_Attachment */
  public static final String Table_Name = "AD_Attachment";

  /** AD_Table_ID=254 */
  public static final int Table_ID = 254;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Attachment_ID */
  public static final String COLUMNNAME_AD_Attachment_ID = "AD_Attachment_ID";

  /** Set Attachment. Attachment for the document */
  public void setAD_Attachment_ID(int AD_Attachment_ID);

  /** Get Attachment. Attachment for the document */
  public int getAD_Attachment_ID();

  /** Column name AD_Attachment_UU */
  public static final String COLUMNNAME_AD_Attachment_UU = "AD_Attachment_UU";

  /** Set AD_Attachment_UU */
  public void setAD_Attachment_UU(String AD_Attachment_UU);

  /** Get AD_Attachment_UU */
  public String getAD_Attachment_UU();

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getOrgId();

  /** Column name AD_Table_ID */
  public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

  /** Set Table. Database Table information */
  public void setAD_Table_ID(int AD_Table_ID);

  /** Get Table. Database Table information */
  public int getAD_Table_ID();

  public I_AD_Table getAD_Table() throws RuntimeException;

  /** Column name BinaryData */
  public static final String COLUMNNAME_BinaryData = "BinaryData";

  /** Set Binary Data. Binary Data */
  public void setBinaryData(byte[] BinaryData);

  /** Get Binary Data. Binary Data */
  public byte[] getBinaryData();

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name Record_ID */
  public static final String COLUMNNAME_Record_ID = "Record_ID";

  /** Set Record ID. Direct internal record ID */
  public void setRecord_ID(int Record_ID);

  /** Get Record ID. Direct internal record ID */
  public int getRecord_ID();

  /** Column name TextMsg */
  public static final String COLUMNNAME_TextMsg = "TextMsg";

  /** Set Text Message. Text Message */
  public void setTextMsg(String TextMsg);

  /** Get Text Message. Text Message */
  public String getTextMsg();

  /** Column name Title */
  public static final String COLUMNNAME_Title = "Title";

  /** Set Title. Name this entity is referred to as */
  public void setTitle(String Title);

  /** Get Title. Name this entity is referred to as */
  public String getTitle();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();

  ArrayList<I_AD_AttachmentEntry> getItems();

  void cleanItems();

  void prepareItems();
}
