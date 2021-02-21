package eu.h2020.helios_social.happ.helios.talk.api.sync.event;

import eu.h2020.helios_social.happ.helios.talk.api.event.Event;
import eu.h2020.helios_social.modules.groupcommunications.api.privategroup.sharing.GroupInvitation;

public class GroupInvitationAutoAcceptEvent extends Event {

    private final GroupInvitation groupInvitation;

    public GroupInvitationAutoAcceptEvent(GroupInvitation groupInvitation) {
        this.groupInvitation = groupInvitation;
    }

    public GroupInvitation getGroupInvitation() {
        return groupInvitation;
    }
}
