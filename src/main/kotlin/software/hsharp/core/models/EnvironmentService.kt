package software.hsharp.core.models

import java.util.*

/**
 * Environment where the current execution is happening. Always have the current user, client etc.
 */
interface EnvironmentService {
    val clientId: Int
    val context: Properties
}