package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import javax.annotation.Nullable;

import eu.h2020.helios_social.modules.groupcommunications_utils.nullsafety.NotNullByDefault;
import jdk.nashorn.internal.ir.annotations.Immutable;

/**
 * An event that is broadcast when a context is removed from the database.
 */
@Immutable
@NotNullByDefault
public class ContextRemovedEvent extends Event {
	@Nullable
	private final String contextId;

	public ContextRemovedEvent(String contextId) {
		this.contextId = contextId;
	}

	public String getContextId() {
		return contextId;
	}
}
