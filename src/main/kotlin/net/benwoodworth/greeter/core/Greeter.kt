package net.benwoodworth.greeter.core

/**
 * The core class of the Greeter plugin.
 *
 * @param joinListener The join event listener.
 * @param logger The console logger.
 */
class Greeter(
        val joinListener: JoinListener,
        val logger: Logger
) {

    companion object {
        private var loaded = false

        @JvmStatic
        lateinit var instance: Greeter
            private set

        @JvmStatic
        fun loadGreeter(greeter: Greeter) {
            if (loaded) throw IllegalStateException("Greeter can only be initialized once.")
            loaded = true

            instance = greeter
            greeter.loadPlugin()
        }
    }

    /**
     * Load the Greeter plugin.
     */
    private fun loadPlugin() {
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
