package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

        import eu.h2020.helios_social.modules.groupcommunications.api.forum.sharing.ForumAccessRequest;
        import eu.h2020.helios_social.modules.groupcommunications.api.privategroup.sharing.GroupInvitation;

public class GroupAccessRequestAddedEvent extends Event {

    private ForumAccessRequest invite;

    public GroupAccessRequestAddedEvent(ForumAccessRequest invite) {
        this.invite = invite;
    }

    public ForumAccessRequest getInvite() {
        return invite;
    }

}
