package net.benwoodworth.greeter.bukkit

import net.benwoodworth.greeter.core.Greeter
import org.bukkit.plugin.java.JavaPlugin

/**
 * The Bukkit implementation of the Greeter.
 */
class BukkitGreeter : JavaPlugin() {

    override fun onEnable() {
        Greeter.loadGreeter(Greeter(
                joinListener = BukkitJoinListener(this),
                logger = BukkitLogger(this)
        ))
    }
}
