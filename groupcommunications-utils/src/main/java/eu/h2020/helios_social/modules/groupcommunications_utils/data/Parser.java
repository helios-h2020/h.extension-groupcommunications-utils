package eu.h2020.helios_social.modules.groupcommunications_utils.data;

import eu.h2020.helios_social.modules.groupcommunications_utils.db.Metadata;
import eu.h2020.helios_social.modules.groupcommunications_utils.nullsafety.NotNullByDefault;
import eu.h2020.helios_social.modules.groupcommunications.api.exception.FormatException;

@NotNullByDefault
public interface Parser {

	BdfDictionary parseMetadata(Metadata m) throws FormatException;

	BdfList parseToList(byte[] b) throws FormatException;
}
