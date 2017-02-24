package net.benwoodworth.greeter.bukkit

import dagger.Component
import dagger.Module
import dagger.Provides
import net.benwoodworth.greeter.core.Greeter
import net.benwoodworth.greeter.core.JoinListener
import net.benwoodworth.greeter.core.Logger
import org.bukkit.plugin.java.JavaPlugin
import javax.inject.Singleton

/**
 * The Bukkit implementation of the Greeter.
 */
class BukkitGreeter : JavaPlugin() {

    override fun onEnable() {
        val component = DaggerBukkitGreeter_BukkitGreeterComponent.builder().build()
        val plugin = component.plugin()
        plugin.loadPlugin()
    }

    @Singleton
    @Component(modules = arrayOf(BukkitGreeterModule::class))
    interface BukkitGreeterComponent {

        fun plugin(): Greeter
    }

    @Module
    inner class BukkitGreeterModule {

        @Provides @Singleton
        fun joinListener(): JoinListener = BukkitJoinListener(this@BukkitGreeter)

        @Provides @Singleton
        fun logger(): Logger = BukkitLogger(this@BukkitGreeter)
    }
}
