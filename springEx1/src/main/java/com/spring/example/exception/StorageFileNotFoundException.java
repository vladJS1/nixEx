package com.spring.example.exception;

import java.io.IOException;
import java.net.MalformedURLException;

public class StorageFileNotFoundException extends MalformedURLException {
    public StorageFileNotFoundException(String message) {
        super(message + "Cannot find file!!!");
    }

}
