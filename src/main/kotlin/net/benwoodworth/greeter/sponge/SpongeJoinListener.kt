package net.benwoodworth.greeter.sponge

import net.benwoodworth.greeter.core.JoinListener
import org.spongepowered.api.Sponge
import org.spongepowered.api.event.Listener
import org.spongepowered.api.event.network.ClientConnectionEvent

/**
 * Listens for Sponge join events.
 */
class SpongeJoinListener : JoinListener {

    constructor(spongeGreeter: SpongeGreeter) {
        Sponge.getEventManager().registerListeners(spongeGreeter, this)
    }

    @Listener
    fun onPlayerJoin(event: ClientConnectionEvent.Join) {
        raiseEvent(SpongeJoinEvent(event))
    }
}
