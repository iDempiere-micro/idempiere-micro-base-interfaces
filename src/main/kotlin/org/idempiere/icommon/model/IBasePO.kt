package org.idempiere.icommon.model

// to be used instead of PO
interface IBasePO : software.hsharp.core.models.IBasePO {
    val id: Int

    val orgId: Int

    val tableId: Int
}
