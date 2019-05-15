package com.walmart.ticket.exception;

import com.walmart.ticket.common.entity.ClientError;

import java.util.List;

/**
 
 *
 * {@link RuntimeException} used for validation clientErrors
 */
public class CustomValidationException extends RuntimeException {

    private final List<ClientError> clientErrors;

    public CustomValidationException(final List<ClientError> clientErrors) {
        this.clientErrors = clientErrors;
    }

    public List<ClientError> getClientErrors() {
        return clientErrors;
    }
}
