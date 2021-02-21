package eu.h2020.helios_social.modules.groupcommunications_utils.db;

import eu.h2020.helios_social.modules.groupcommunications_utils.sync.event.EventExecutor;

/**
 * A {@link CommitAction} that submits a task to the {@link EventExecutor}.
 */
public class TaskAction implements CommitAction {

	private final Runnable task;

	TaskAction(Runnable task) {
		this.task = task;
	}

	public Runnable getTask() {
		return task;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
