package net.benwoodworth.greeter.core

/**
 * An event for players who join the server.
 */
interface JoinEvent {

    /**
     * The player who logged in.
     */
    val player: Player
}
