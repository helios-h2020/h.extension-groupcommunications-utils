package eu.h2020.helios_social.modules.groupcommunications_utils.crypto;

import eu.h2020.helios_social.modules.groupcommunications_utils.nullsafety.NotNullByDefault;

/**
 * Interface for strengthening a password-based key, for example by using a
 * key stored in a key management service or hardware security module.
 */
@NotNullByDefault
public interface KeyStrengthener {

	/**
	 * Returns true if the strengthener has been initialised.
	 */
	@SuppressWarnings("BooleanMethodIsAlwaysInverted")
	boolean isInitialised();

	/**
	 * Initialises the strengthener if necessary and returns a strong key
	 * derived from the given key.
	 */
	SecretKey strengthenKey(SecretKey k);
}
