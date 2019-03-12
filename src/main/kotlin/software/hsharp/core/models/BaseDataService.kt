package software.hsharp.core.models

import org.idempiere.icommon.model.IPO

/**
 * Base interface to be extended by all the base data services that allow e.g. to get all the rows
 * for the current client
 */
interface BaseDataService<T : IPO> {
    /**
     * Get all [T]s for the current client
     */
    fun getAll(): List<T>
}