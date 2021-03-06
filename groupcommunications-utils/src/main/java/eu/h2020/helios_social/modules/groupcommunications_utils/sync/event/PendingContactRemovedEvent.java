package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import javax.annotation.concurrent.Immutable;

import eu.h2020.helios_social.modules.groupcommunications_utils.sync.event.Event;
import eu.h2020.helios_social.modules.groupcommunications_utils.nullsafety.NotNullByDefault;
import eu.h2020.helios_social.modules.groupcommunications.api.contact.ContactId;

/**
 * An event that is broadcast when a pending contact is removed.
 */
@Immutable
@NotNullByDefault
public class PendingContactRemovedEvent extends Event {

	private final ContactId pendingContactId;

	public PendingContactRemovedEvent(ContactId pendingContactId) {
		this.pendingContactId = pendingContactId;
	}

	public ContactId getId() {
		return pendingContactId;
	}

}
