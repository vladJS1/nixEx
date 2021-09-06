package com.spring.example.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StorageException extends FileNotFoundException {
    public StorageException(String s) {
        super(s);
    }
}
