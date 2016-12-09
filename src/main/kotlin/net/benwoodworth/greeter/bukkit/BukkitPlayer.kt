package net.benwoodworth.greeter.bukkit

import net.benwoodworth.greeter.core.Player

/**
 * Created by ben on 12/8/16.
 */
class BukkitPlayer(private val player: org.bukkit.entity.Player) : Player {

    override val name: String
        get() = player.name

    override fun sendMessage(message: String) = player.sendMessage(message)
}
