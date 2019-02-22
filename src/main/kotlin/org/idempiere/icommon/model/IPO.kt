package org.idempiere.icommon.model

/**
 * All the most important persistent object attributes. Allows this interface to be used instead of PO.
 */
interface IPO : IBasePO {
    val keyColumns: Array<String>

    val tableName: String

    val isNew: Boolean

    fun getValueOfColumn(columnId: Int): Any

    fun getColumnIndex(token: String): Int

    /** Get Search Key.
     * @return Search key for the record in the format required - must be unique
     */
    fun getValue(columnName: String): Any

    fun getValue(index: Int): Any?
}
