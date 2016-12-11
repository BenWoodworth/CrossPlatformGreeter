package net.benwoodworth.greeter.sponge

import net.benwoodworth.greeter.core.Logger
import org.spongepowered.api.Sponge
import org.spongepowered.api.text.Text

/**
 * Logs messages to the Sponge server console.
 */
class SpongeLogger : Logger {

    override fun log(message: String) {
        val console = Sponge.getGame().server.console
        val text = Text.of(message)

        console.sendMessage(text)
    }
}
