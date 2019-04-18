package software.hsharp.core.models

import javax.mail.internet.InternetAddress

/**
 * Email including the information about server it is sent througj.
 */
interface Email {

    /**
     * Server address
     */
    var smtpHost: String
    /**
     * Server port
     */
    var smtpPort: Int
    /**
     * Sender
     */
    var from: InternetAddress

    /**
     * Add recepient
     */
    fun addTo(newTo: String): Boolean

    /**
     * Add CC
     */
    fun addCc(newCc: String): Boolean

    /**
     * Add BCC
     */
    fun addBcc(newBcc: String): Boolean

    /**
     * replyTo
     */
    var replyTo: InternetAddress
    /**
     * Email Subject
     */
    var subject: String
    /**
     * Message content in HTML
     */
    var messageInHTML: String

    /**
     * Is valid to be sent?
     */
    fun isValid(): Boolean

    /**
     * Sent the email
     */
    fun send(): String

    /**
     * Email server username
     */
    var userName: String
    /**
     * Email server password
     */
    var password: String
}