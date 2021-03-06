package eu.h2020.helios_social.modules.groupcommunications_utils.sync.event;

import javax.annotation.Nullable;

import eu.h2020.helios_social.modules.groupcommunications_utils.nullsafety.NotNullByDefault;
import eu.h2020.helios_social.modules.groupcommunications.api.context.DBContext;
import jdk.nashorn.internal.ir.annotations.Immutable;

@Immutable
@NotNullByDefault
public class ContextAddedEvent extends Event {

	@Nullable
	private final DBContext dbContext;

	public ContextAddedEvent(DBContext dbContext) {
		this.dbContext = dbContext;
	}

	/**
	 * Returns the context the added on database
	 */
	@Nullable
	public DBContext getContext() {
		return dbContext;
	}
}
