package net.benwoodworth.greeter.sponge

import dagger.Component
import dagger.Module
import dagger.Provides
import net.benwoodworth.greeter.core.Greeter
import net.benwoodworth.greeter.core.JoinListener
import net.benwoodworth.greeter.core.Logger
import org.spongepowered.api.event.Listener
import org.spongepowered.api.event.game.state.GamePreInitializationEvent
import org.spongepowered.api.plugin.Plugin
import javax.inject.Singleton

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
        val component = DaggerSpongeGreeter_SpongeGreeterComponent.builder().build()
        val plugin = component.plugin()
        plugin.loadPlugin()
    }

    @Singleton
    @Component(modules = arrayOf(SpongeGreeterModule::class))
    interface SpongeGreeterComponent {

        fun plugin(): Greeter
    }

    @Module
    inner class SpongeGreeterModule {

        @Provides @Singleton
        fun joinListener(): JoinListener = SpongeJoinListener(this@SpongeGreeter)

        @Provides @Singleton
        fun logger(): Logger = SpongeLogger()
    }
}
