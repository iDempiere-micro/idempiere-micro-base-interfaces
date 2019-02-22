package software.hsharp.core.models

import java.util.Properties

/**
 * Basic ORM properties: [ctx] context and [clientId] client id.
 */
interface IBasePO {
    val ctx: Properties
    val clientId: Int
}