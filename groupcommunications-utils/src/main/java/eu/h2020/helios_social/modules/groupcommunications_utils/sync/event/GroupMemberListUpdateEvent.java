package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import java.util.Collection;

import eu.h2020.helios_social.modules.groupcommunications.api.group.GroupMember;

public class GroupMemberListUpdateEvent extends Event {

    private Collection<GroupMember> groupMembers;
    private String peerId;
    private String groupId;

    public GroupMemberListUpdateEvent(Collection<GroupMember> groupMembers, String peerId, String groupId) {
        this.groupMembers = groupMembers;
        this.peerId = peerId;
        this.groupId = groupId;
    }

    public Collection<GroupMember> getGroupMembers() {
        return groupMembers;
    }

    public String getPeerId() {
        return peerId;
    }

    public String getGroupId() {
        return groupId;
    }
}