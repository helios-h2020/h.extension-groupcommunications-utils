package eu.h2020.helios_social.modules.groupcommunications_utils.crypto;

import eu.h2020.helios_social.modules.groupcommunications_utils.nullsafety.NotNullByDefault;

@NotNullByDefault
public class DecryptionException extends Exception {

	private final DecryptionResult result;

	public DecryptionException(DecryptionResult result) {
		this.result = result;
	}

	public DecryptionResult getDecryptionResult() {
		return result;
	}
}
