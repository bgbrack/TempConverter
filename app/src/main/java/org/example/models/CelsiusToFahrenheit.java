package org.example.models;

public class CelsiusToFahrenheit implements TempConverterI {

    @Override
    public Float convert(Float from) {
        return (from * 1.8f) + 32;
    }
}