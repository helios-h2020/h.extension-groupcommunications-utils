package eu.h2020.helios_social.modules.groupcommunications_utils.db;

import eu.h2020.helios_social.modules.groupcommunications.api.exception.DbException;

/**
 * Thrown when a database operation is attempted for a pending context invite that is
 * not in the database. This exception may occur due to concurrent updates and
 * does not indicate a database error.
 */
public class NoSuchPendingContextException extends DbException {
}
