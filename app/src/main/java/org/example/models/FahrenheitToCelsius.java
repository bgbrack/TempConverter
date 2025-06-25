package org.example.models;

public class FahrenheitToCelsius implements TempConverterI{
    @Override
    public Float convert(Float from) {
        return (from - 32) * 0.55f;
    }
}
