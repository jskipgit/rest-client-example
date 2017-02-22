package com.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = false)
public class MyCoolQuote {

    // an example of manually mapping a json property to your object property
    @JsonProperty(value = "type")
    private String other;

    // if names match, then no manual mapping needed
    private MyCoolValue value;

    public MyCoolQuote() {
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public MyCoolValue getValue() {
        return value;
    }

    public void setValue(MyCoolValue value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyCoolQuote{" +
                "other='" + other + '\'' +
                ", value=" + value +
                '}';
    }
}