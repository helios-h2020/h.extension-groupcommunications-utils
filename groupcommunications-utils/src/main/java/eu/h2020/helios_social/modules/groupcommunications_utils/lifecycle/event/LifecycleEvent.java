package eu.h2020.helios_social.modules.groupcommunications_utils.lifecycle.event;

import eu.h2020.helios_social.modules.groupcommunications_utils.lifecycle.LifecycleManager.LifecycleState;

import eu.h2020.helios_social.modules.groupcommunications_utils.sync.event.Event;

/**
 * An event that is broadcast when the app enters a new lifecycle state.
 */
public class LifecycleEvent extends Event {

	private final LifecycleState state;

	public LifecycleEvent(LifecycleState state) {
		this.state = state;
	}

	public LifecycleState getLifecycleState() {
		return state;
	}
}
