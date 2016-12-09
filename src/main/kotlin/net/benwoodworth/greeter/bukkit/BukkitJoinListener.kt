package net.benwoodworth.greeter.bukkit

import net.benwoodworth.greeter.core.JoinListener
import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

/**
 * Listens for Bukkit join events.
 */
class BukkitJoinListener : Listener, JoinListener {

    constructor(bukkitGreeter: BukkitGreeter) {
        Bukkit.getPluginManager().registerEvents(this, bukkitGreeter)
    }

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        raiseEvent(BukkitJoinEvent(event))
    }
}
