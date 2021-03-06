package org.idempiere.icommon.model

/**
 * All the most important persistent object attributes. Allows this interface to be used instead of PO.
 */
interface PersistentObject : BasePersistentObject {
    /**
     * Names of the key columns
     */
    val keyColumns: Array<String>

    /**
     * Name of the table this persistent object is stored in
     */
    val tableName: String

    /**
     * Is the persistent object new and need to be INSERTed?
     */
    val isNew: Boolean

    /**
     * get value in column that has [columnId]. Note this is NOT an index in the row.
     */
    fun <T> getValueOfColumn(columnId: Int): T?

    /**
     * get index of a column named [columnName] in the current row.
     */
    fun getColumnIndex(columnName: String): Int

    /**
     * get value from the column named [columnName] in the current row.
     */
    fun <T> getValue(columnName: String): T?

    /**
     * get value from the [index]th column in the current row.
     */
    fun <T> getValue(index: Int): T?

    /**
     *	Is Active
     */
    fun isActive(): Boolean
}
