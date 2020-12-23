package com.javaSE8.functionalInterfaces.impl;

import com.javaSE8.functionalInterfaces.GenerateMailId;

public class GenerateMailIdImpl1 implements GenerateMailId {

    String DOMAIN = "@example.com";

    @Override
    public String generateMailId(String name) {
        return name + DOMAIN;
    }
}