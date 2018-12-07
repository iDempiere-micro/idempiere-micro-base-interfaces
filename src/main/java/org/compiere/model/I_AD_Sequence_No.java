package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Sequence_No
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Sequence_No {

  /** TableName=AD_Sequence_No */
  String Table_Name = "AD_Sequence_No";

  /** AD_Table_ID=122 */
  int Table_ID = 122;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Sequence_ID */
  String COLUMNNAME_AD_Sequence_ID = "AD_Sequence_ID";
  /** Column name AD_Sequence_No_UU */
  String COLUMNNAME_AD_Sequence_No_UU = "AD_Sequence_No_UU";
  /** Column name CalendarYearMonth */
  String COLUMNNAME_CalendarYearMonth = "CalendarYearMonth";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CurrentNext */
  String COLUMNNAME_CurrentNext = "CurrentNext";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Sequence. Document Sequence */
  int getAD_Sequence_ID();

  /** Set Sequence. Document Sequence */
  void setAD_Sequence_ID(int AD_Sequence_ID);

  I_AD_Sequence getAD_Sequence() throws RuntimeException;

  /** Get AD_Sequence_No_UU */
  String getAD_Sequence_No_UU();

  /** Set AD_Sequence_No_UU */
  void setAD_Sequence_No_UU(String AD_Sequence_No_UU);

  /** Get YearMonth. YYYYMM */
  String getCalendarYearMonth();

  /** Set YearMonth. YYYYMM */
  void setCalendarYearMonth(String CalendarYearMonth);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Current Next. The next number to be used */
  int getCurrentNext();

  /** Set Current Next. The next number to be used */
  void setCurrentNext(int CurrentNext);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
