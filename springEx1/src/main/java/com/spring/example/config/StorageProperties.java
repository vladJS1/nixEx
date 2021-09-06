package com.spring.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties("storage")
@PropertySource(
        ignoreResourceNotFound = false,
        value = "classpath:fileStorage.properties")
public class StorageProperties {

    /**
     * Folder location for storing files
     */
    @Value("${spring.storage.location}")
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}