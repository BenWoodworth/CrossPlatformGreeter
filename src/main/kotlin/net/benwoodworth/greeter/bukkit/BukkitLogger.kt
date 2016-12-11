package net.benwoodworth.greeter.bukkit

import net.benwoodworth.greeter.core.Logger
import org.bukkit.plugin.java.JavaPlugin


/**
 * Logs messages to the Bukkit server console.
 */
class BukkitLogger(private val plugin: JavaPlugin) : Logger {

    override fun log(message: String) {
        plugin.logger.info(message)
    }
}
