package com.javaSE8.Exceptions.custom;

public class InvalidMobileException extends NumberFormatException {
    public InvalidMobileException() {
    }

    public InvalidMobileException(String s) {
        super(s);
        System.out.println("given mobile is not valid");
    }
}