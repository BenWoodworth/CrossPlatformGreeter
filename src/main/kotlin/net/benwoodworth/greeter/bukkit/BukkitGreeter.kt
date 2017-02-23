package net.benwoodworth.greeter.bukkit

import dagger.Component
import dagger.Module
import net.benwoodworth.greeter.core.Greeter
import org.bukkit.plugin.java.JavaPlugin

/**
 * The Bukkit implementation of the Greeter.
 */
class BukkitGreeter : JavaPlugin() {

    override fun onEnable() {

    }

    @Component(modules = arrayOf(BukkitGreeterModule::class))
    interface BukkitGreeterComponent {

        fun plugin(): Greeter
    }

    @Module
    class BukkitGreeterModule {

    }
}
