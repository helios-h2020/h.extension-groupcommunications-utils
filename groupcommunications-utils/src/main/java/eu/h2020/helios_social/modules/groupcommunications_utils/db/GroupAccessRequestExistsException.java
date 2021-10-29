package eu.h2020.helios_social.modules.groupcommunications_utils.db;

        import eu.h2020.helios_social.modules.groupcommunications.api.exception.DbException;
        import eu.h2020.helios_social.modules.groupcommunications.api.forum.sharing.ForumAccessRequest;
        import eu.h2020.helios_social.modules.groupcommunications.api.privategroup.sharing.GroupInvitation;

/**
 * Thrown when a duplicate pending group access request is added to the database. This
 * exception may occur due to concurrent updates and does not indicate a
 * database error.
 */
public class GroupAccessRequestExistsException extends DbException {

    private final ForumAccessRequest forumAccessRequest;

    public GroupAccessRequestExistsException(ForumAccessRequest forumAccessRequest) {
        this.forumAccessRequest = forumAccessRequest;
    }

    public ForumAccessRequest getForumAccessRequest() {
        return forumAccessRequest;
    }
}
