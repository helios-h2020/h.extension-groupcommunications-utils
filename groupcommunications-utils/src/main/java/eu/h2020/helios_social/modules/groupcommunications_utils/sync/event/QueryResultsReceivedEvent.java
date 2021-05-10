package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.queries.QueryResponse;
import eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.queries.Queryable;

public class QueryResultsReceivedEvent extends Event {

    private final QueryResponse<Queryable> queryResponse;

    public QueryResultsReceivedEvent(QueryResponse<Queryable> queryResponse) {
        this.queryResponse = queryResponse;
    }

    public QueryResponse<Queryable> getQueryResponse() {
        return queryResponse;
    }
}
