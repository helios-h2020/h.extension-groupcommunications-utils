package eu.h2020.helios_social.modules.groupcommunications_utils.db;

import eu.h2020.helios_social.modules.groupcommunications_utils.nullsafety.NotNullByDefault;
import eu.h2020.helios_social.modules.groupcommunications.api.exception.DbException;

@NotNullByDefault
public interface DbRunnable<E extends Exception> {

	void run(Transaction txn) throws DbException, E;
}
