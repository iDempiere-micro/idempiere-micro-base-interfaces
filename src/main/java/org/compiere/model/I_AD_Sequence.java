package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Sequence
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Sequence {

    /**
     * AD_Table_ID=115
     */
    int Table_ID = 115;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Sequence_ID
     */
    String COLUMNNAME_AD_Sequence_ID = "AD_Sequence_ID";
    /**
     * Column name CurrentNext
     */
    String COLUMNNAME_CurrentNext = "CurrentNext";
    /**
     * Column name CurrentNextSys
     */
    String COLUMNNAME_CurrentNextSys = "CurrentNextSys";
    /**
     * Column name DateColumn
     */
    String COLUMNNAME_DateColumn = "DateColumn";
    /**
     * Column name DecimalPattern
     */
    String COLUMNNAME_DecimalPattern = "DecimalPattern";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IncrementNo
     */
    String COLUMNNAME_IncrementNo = "IncrementNo";
    /**
     * Column name IsAudited
     */
    String COLUMNNAME_IsAudited = "IsAudited";
    /**
     * Column name IsAutoSequence
     */
    String COLUMNNAME_IsAutoSequence = "IsAutoSequence";
    /**
     * Column name IsOrgLevelSequence
     */
    String COLUMNNAME_IsOrgLevelSequence = "IsOrgLevelSequence";
    /**
     * Column name IsTableID
     */
    String COLUMNNAME_IsTableID = "IsTableID";
    /**
     * Column name OrgColumn
     */
    String COLUMNNAME_OrgColumn = "OrgColumn";
    /**
     * Column name Prefix
     */
    String COLUMNNAME_Prefix = "Prefix";
    /**
     * Column name StartNewMonth
     */
    String COLUMNNAME_StartNewMonth = "StartNewMonth";
    /**
     * Column name StartNewYear
     */
    String COLUMNNAME_StartNewYear = "StartNewYear";
    /**
     * Column name StartNo
     */
    String COLUMNNAME_StartNo = "StartNo";
    /**
     * Column name Suffix
     */
    String COLUMNNAME_Suffix = "Suffix";

    /**
     * Get Sequence. Document Sequence
     */
    int getSequenceId();

    /**
     * Get Current Next. The next number to be used
     */
    int getCurrentNext();

    /**
     * Set Current Next. The next number to be used
     */
    void setCurrentNext(int CurrentNext);

    /**
     * Get Current Next (System). Next sequence for system use
     */
    int getCurrentNextSys();

    /**
     * Set Current Next (System). Next sequence for system use
     */
    void setCurrentNextSys(int CurrentNextSys);

    /**
     * Get Date Column. Fully qualified date column
     */
    String getDateColumn();

    /**
     * Get Decimal Pattern. Java Decimal Pattern
     */
    String getDecimalPattern();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Increment. The number to increment the last document number by
     */
    int getIncrementNo();

    /**
     * Set Increment. The number to increment the last document number by
     */
    void setIncrementNo(int IncrementNo);

    /**
     * Set Activate Audit. Activate Audit Trail of what numbers are generated
     */
    void setIsAudited(boolean IsAudited);

    /**
     * Set Auto numbering. Automatically assign the next number
     */
    void setIsAutoSequence(boolean IsAutoSequence);

    /**
     * Get Organization level. This sequence can be defined for each organization
     */
    boolean isOrgLevelSequence();

    /**
     * Set Used for Record ID. The document number will be used as the record key
     */
    void setIsTableID(boolean IsTableID);

    /**
     * Get Used for Record ID. The document number will be used as the record key
     */
    boolean isTableID();

    /**
     * Get Org Column. Fully qualified Organization column (AD_Org_ID)
     */
    String getOrgColumn();

    /**
     * Get Prefix. Prefix before the sequence number
     */
    String getPrefix();

    /**
     * Get Restart sequence every month
     */
    boolean isStartNewMonth();

    /**
     * Set Restart sequence every month
     */
    void setStartNewMonth(boolean StartNewMonth);

    /**
     * Get Restart sequence every Year. Restart the sequence with Start on every 1/1
     */
    boolean isStartNewYear();

    /**
     * Set Restart sequence every Year. Restart the sequence with Start on every 1/1
     */
    void setStartNewYear(boolean StartNewYear);

    /**
     * Get Start No. Starting number/position
     */
    int getStartNo();

    /**
     * Set Start No. Starting number/position
     */
    void setStartNo(int StartNo);

    /**
     * Get Suffix. Suffix after the number
     */
    String getSuffix();

}
