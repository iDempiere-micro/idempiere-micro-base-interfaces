package software.hsharp.core.models

import java.util.Properties

/**
 * Environment where the current execution is happening. Always have the current user, client etc.
 */
interface EnvironmentService {
    val clientId: Int
    val context: Properties
}