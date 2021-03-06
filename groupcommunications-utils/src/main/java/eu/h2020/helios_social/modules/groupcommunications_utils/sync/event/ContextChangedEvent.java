package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import javax.annotation.Nullable;

import eu.h2020.helios_social.modules.groupcommunications_utils.nullsafety.NotNullByDefault;
import jdk.nashorn.internal.ir.annotations.Immutable;

@Immutable
@NotNullByDefault
public class ContextChangedEvent extends Event {

	@Nullable
	private final String context_name;

	public ContextChangedEvent(@Nullable String name) {
		this.context_name = name;
	}

	/**
	 * Returns the name of the added context
	 */
	@Nullable
	public String getContextName() {
		return context_name;
	}
}
