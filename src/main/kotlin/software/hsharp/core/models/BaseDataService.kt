package software.hsharp.core.models

import org.idempiere.icommon.model.IPO

interface BaseDataService<T : IPO> {
    fun getAll(): List<T>
}