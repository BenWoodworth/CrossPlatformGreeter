package net.benwoodworth.greeter.sponge

import net.benwoodworth.greeter.core.Player
import org.spongepowered.api.text.Text

/**
 * Created by ben on 12/8/16.
 */
class SpongePlayer(private val player: org.spongepowered.api.entity.living.player.Player) : Player {

    override val name: String
        get() = player.name

    override fun sendMessage(message: String) = player.sendMessage(Text.of(message))
}
