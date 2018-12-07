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
  /** Column name AD_Sequence_ID */
  String COLUMNNAME_AD_Sequence_ID = "AD_Sequence_ID";
  /** Column name AD_Sequence_UU */
  String COLUMNNAME_AD_Sequence_UU = "AD_Sequence_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CurrentNext */
  String COLUMNNAME_CurrentNext = "CurrentNext";
  /** Column name CurrentNextSys */
  String COLUMNNAME_CurrentNextSys = "CurrentNextSys";
  /** Column name DateColumn */
  String COLUMNNAME_DateColumn = "DateColumn";
  /** Column name DecimalPattern */
  String COLUMNNAME_DecimalPattern = "DecimalPattern";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IncrementNo */
  String COLUMNNAME_IncrementNo = "IncrementNo";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsAudited */
  String COLUMNNAME_IsAudited = "IsAudited";
  /** Column name IsAutoSequence */
  String COLUMNNAME_IsAutoSequence = "IsAutoSequence";
  /** Column name IsOrgLevelSequence */
  String COLUMNNAME_IsOrgLevelSequence = "IsOrgLevelSequence";
  /** Column name IsTableID */
  String COLUMNNAME_IsTableID = "IsTableID";
  /** Column name OrgColumn */
  String COLUMNNAME_OrgColumn = "OrgColumn";
  /** Column name Prefix */
  String COLUMNNAME_Prefix = "Prefix";
  /** Column name StartNewMonth */
  String COLUMNNAME_StartNewMonth = "StartNewMonth";
  /** Column name StartNewYear */
  String COLUMNNAME_StartNewYear = "StartNewYear";
  /** Column name StartNo */
  String COLUMNNAME_StartNo = "StartNo";
  /** Column name Suffix */
  String COLUMNNAME_Suffix = "Suffix";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name VFormat */
  String COLUMNNAME_VFormat = "VFormat";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Sequence. Document Sequence */
  int getAD_Sequence_ID();

  /** Set Sequence. Document Sequence */
  void setAD_Sequence_ID(int AD_Sequence_ID);

  /** Get AD_Sequence_UU */
  String getAD_Sequence_UU();

  /** Set AD_Sequence_UU */
  void setAD_Sequence_UU(String AD_Sequence_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Current Next. The next number to be used */
  int getCurrentNext();

  /** Set Current Next. The next number to be used */
  void setCurrentNext(int CurrentNext);

  /** Get Current Next (System). Next sequence for system use */
  int getCurrentNextSys();

  /** Set Current Next (System). Next sequence for system use */
  void setCurrentNextSys(int CurrentNextSys);

  /** Get Date Column. Fully qualified date column */
  String getDateColumn();

  /** Set Date Column. Fully qualified date column */
  void setDateColumn(String DateColumn);

  /** Get Decimal Pattern. Java Decimal Pattern */
  String getDecimalPattern();

  /** Set Decimal Pattern. Java Decimal Pattern */
  void setDecimalPattern(String DecimalPattern);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Increment. The number to increment the last document number by */
  int getIncrementNo();

  /** Set Increment. The number to increment the last document number by */
  void setIncrementNo(int IncrementNo);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Activate Audit. Activate Audit Trail of what numbers are generated */
  void setIsAudited(boolean IsAudited);

  /** Get Activate Audit. Activate Audit Trail of what numbers are generated */
  boolean isAudited();

  /** Set Auto numbering. Automatically assign the next number */
  void setIsAutoSequence(boolean IsAutoSequence);

  /** Get Auto numbering. Automatically assign the next number */
  boolean isAutoSequence();

  /** Set Organization level. This sequence can be defined for each organization */
  void setIsOrgLevelSequence(boolean IsOrgLevelSequence);

  /** Get Organization level. This sequence can be defined for each organization */
  boolean isOrgLevelSequence();

  /** Set Used for Record ID. The document number will be used as the record key */
  void setIsTableID(boolean IsTableID);

  /** Get Used for Record ID. The document number will be used as the record key */
  boolean isTableID();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Org Column. Fully qualified Organization column (AD_Org_ID) */
  String getOrgColumn();

  /** Set Org Column. Fully qualified Organization column (AD_Org_ID) */
  void setOrgColumn(String OrgColumn);

  /** Get Prefix. Prefix before the sequence number */
  String getPrefix();

  /** Set Prefix. Prefix before the sequence number */
  void setPrefix(String Prefix);

  /** Get Restart sequence every month */
  boolean isStartNewMonth();

  /** Set Restart sequence every month */
  void setStartNewMonth(boolean StartNewMonth);

  /** Get Restart sequence every Year. Restart the sequence with Start on every 1/1 */
  boolean isStartNewYear();

  /** Set Restart sequence every Year. Restart the sequence with Start on every 1/1 */
  void setStartNewYear(boolean StartNewYear);

  /** Get Start No. Starting number/position */
  int getStartNo();

  /** Set Start No. Starting number/position */
  void setStartNo(int StartNo);

  /** Get Suffix. Suffix after the number */
  String getSuffix();

  /** Set Suffix. Suffix after the number */
  void setSuffix(String Suffix);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /**
   * Get Value Format. Format of the value; Can contain fixed format elements, Variables:
   * "_lLoOaAcCa09"
   */
  String getVFormat();

  /**
   * Set Value Format. Format of the value; Can contain fixed format elements, Variables:
   * "_lLoOaAcCa09"
   */
  void setVFormat(String VFormat);
}
