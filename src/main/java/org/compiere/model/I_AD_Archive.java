package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Archive
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Archive {

  /** TableName=AD_Archive */
  String Table_Name = "AD_Archive";

  /** AD_Table_ID=754 */
  int Table_ID = 754;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Column name AD_Archive_UU */
  String COLUMNNAME_AD_Archive_UU = "AD_Archive_UU";

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Load Meta Data */

  /** Column name AD_Archive_ID */
  String COLUMNNAME_AD_Archive_ID = "AD_Archive_ID";

  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

  /** Column name BinaryData */
  String COLUMNNAME_BinaryData = "BinaryData";

  /** Column name Help */
  String COLUMNNAME_Help = "Help";

  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Column name Created */
  String COLUMNNAME_Created = "Created";

  /** Column name AD_Process_ID */
  String COLUMNNAME_AD_Process_ID = "AD_Process_ID";

  /** Column name Description */
  String COLUMNNAME_Description = "Description";

  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";

  /** Column name IsReport */
  String COLUMNNAME_IsReport = "IsReport";

  /** Column name Record_ID */
  String COLUMNNAME_Record_ID = "Record_ID";

  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";

  /** Get Archive. Document and Report Archive */
  int getAD_Archive_ID();

  /** Set Archive. Document and Report Archive */
  void setAD_Archive_ID(int AD_Archive_ID);

  /** Get AD_Archive_UU */
  String getAD_Archive_UU();

  /** Set AD_Archive_UU */
  void setAD_Archive_UU(String AD_Archive_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Process. Process or Report */
  int getAD_Process_ID();

  /** Set Process. Process or Report */
  void setAD_Process_ID(int AD_Process_ID);

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Get Binary Data. Binary Data */
  byte[] getBinaryData();

  /** Set Binary Data. Binary Data */
  void setBinaryData(byte[] BinaryData);

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Report. Indicates a Report record */
  void setIsReport(boolean IsReport);

  /** Get Report. Indicates a Report record */
  boolean isReport();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Record ID. Direct internal record ID */
  int getRecord_ID();

  /** Set Record ID. Direct internal record ID */
  void setRecord_ID(int Record_ID);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  byte[] getByteData();

  void setByteData(byte[] bytes);

  int get_ID();

  boolean save();

  String getArchivePathSnippet();
}
