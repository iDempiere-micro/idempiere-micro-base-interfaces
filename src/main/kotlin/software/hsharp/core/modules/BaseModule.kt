package software.hsharp.core.modules

import software.hsharp.core.services.EnvironmentService

/**
 * The base module containing the base services
 */
interface BaseModule {
    /**
     * The environment service (client id, user id...)
     */
    val environmentService: EnvironmentService
}