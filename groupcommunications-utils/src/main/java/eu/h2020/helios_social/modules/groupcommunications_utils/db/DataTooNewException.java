package eu.h2020.helios_social.modules.groupcommunications_utils.db;

import eu.h2020.helios_social.modules.groupcommunications.api.exception.DbException;

/**
 * Thrown when the database uses a newer schema than the current code.
 */
public class DataTooNewException extends DbException {
}
