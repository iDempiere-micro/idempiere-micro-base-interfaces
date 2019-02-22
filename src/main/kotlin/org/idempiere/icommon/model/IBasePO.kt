package org.idempiere.icommon.model

/**
 * The ORM properties to identify a persistent object.
 */
interface IBasePO : software.hsharp.core.models.IBasePO {
    val id: Int

    val orgId: Int

    val tableId: Int
}
