package eu.h2020.helios_social.modules.groupcommunications_utils.settings.event;

import javax.annotation.concurrent.Immutable;

import eu.h2020.helios_social.modules.groupcommunications_utils.sync.event.Event;
import eu.h2020.helios_social.modules.groupcommunications_utils.nullsafety.NotNullByDefault;
import eu.h2020.helios_social.modules.groupcommunications_utils.settings.Settings;

/**
 * An event that is broadcast when one or more settings are updated.
 */
@Immutable
@NotNullByDefault
public class SettingsUpdatedEvent extends Event {

	private final String namespace;
	private final Settings settings;

	public SettingsUpdatedEvent(String namespace, Settings settings) {
		this.namespace = namespace;
		this.settings = settings;
	}

	public String getNamespace() {
		return namespace;
	}

	public Settings getSettings() {
		return settings;
	}
}
