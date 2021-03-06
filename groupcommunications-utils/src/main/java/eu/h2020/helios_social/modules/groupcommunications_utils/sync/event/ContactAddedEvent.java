package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import javax.annotation.concurrent.Immutable;

import eu.h2020.helios_social.modules.groupcommunications_utils.sync.event.Event;
import eu.h2020.helios_social.modules.groupcommunications_utils.nullsafety.NotNullByDefault;
import eu.h2020.helios_social.modules.groupcommunications.api.contact.Contact;

/**
 * An event that is broadcast when a contact is added.
 */
@Immutable
@NotNullByDefault
public class ContactAddedEvent extends Event {

	private final Contact contact;

	public ContactAddedEvent(Contact contact) {
		this.contact = contact;
	}

	public Contact getContact() {
		return contact;
	}

}
