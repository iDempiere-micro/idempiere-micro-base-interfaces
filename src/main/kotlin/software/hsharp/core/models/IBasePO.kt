package software.hsharp.core.models

import java.util.*

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
}