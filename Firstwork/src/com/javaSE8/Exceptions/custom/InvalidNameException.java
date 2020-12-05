package com.javaSE8.Exceptions.custom;

public class InvalidNameException extends Exception {

    public InvalidNameException() {
    }

    public InvalidNameException(String message) {
        super(message);
        System.out.println("Given Name is invalid");
    }
}