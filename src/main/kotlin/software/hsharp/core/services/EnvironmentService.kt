package software.hsharp.core.services

import java.util.Properties

/**
 * Environment where the current execution is happening. Always have the current user, client etc.
 */
interface EnvironmentService {
    /**
     * The client Id
     */
    val clientId: Int
    /**
     * The organization id inside the client (or 0 if any organization)
     */
    val orgId: Int
    /**
     * The user id inside the organization (or 0 if any user)
     */
    val userId: Int

    /**
     * Backwards compatible list of properties
     */
    val context: Properties

    /**
     * Login a user in an organization in a client
     */
    fun login(clientId: Int, orgId: Int, userId: Int)
}