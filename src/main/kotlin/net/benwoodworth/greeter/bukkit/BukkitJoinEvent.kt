package net.benwoodworth.greeter.bukkit

import net.benwoodworth.greeter.core.JoinEvent
import org.bukkit.event.player.PlayerJoinEvent

/**
 * A Bukkit player join event.
 */
class BukkitJoinEvent(private val joinEvent: PlayerJoinEvent) : JoinEvent {

    override val player by lazy<BukkitPlayer> {
        BukkitPlayer(joinEvent.player)
    }
}
