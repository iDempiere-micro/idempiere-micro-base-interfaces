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

    /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

    /** Column name AD_Sequence_ID */
  String COLUMNNAME_AD_Sequence_ID = "AD_Sequence_ID";
  /** Column name AD_Sequence_No_UU */
  String COLUMNNAME_AD_Sequence_No_UU = "AD_Sequence_No_UU";
  /** Column name CalendarYearMonth */
  String COLUMNNAME_CalendarYearMonth = "CalendarYearMonth";
    /** Column name CurrentNext */
  String COLUMNNAME_CurrentNext = "CurrentNext";

    /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

    /** Get Sequence. Document Sequence */
  int getAD_Sequence_ID();

  /** Set Sequence. Document Sequence */
  void setAD_Sequence_ID(int AD_Sequence_ID);

    /** Set YearMonth. YYYYMM */
  void setCalendarYearMonth(String CalendarYearMonth);

    /** Set Current Next. The next number to be used */
  void setCurrentNext(int CurrentNext);

}
