package software.hsharp.core.models

/**
 * Basic ORM properties: [ctx] context and [clientId] client id.
 */
interface IBasePO {
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