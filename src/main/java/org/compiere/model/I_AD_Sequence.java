package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Sequence
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Sequence {

  /** TableName=AD_Sequence */
  String Table_Name = "AD_Sequence";

  /** AD_Table_ID=115 */
  int Table_ID = 115;

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

  /** Column name AD_Sequence_ID */
  String COLUMNNAME_AD_Sequence_ID = "AD_Sequence_ID";

  /** Set Sequence. Document Sequence */
  void setAD_Sequence_ID(int AD_Sequence_ID);

  /** Get Sequence. Document Sequence */
  int getAD_Sequence_ID();

  /** Column name AD_Sequence_UU */
  String COLUMNNAME_AD_Sequence_UU = "AD_Sequence_UU";

  /** Set AD_Sequence_UU */
  void setAD_Sequence_UU(String AD_Sequence_UU);

  /** Get AD_Sequence_UU */
  String getAD_Sequence_UU();

  /** Column name Created */
  String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Column name CurrentNext */
  String COLUMNNAME_CurrentNext = "CurrentNext";

  /** Set Current Next. The next number to be used */
  void setCurrentNext(int CurrentNext);

  /** Get Current Next. The next number to be used */
  int getCurrentNext();

  /** Column name CurrentNextSys */
  String COLUMNNAME_CurrentNextSys = "CurrentNextSys";

  /** Set Current Next (System). Next sequence for system use */
  void setCurrentNextSys(int CurrentNextSys);

  /** Get Current Next (System). Next sequence for system use */
  int getCurrentNextSys();

  /** Column name DateColumn */
  String COLUMNNAME_DateColumn = "DateColumn";

  /** Set Date Column. Fully qualified date column */
  void setDateColumn(String DateColumn);

  /** Get Date Column. Fully qualified date column */
  String getDateColumn();

  /** Column name DecimalPattern */
  String COLUMNNAME_DecimalPattern = "DecimalPattern";

  /** Set Decimal Pattern. Java Decimal Pattern */
  void setDecimalPattern(String DecimalPattern);

  /** Get Decimal Pattern. Java Decimal Pattern */
  String getDecimalPattern();

  /** Column name Description */
  String COLUMNNAME_Description = "Description";

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Column name IncrementNo */
  String COLUMNNAME_IncrementNo = "IncrementNo";

  /** Set Increment. The number to increment the last document number by */
  void setIncrementNo(int IncrementNo);

  /** Get Increment. The number to increment the last document number by */
  int getIncrementNo();

  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Column name IsAudited */
  String COLUMNNAME_IsAudited = "IsAudited";

  /** Set Activate Audit. Activate Audit Trail of what numbers are generated */
  void setIsAudited(boolean IsAudited);

  /** Get Activate Audit. Activate Audit Trail of what numbers are generated */
  boolean isAudited();

  /** Column name IsAutoSequence */
  String COLUMNNAME_IsAutoSequence = "IsAutoSequence";

  /** Set Auto numbering. Automatically assign the next number */
  void setIsAutoSequence(boolean IsAutoSequence);

  /** Get Auto numbering. Automatically assign the next number */
  boolean isAutoSequence();

  /** Column name IsOrgLevelSequence */
  String COLUMNNAME_IsOrgLevelSequence = "IsOrgLevelSequence";

  /** Set Organization level. This sequence can be defined for each organization */
  void setIsOrgLevelSequence(boolean IsOrgLevelSequence);

  /** Get Organization level. This sequence can be defined for each organization */
  boolean isOrgLevelSequence();

  /** Column name IsTableID */
  String COLUMNNAME_IsTableID = "IsTableID";

  /** Set Used for Record ID. The document number will be used as the record key */
  void setIsTableID(boolean IsTableID);

  /** Get Used for Record ID. The document number will be used as the record key */
  boolean isTableID();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Column name OrgColumn */
  String COLUMNNAME_OrgColumn = "OrgColumn";

  /** Set Org Column. Fully qualified Organization column (AD_Org_ID) */
  void setOrgColumn(String OrgColumn);

  /** Get Org Column. Fully qualified Organization column (AD_Org_ID) */
  String getOrgColumn();

  /** Column name Prefix */
  String COLUMNNAME_Prefix = "Prefix";

  /** Set Prefix. Prefix before the sequence number */
  void setPrefix(String Prefix);

  /** Get Prefix. Prefix before the sequence number */
  String getPrefix();

  /** Column name StartNewMonth */
  String COLUMNNAME_StartNewMonth = "StartNewMonth";

  /** Set Restart sequence every month */
  void setStartNewMonth(boolean StartNewMonth);

  /** Get Restart sequence every month */
  boolean isStartNewMonth();

  /** Column name StartNewYear */
  String COLUMNNAME_StartNewYear = "StartNewYear";

  /** Set Restart sequence every Year. Restart the sequence with Start on every 1/1 */
  void setStartNewYear(boolean StartNewYear);

  /** Get Restart sequence every Year. Restart the sequence with Start on every 1/1 */
  boolean isStartNewYear();

  /** Column name StartNo */
  String COLUMNNAME_StartNo = "StartNo";

  /** Set Start No. Starting number/position */
  void setStartNo(int StartNo);

  /** Get Start No. Starting number/position */
  int getStartNo();

  /** Column name Suffix */
  String COLUMNNAME_Suffix = "Suffix";

  /** Set Suffix. Suffix after the number */
  void setSuffix(String Suffix);

  /** Get Suffix. Suffix after the number */
  String getSuffix();

  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Column name VFormat */
  String COLUMNNAME_VFormat = "VFormat";

  /**
   * Set Value Format. Format of the value; Can contain fixed format elements, Variables:
   * "_lLoOaAcCa09"
   */
  void setVFormat(String VFormat);

  /**
   * Get Value Format. Format of the value; Can contain fixed format elements, Variables:
   * "_lLoOaAcCa09"
   */
  String getVFormat();
}
