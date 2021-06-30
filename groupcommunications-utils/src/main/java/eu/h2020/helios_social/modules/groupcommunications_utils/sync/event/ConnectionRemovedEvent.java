package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import eu.h2020.helios_social.modules.groupcommunications.api.contact.Contact;

public class ConnectionRemovedEvent extends Event {

    private final Contact removedConnection;

    public ConnectionRemovedEvent(Contact removedConnection) {
        this.removedConnection = removedConnection;
    }

    public Contact getRemovedConnection() {
        return removedConnection;
    }
}
