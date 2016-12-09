package net.benwoodworth.greeter.bukkit

import net.benwoodworth.greeter.core.Greeter
import org.bukkit.plugin.java.JavaPlugin

/**
 * The Bukkit implementation of the Greeter.
 */
class BukkitGreeter : JavaPlugin() {

    val greeter: Greeter by lazy {
        Greeter(BukkitJoinListener(this))
    }

    override fun onEnable() = greeter.load()
}
