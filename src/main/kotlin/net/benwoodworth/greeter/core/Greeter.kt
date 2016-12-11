package net.benwoodworth.greeter.core

/**
 * The core class of the Greeter plugin.
 */
interface Greeter {

    /**
     * The join event listener.
     */
    val joinListener: JoinListener

    /**
     * Load the Greeter plugin.
     */
    fun load() {
        joinListener += { joinEventHandler(it) }

        System.out.println("Greeter loaded!")
    }

    /**
     * Handles players logging in.
     */
    fun joinEventHandler(joinEvent: JoinEvent) {
        val player = joinEvent.player
        val name = player.name

        player.sendMessage("Hello, $name! Welcome to the server.")
    }
}
