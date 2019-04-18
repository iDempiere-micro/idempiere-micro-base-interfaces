package org.compiere.model

/**
 * Organization Access Summary
 */
interface OrganizationAccessSummary {
    /**
     * Is read only?
     */
    val readOnly: Boolean
    /**
     * Organization Id
     */
    val orgId: Int
    /**
     * Client Id
     */
    val clientId: Int
}
