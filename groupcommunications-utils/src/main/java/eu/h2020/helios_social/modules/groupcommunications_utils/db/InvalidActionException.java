package eu.h2020.helios_social.modules.groupcommunications_utils.db;

import eu.h2020.helios_social.modules.groupcommunications.api.exception.DbException;

public class InvalidActionException extends DbException {

    private String message;

    public InvalidActionException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
