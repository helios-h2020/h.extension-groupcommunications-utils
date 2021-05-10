package eu.h2020.helios_social.modules.groupcommunications_utils.data;

import java.io.InputStream;

import eu.h2020.helios_social.modules.groupcommunications_utils.nullsafety.NotNullByDefault;

@NotNullByDefault
public interface BdfReaderFactory {

	BdfReader createReader(InputStream in);

	BdfReader createReader(InputStream in, int nestedLimit,
			int maxBufferSize);
}
