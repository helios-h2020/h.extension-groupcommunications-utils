package eu.h2020.helios_social.happ.helios.talk.api.crypto;

import eu.h2020.helios_social.happ.helios.talk.api.nullsafety.NotNullByDefault;

@NotNullByDefault
public interface PasswordStrengthEstimator {

	float NONE = 0;
	float WEAK = 0.25f;
	float QUITE_WEAK = 0.5f;
	float QUITE_STRONG = 0.75f;
	float STRONG = 1;

	/**
	 * Returns an estimate between 0 (weakest) and 1 (strongest), inclusive,
	 * of the strength of the given password.
	 */
	float estimateStrength(String password);
}
