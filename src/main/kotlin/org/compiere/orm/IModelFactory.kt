package org.compiere.orm

import kotliquery.Row
import org.idempiere.icommon.model.IPO

/**
 * Model factory interface, extracted from legacy code in MTable.
 *
 * @author hengsin
 */
interface IModelFactory {
    /**
     * ************************************************************************ Get PO Class Instance
     *
     * @param tableName
     * @param Record_ID record
     * @param trxName
     * @return PO for Record or null
     */
    fun <T : IPO> getPO(tableName: String, recordId: Int): T

    /**
     * Get PO Class Instance
     *
     * @param tableName
     * @param rs result set
     * @param trxName transaction
     * @return PO for Record or null
     */
    fun <T : IPO> getPO(tableName: String, row: Row): T
}
