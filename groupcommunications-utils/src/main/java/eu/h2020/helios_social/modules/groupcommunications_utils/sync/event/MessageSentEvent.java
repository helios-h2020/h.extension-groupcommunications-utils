package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

public class MessageSentEvent extends Event {

    private final String messageId;

    public MessageSentEvent(String messageId) {
        this.messageId = messageId;
    }

    public String getMessageId() {
        return messageId;
    }
}
