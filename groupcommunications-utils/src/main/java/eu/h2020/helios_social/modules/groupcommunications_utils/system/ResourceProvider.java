package eu.h2020.helios_social.modules.groupcommunications_utils.system;

import java.io.InputStream;

import eu.h2020.helios_social.modules.groupcommunications_utils.nullsafety.NotNullByDefault;

@NotNullByDefault
public interface ResourceProvider {

	InputStream getResourceInputStream(String name, String extension);
}
