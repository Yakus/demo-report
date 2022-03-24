package com.example.demoreport.service.dto;

import java.io.Serializable;

/**
 * A DTO for the Variable entity.
 */
public class VariableDTO implements Serializable {

    private String name;

    private String textValue;

    private String value = "";

    private String color = "";

    private String duration = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
