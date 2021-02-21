package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

public class RemovePendingGroupEvent extends Event {

	private String pendingGroupId;

	public RemovePendingGroupEvent(String pendingGroupId) {
		this.pendingGroupId = pendingGroupId;
	}

	public String getPendingGroupId() {
		return pendingGroupId;
	}
}
