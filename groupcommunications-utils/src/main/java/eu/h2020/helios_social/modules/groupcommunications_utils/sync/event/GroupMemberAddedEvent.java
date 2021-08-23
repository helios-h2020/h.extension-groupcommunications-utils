package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import javax.annotation.concurrent.Immutable;

import eu.h2020.helios_social.modules.groupcommunications.api.group.GroupMember;
import eu.h2020.helios_social.modules.groupcommunications_utils.sync.event.Event;
import eu.h2020.helios_social.modules.groupcommunications_utils.nullsafety.NotNullByDefault;
import eu.h2020.helios_social.modules.groupcommunications.api.contact.Contact;

/**
 * An event that is broadcast when a group member is added.
 */
@Immutable
@NotNullByDefault
public class GroupMemberAddedEvent extends Event {

    private final GroupMember groupMember;

    public GroupMemberAddedEvent(GroupMember groupMember) {
        this.groupMember = groupMember;
    }

    public GroupMember getContact() {
        return groupMember;
    }

}
