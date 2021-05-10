package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import eu.h2020.helios_social.modules.groupcommunications.api.contact.ContactId;
import eu.h2020.helios_social.modules.groupcommunications.api.profile.Profile;

public class ProfileReceivedEvent extends Event {

    private ContactId contactId;
    private Profile profile;

    public ProfileReceivedEvent(ContactId contactId, Profile profile) {
        this.contactId = contactId;
        this.profile = profile;
    }

    public ContactId getContactId() {
        return contactId;
    }

    public Profile getProfile() {
        return profile;
    }
}
