package org.idempiere.icommon.model

import software.hsharp.core.models.NamedEntity

/**
 * Persistent object with a [name]
 */
interface NamedPersistentObject : PersistentObject, NamedEntity {
    override var name: String
}