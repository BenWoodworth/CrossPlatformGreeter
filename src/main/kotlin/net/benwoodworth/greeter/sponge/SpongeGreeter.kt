package net.benwoodworth.greeter.sponge

import net.benwoodworth.greeter.core.Greeter
import org.spongepowered.api.event.Listener
import org.spongepowered.api.plugin.Plugin
import org.spongepowered.api.event.game.state.GamePreInitializationEvent

/**
 * The Sponge implementation of the Greeter.
 */
@Plugin(id = "cross-platform-greeter",
        name = "Cross Platform Greeter",
        description = "A cross platform Greeter.",
        url = "https://github.com/BenWoodworth/CrossPlatformGreeter",
        authors = arrayOf("Kepler_"))
class SpongeGreeter {

    @Listener
    fun onPreInit(event: GamePreInitializationEvent) {
        Greeter.loadGreeter(Greeter(
                joinListener = SpongeJoinListener(this),
                logger = SpongeLogger()
        ))
    }
}
