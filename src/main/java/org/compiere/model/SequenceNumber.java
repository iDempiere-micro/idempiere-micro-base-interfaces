package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Sequence_No
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface SequenceNumber {

    /**
     * AD_Table_ID=122
     */
    int Table_ID = 122;

    /**
     * TableName=AD_Sequence_No
     */
    String Table_Name = "AD_Sequence_No";


    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name AD_Sequence_ID
     */
    String COLUMNNAME_AD_Sequence_ID = "AD_Sequence_ID";
    /**
     * Column name CalendarYearMonth
     */
    String COLUMNNAME_CalendarYearMonth = "CalendarYearMonth";
    /**
     * Column name CurrentNext
     */
    String COLUMNNAME_CurrentNext = "CurrentNext";

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Set Sequence. Document Sequence
     */
    void setSequenceId(int AD_Sequence_ID);

    /**
     * Set YearMonth. YYYYMM
     */
    void setCalendarYearMonth(String CalendarYearMonth);

    /**
     * Set Current Next. The next number to be used
     */
    void setCurrentNext(int CurrentNext);

}
