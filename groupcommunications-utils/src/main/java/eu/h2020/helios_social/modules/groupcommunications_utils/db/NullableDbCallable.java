package eu.h2020.helios_social.modules.groupcommunications_utils.db;

import javax.annotation.Nullable;

import eu.h2020.helios_social.modules.groupcommunications_utils.nullsafety.NotNullByDefault;
import eu.h2020.helios_social.modules.groupcommunications.api.exception.DbException;

@NotNullByDefault
public interface NullableDbCallable<R, E extends Exception> {

	@Nullable
	R call(Transaction txn) throws DbException, E;
}
