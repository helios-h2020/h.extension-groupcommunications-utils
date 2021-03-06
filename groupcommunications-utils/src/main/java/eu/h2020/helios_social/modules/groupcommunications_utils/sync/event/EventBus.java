package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import eu.h2020.helios_social.modules.groupcommunications_utils.nullsafety.NotNullByDefault;

@NotNullByDefault
public interface EventBus {

	/**
	 * Adds a listener to be notified when events occur.
	 */
	void addListener(EventListener l);

	/**
	 * Removes a listener.
	 */
	void removeListener(EventListener l);

	/**
	 * Asynchronously notifies all listeners of an event. Listeners are
	 * notified on the {@link EventExecutor}.
	 */
	void broadcast(Event e);
}
