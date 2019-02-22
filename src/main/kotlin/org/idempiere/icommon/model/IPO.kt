package org.idempiere.icommon.model

/**
 * All the most important persistent object attributes. Allows this interface to be used instead of PO.
 */
interface IPO : IBasePO {
    val keyColumns: Array<String>

    val tableName: String

    val isNew: Boolean

    fun get_ValueOfColumn(ad_column_id: Int): Any

    fun get_ColumnIndex(token: String): Int

    fun get_Value(columnName: String): Any

    fun get_Value(index: Int): Any?
}
