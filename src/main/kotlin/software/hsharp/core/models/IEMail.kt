package software.hsharp.core.models

import javax.mail.internet.InternetAddress

/**
 * Email including the information about server it is sent througj.
 */
interface IEMail {

    /**
     * Server address
     */
    var SmtpHost: String
    /**
     * Server port
     */
    var SmtpPort: Int
    /**
     * Sender
     */
    var From: InternetAddress

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
     * ReplyTo
     */
    var ReplyTo: InternetAddress
    /**
     * Email Subject
     */
    var Subject: String
    /**
     * Message content in HTML
     */
    var MessageHTML: String

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
    var UserName: String
    /**
     * Email server password
     */
    var Password: String
}