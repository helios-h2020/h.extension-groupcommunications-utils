package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import eu.h2020.helios_social.modules.groupcommunications.api.contact.Contact;

public class ConnectionRemovedFromContextEvent extends Event {

    private final Contact connection;
    private final String contextName;
    private final String contextId;

    public ConnectionRemovedFromContextEvent(Contact connection, String contextName, String contextId) {
        this.connection = connection;
        this.contextName = contextName;
        this.contextId = contextId;
    }

    public Contact getConnection() {
        return connection;
    }

    public String getContextName() {
        return contextName;
    }

    public String getContextId() {
        return contextId;
    }
}
