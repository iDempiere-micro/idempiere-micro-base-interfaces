package org.idempiere.icommon.model

import software.hsharp.core.models.INamedEntity

/**
 * Persistent object with a [name]
 */
interface INamedPO : IPO, INamedEntity
{
    override var name: String
}