package software.hsharp.core.models

/**
 * A named entity
 */
interface INamedEntity {
    val name: String
}

/**
 * A named entity (writable)
 */
interface INamedEntityWritable : INamedEntity {
    override var name: String
}