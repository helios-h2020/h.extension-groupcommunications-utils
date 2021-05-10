package eu.h2020.helios_social.modules.groupcommunications_utils.data;

import java.io.OutputStream;

import eu.h2020.helios_social.modules.groupcommunications_utils.nullsafety.NotNullByDefault;

@NotNullByDefault
public interface BdfWriterFactory {

	BdfWriter createWriter(OutputStream out);
}
