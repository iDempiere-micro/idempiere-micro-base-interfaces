package software.hsharp.core.models

/**
 * Basic ORM properties: [clientId] client id.
 * Basic ORM functions: [save]
 */
interface BasePersistentObject {
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