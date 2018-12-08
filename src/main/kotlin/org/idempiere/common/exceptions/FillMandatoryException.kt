package org.idempiere.common.exceptions

/**
 * Throwed when there are some fields that are mandatory but unfilled.
 * @author Teo Sarca, SC ARHIPAC SERVICE SRL
 */
class FillMandatoryException(vararg fields: String) : AdempiereException("@FillMandatory@ " + buildMessage(fields)) {
    companion object {
        private val serialVersionUID = 9074980284529933724L

        private fun buildMessage(fields: Array<out String>): String {
            val sb = StringBuilder()
            for (f in fields) {
                if (sb.isNotEmpty())
                    sb.append(", ")
                sb.append("@").append(f).append("@")
            }
            return sb.toString()
        }
    }
}