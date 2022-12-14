package org.acme.model.exception;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.core.Response;

public class ConflictException extends ClientErrorException {
    public ConflictException(String message) {
        super(message, Response.Status.CONFLICT); // 409
    }
}
