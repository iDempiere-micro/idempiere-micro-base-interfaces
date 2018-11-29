package org.compiere.model

import software.hsharp.core.models.INamedEntity

/** Has Name.
 * Alphanumeric identifier of the entity
 */
interface HasName : INamedEntity {
    companion object {
        // Column name Name
        val COLUMNNAME_Name = "Name"
    }

    override var name: String
}