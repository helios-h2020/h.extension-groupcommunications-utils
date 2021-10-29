package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;


public class ProfilingStateEvent extends Event {

    private final String state;

    public ProfilingStateEvent(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
