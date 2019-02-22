package org.idempiere.common.util

/**
 * Combination of an integer [key] and a [_name]. Usually used to store the information about a named database row
 * where [key] is the primary ke and [_name] is a human readable name.
 */
data class KeyNamePair(val key: Int, val _name: String) : HasName(_name)