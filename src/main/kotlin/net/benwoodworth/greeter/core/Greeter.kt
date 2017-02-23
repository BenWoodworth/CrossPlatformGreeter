package net.benwoodworth.greeter.core

import javax.inject.Inject

/**
 * The core class of the Greeter plugin.
 *
 * @param joinListener The join event listener.
 * @param logger The console logger.
 */
class Greeter @Inject constructor(
        val joinListener: JoinListener,
        val logger: Logger
) {

    /**
     * Load the Greeter plugin.
     */
    public fun loadPlugin() {
        joinListener += { joinEventHandler(it) }

        logger.log("Hello Server!")
    }

    /**
     * Handles players logging in.
     */
    private fun joinEventHandler(joinEvent: JoinEvent) {
        val player = joinEvent.player
        val name = player.name

        player.sendMessage("Hello, $name! Welcome to the server.")
    }
}
