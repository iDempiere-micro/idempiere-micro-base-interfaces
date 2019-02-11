package software.hsharp.core.models

/**
 * Environment where the current execution is happening. Always have the current user, client etc.
 */
interface EnvironmentService {
    val clientId: Int
}