package com.example.demo.service.impl;

public class PasswordEncrypter {

    public String encode(String password) {
        String reverse = new StringBuffer(password).reverse().toString();
        return reverse;
    }
}
