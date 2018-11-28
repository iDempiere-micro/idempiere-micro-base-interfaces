package org.idempiere.common.exceptions

/**
 * Any exception that occurs inside the Adempiere core
 *
 * @author Teo Sarca, SC ARHIPAC SERVICE SRL
 */
open class AdempiereException : RuntimeException {

    /** @param message
     */
    constructor(message: String) : super(message) {}

    /** @param cause
     */
    constructor(cause: Throwable) : super(cause) {}

    /**
     * @param message
     * @param cause
     */
    constructor(message: String, cause: Throwable) : super(message, cause) {}

    override fun getLocalizedMessage(): String {
        val msg = super.getLocalizedMessage()
        // msg = Msg.parseTranslation(getCtx(), msg); DAP TODO
        return msg
    }

    companion object {
        /**  */
        private const val serialVersionUID = 2340179640558569534L
    }
}
