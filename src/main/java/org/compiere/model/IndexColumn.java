package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_IndexColumn
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface IndexColumn {

    /**
     * TableName=AD_IndexColumn
     */
    String Table_Name = "AD_IndexColumn";

    /**
     * AD_Table_ID=200086
     */
    int Table_ID = 200086;

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);


    /**
     * Column name AD_Column_ID
     */
    String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
    /**
     * Column name AD_TableIndex_ID
     */
    String COLUMNNAME_AD_TableIndex_ID = "AD_TableIndex_ID";
    /**
     * Column name ColumnSQL
     */
    String COLUMNNAME_ColumnSQL = "ColumnSQL";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";

    /**
     * Get Column. Column in the table
     */
    int getColumnId();

    /**
     * Set Column. Column in the table
     */
    void setColumnId(int AD_Column_ID);

    /**
     * Set Table Index
     */
    void setTableIndexId(int AD_TableIndex_ID);

    /**
     * Get Column SQL. Virtual Column (r/o)
     */
    String getColumnSQL();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

}
