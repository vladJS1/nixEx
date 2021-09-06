package com.spring.example.entity;

import java.awt.*;

public class IndexEntity {
    String name;
    String properties;
    String color;

    public IndexEntity(String name, String properties, String color) {
        this.name = name;
        this.properties = properties;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
