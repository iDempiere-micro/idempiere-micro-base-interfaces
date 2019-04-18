package org.compiere.model

import software.hsharp.core.models.NamedEntity

/** Has Name.
 * Alphanumeric identifier of the entity
 */
interface HasName : NamedEntity {
    companion object {
        // Column name Name
        const val COLUMNNAME_Name = "Name"
    }

    override var name: String
}