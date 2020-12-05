package com.javaSE8.Exceptions.custom;


public interface Validate {

    void validate() throws InvalidNameException, InvalidAgeException;

    void clear();
}