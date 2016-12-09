package net.benwoodworth.greeter.sponge

import net.benwoodworth.greeter.core.JoinEvent
import org.spongepowered.api.event.network.ClientConnectionEvent

/**
 * A Sponge player join event.
 */
class SpongeJoinEvent(private val joinEvent: ClientConnectionEvent.Join) : JoinEvent {

    override val player by lazy<SpongePlayer> {
        SpongePlayer(joinEvent.targetEntity)
    }
}
