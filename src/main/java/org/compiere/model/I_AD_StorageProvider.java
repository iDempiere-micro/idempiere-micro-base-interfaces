package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_StorageProvider
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_StorageProvider {

  /** TableName=AD_StorageProvider */
  String Table_Name = "AD_StorageProvider";

  /** AD_Table_ID=200037 */
  int Table_ID = 200037;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Column name AD_StorageProvider_ID */
  String COLUMNNAME_AD_StorageProvider_ID = "AD_StorageProvider_ID";

  /** Set Storage Provider */
  void setAD_StorageProvider_ID(int AD_StorageProvider_ID);

  /** Get Storage Provider */
  int getAD_StorageProvider_ID();

  /** Column name AD_StorageProvider_UU */
  String COLUMNNAME_AD_StorageProvider_UU = "AD_StorageProvider_UU";

  /** Set AD_StorageProvider_UU */
  void setAD_StorageProvider_UU(String AD_StorageProvider_UU);

  /** Get AD_StorageProvider_UU */
  String getAD_StorageProvider_UU();

  /** Column name Created */
  String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Column name Folder */
  String COLUMNNAME_Folder = "Folder";

  /** Set Folder. A folder on a local or remote system to store data into */
  void setFolder(String Folder);

  /** Get Folder. A folder on a local or remote system to store data into */
  String getFolder();

  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Column name Method */
  String COLUMNNAME_Method = "Method";

  /** Set Method */
  void setMethod(String Method);

  /** Get Method */
  String getMethod();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Column name Password */
  String COLUMNNAME_Password = "Password";

  /** Set Password. Password of any length (case sensitive) */
  void setPassword(String Password);

  /** Get Password. Password of any length (case sensitive) */
  String getPassword();

  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Column name URL */
  String COLUMNNAME_URL = "URL";

  /** Set URL. Full URL address - e.g. http://www.idempiere.org */
  void setURL(String URL);

  /** Get URL. Full URL address - e.g. http://www.idempiere.org */
  String getURL();

  /** Column name UserName */
  String COLUMNNAME_UserName = "UserName";

  /** Set User Name */
  void setUserName(String UserName);

  /** Get User Name */
  String getUserName();
}
