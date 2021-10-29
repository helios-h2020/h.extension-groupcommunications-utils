package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import eu.h2020.helios_social.modules.groupcommunications_utils.nullsafety.NotNullByDefault;
import jdk.nashorn.internal.ir.annotations.Immutable;

@Immutable
@NotNullByDefault
public class ContextRenamedEvent extends Event {

    private final String contextId;
    private final String name;
    public ContextRenamedEvent(String contextId, String name) {
        this.contextId = contextId;
        this.name = name;
    }

    public String getContextId() {
        return contextId;
    }

    public String getName() { return name;}
}
