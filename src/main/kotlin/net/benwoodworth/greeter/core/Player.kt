package net.benwoodworth.greeter.core

/**
 * Created by ben on 12/8/16.
 */
interface Player {

    /**
     * The player's name.
     */
    val name: String

    /**
     * Send a message to the player.
     *
     * @param message The message to send.
     */
    fun sendMessage(message: String)
}
