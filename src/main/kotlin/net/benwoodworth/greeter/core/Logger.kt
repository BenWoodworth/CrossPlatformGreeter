package net.benwoodworth.greeter.core

/**
 * Logs message to the server console.
 */
interface Logger {

    /**
     * Log a message to the server console.
     *
     * @param message The message to log.
     */
    fun log(message: String)
}
