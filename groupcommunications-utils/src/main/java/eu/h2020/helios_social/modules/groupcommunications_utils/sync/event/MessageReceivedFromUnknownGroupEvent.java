package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

public class MessageReceivedFromUnknownGroupEvent extends Event {

    private String groupId;
    private String peerId;

    public MessageReceivedFromUnknownGroupEvent(String peerId, String groupId) {
        this.groupId = groupId;
        this.peerId = peerId;
    }

    public String getPeerId() {
        return peerId;
    }

    public String getGroupId() {
        return groupId;
    }
}
