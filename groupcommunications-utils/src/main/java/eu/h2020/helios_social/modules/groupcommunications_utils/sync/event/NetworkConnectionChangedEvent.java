package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import javax.annotation.concurrent.Immutable;

import eu.h2020.helios_social.modules.groupcommunications_utils.nullsafety.NotNullByDefault;

@Immutable
@NotNullByDefault
public class NetworkConnectionChangedEvent extends Event{

    private final boolean isConnected;
    private final int connectionCode;
    public NetworkConnectionChangedEvent(boolean isConnected, int connectionCode) {
        this.isConnected = isConnected;
        this.connectionCode = connectionCode;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public int getConnectionCode() {
        return connectionCode;
    }
}
