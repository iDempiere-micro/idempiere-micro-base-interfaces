package org.idempiere.icommon.model

/**
 * The ORM properties to identify a persistent object.
 */
interface BasePersistentObject : software.hsharp.core.models.BasePersistentObject {
    /**
     * Primary Key
     */
    val id: Int

    /**
     * Organization owning this persistent object.
     */
    val orgId: Int

    /**
     * Id of table this persistent object is stored in.
     */
    val tableId: Int
}
