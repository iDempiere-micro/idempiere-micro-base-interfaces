package software.hsharp.core.services

import java.util.Properties

/**
 * Environment where the current execution is happening. Always have the current user, client etc.
 */
interface EnvironmentService {
    /**
     * logged user client
     */
    val clientId: Int
    /**
     * logged user organization
     */
    val orgId: Int
    /**
     * currently logged in user
     */
    val userId: Int

    /**
     * backwards compatible properties
     */
    val context: Properties

    /**
     * login the current user into the organization and the client
     */
    fun login(clientId: Int, orgId: Int, userId: Int)
}