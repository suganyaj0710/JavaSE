package com.javaSE8.Exceptions.custom;

public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
    }

    public InvalidAgeException(String message) {
        super(message);
        System.out.println("given Age is Invalid");
    }
}