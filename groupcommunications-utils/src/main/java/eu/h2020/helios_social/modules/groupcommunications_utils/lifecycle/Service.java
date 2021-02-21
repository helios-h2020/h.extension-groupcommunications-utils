package eu.h2020.helios_social.modules.groupcommunications_utils.lifecycle;

public interface Service {

	/**
	 * Starts the service.This method must not be called concurrently with
	 * {@link #stopService()}.
	 */
	void startService() throws ServiceException;

	/**
	 * Stops the service. This method must not be called concurrently with
	 * {@link #startService()}.
	 */
	void stopService() throws ServiceException;
}
