package com.isac.canedo.poc.security.exceptions;


public class MalformedJwtException extends RuntimeException {
    public MalformedJwtException(String message) {
        super(message);
    }
}
