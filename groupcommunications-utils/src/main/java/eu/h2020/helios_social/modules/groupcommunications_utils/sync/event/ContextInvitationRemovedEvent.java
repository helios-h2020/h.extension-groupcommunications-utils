package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import eu.h2020.helios_social.modules.groupcommunications_utils.sync.event.Event;
import eu.h2020.helios_social.modules.groupcommunications.api.contact.ContactId;

public class ContextInvitationRemovedEvent extends Event {

	private ContactId contactId;
	private String pendingContextId;

	public ContextInvitationRemovedEvent(ContactId contactId,
			String pendingContextId) {
		this.contactId = contactId;
		this.pendingContextId = pendingContextId;
	}

	public ContactId getContactId() {
		return contactId;
	}

	public String getPendingContextId() {
		return pendingContextId;
	}
}
