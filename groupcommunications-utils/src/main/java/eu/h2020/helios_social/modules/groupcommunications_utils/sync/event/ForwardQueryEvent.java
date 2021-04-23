package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import java.util.List;

import eu.h2020.helios_social.modules.groupcommunications.api.peer.PeerId;
import eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.queries.Query;

public class ForwardQueryEvent extends Event {

    private Query query;
    private List<PeerId> forwardList;

    public ForwardQueryEvent(Query query, List<PeerId> forwardList) {
        this.query = query;
        this.forwardList = forwardList;
    }

    public Query getQuery() {
        return query;
    }

    public List<PeerId> getForwardList() {
        return forwardList;
    }
}
