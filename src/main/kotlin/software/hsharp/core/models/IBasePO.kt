package software.hsharp.core.models

import java.util.Properties

/**
 * Basic ORM properties: [ctx] context and [clientId] client id.
 */
interface IBasePO {
    /**
     * The context the persistent object is living in.
     */
    val ctx: Properties

    /**
     * Client owning this persistent object.
     */
    val clientId: Int

    /**
     * Update Value or create new record.
     * @return true if saved
     */
    fun save(): Boolean
}