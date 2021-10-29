package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import eu.h2020.helios_social.modules.groupcommunications.api.privategroup.sharing.GroupInvitation;

public class GroupAccessRequestAutoAcceptInvitation extends Event {

    private final GroupInvitation groupInvitation;

    public GroupAccessRequestAutoAcceptInvitation(GroupInvitation groupInvitation) {
        this.groupInvitation = groupInvitation;
    }

    public GroupInvitation getGroupInvitation() {
        return groupInvitation;
    }
}
