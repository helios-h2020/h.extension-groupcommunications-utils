package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import javax.annotation.Nullable;

public class ContactRemovedFromContextEvent extends Event {

    private final String contextId;
    private final String contactId;

    public ContactRemovedFromContextEvent(String contactId, String contextId) {
        this.contactId = contactId;
        this.contextId = contextId;
    }

    public String getContextId() {
        return contextId;
    }

    public String getContactId() {
        return contactId;
    }
}