package net.benwoodworth.greeter.sponge

import net.benwoodworth.greeter.core.Greeter
import org.spongepowered.api.event.Listener
import org.spongepowered.api.plugin.Plugin
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;

/**
 * The Sponge implementation of the Greeter.
 */
@Plugin(id = "cross-platform-greeter",
        name = "Cross Platform Greeter",
        description = "A cross platform Greeter.",
        url = "https://github.com/BenWoodworth/CrossPlatformGreeter",
        authors = arrayOf("Kepler_"))
class SpongeGreeter {

    val greeter: Greeter by lazy {
        Greeter(SpongeJoinListener(this))
    }

    @Listener
    fun onPreInit(event: GamePreInitializationEvent) = greeter.load()
}
