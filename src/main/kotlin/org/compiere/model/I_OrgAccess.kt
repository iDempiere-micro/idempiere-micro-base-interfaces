package org.compiere.model

interface I_OrgAccess {
    val readOnly: Boolean
    val orgId: Int
    val clientId: Int
}
