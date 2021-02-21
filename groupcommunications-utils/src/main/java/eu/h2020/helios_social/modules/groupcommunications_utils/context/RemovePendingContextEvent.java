package eu.h2020.helios_social.modules.groupcommunications_utils.context;

import eu.h2020.helios_social.modules.groupcommunications_utils.sync.event.Event;

public class RemovePendingContextEvent extends Event {

	private String pendingContextId;
	public RemovePendingContextEvent(String pendingContextId) {
		this.pendingContextId = pendingContextId;
	}

	public String getPendingContextId() {
		return pendingContextId;
	}
}
