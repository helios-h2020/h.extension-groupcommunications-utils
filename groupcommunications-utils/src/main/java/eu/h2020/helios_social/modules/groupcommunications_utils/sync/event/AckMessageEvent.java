package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import eu.h2020.helios_social.modules.groupcommunications.api.contact.ContactId;
import eu.h2020.helios_social.modules.groupcommunications.api.messaging.Message;

public class AckMessageEvent extends Event {

    private ContactId contactId;
    private Message ack;

    public AckMessageEvent(ContactId contactId, Message ack) {
        this.contactId = contactId;
        this.ack = ack;
    }

    public Message getAck() {
        return ack;
    }

    public ContactId getContactId() {
        return contactId;
    }
}
