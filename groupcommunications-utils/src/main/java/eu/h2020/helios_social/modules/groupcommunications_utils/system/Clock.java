package eu.h2020.helios_social.modules.groupcommunications_utils.system;

/**
 * An interface for time-related system functions that allows them to be
 * replaced for testing.
 */
public interface Clock {

	/**
	 * @see System#currentTimeMillis()
	 */
	long currentTimeMillis();

	/**
	 * @see Thread#sleep(long)
	 */
	void sleep(long milliseconds) throws InterruptedException;
}
