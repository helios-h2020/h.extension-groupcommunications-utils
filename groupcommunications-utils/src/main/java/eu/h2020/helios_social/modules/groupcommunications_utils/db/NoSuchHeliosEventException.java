package eu.h2020.helios_social.modules.groupcommunications_utils.db;

import eu.h2020.helios_social.modules.groupcommunications.api.exception.DbException;

/**
 * Thrown when a database operation is attempted for an Helios Event that is not in
 * the database. This exception may occur due to concurrent updates and does
 * not indicate a database error.
 */
public class NoSuchHeliosEventException extends DbException {
}
