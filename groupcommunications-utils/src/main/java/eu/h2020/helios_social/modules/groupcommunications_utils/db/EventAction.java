package eu.h2020.helios_social.modules.groupcommunications_utils.db;

import eu.h2020.helios_social.modules.groupcommunications_utils.sync.event.Event;

/**
 * A {@link CommitAction} that broadcasts an event.
 */
public class EventAction implements CommitAction {

	private final Event event;

	public EventAction(Event event) {
		this.event = event;
	}

	public Event getEvent() {
		return event;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
