package software.hsharp.core.modules

import org.compiere.orm.IModelFactory
import software.hsharp.core.services.EnvironmentService

/**
 * The base module containing the base services
 */
interface BaseModule {
    /**
     * The environment service (client id, user id...)
     */
    val environmentService: EnvironmentService
    /**
     * Persistent object load
     */
    val modelFactory: IModelFactory
}