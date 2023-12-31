package com.api.ufpso.tienda.util;

import lombok.Getter;

@Getter
public enum Constants {
    CATEGORIA_NOT_FOUND("User not found"),
    CATEGORIA_IS_NULL("User is null"),
    ARTICULO_NOT_FOUND("Address not found"),
    USER_NOT_FOUND("User not found"),
    USER_IS_NULL("User is null"),
    ADDRESS_NOT_FOUND("Address not found"),
    CREDENTIAL_INVALID("Credentials invalid!"),
    USER_EMAIL_EXISTS("The email is already registered");

    private final String message;
    Constants(String s) {
        this.message = s;
    }
}
