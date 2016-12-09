package net.benwoodworth.greeter.core

/**
 * Listens for a player join event.
 */
abstract class JoinListener {

    /**
     * The join event handlers.
     */
    private val handlers = mutableListOf<(JoinEvent) -> Unit>()

    /**
     * Raise a join event.
     */
    protected fun raiseEvent(event: JoinEvent) = handlers.forEach { it(event) }

    /**
     * Register a join event handler.
     */
    operator fun plusAssign(handler: (JoinEvent) -> Unit) { handlers += handler }
}
