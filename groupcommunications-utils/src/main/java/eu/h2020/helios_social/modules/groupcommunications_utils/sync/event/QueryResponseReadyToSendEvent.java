package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import eu.h2020.helios_social.modules.groupcommunications.api.peer.PeerId;
import eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.queries.QueryResponse;

public class QueryResponseReadyToSendEvent extends Event {

    private final PeerId peerId;
    private final QueryResponse queryResponse;

    public QueryResponseReadyToSendEvent(PeerId peerId, QueryResponse queryResponse) {
        this.peerId = peerId;
        this.queryResponse = queryResponse;
    }

    public PeerId getPeerId() {
        return peerId;
    }

    public QueryResponse getQueryResponse() {
        return queryResponse;
    }
}
