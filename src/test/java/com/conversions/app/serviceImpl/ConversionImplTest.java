package com.conversions.app.serviceImpl;

import com.conversions.app.service.impl.ConversionImpl;
import com.conversions.app.service.ConversionInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ConversionImpl.class)
public class ConversionImplTest {

    public static final String MASS_ACTUAL_DEFAULT_VALUE = "Mass type entered not valid, please make sure it's either Pounds or Pounds";
    public static final String VOLUME_DEFAULT_VALUE = "Volume type entered not valid, please make sure it's either Liters or Gallons";
    public static final String TEMPERATURE_DEFAULT_VALUE = "Temperature type entered not valid, please make sure it's either Celsius or Fahrenheit";
    public static final String LENGTH_DEFAULT_VALUE = "Length type entered not valid, please make sure it's either Inch or Meter";
    public static final String DEFAULT_AREA_MESSAGE = "Area type entered not valid, please make sure it's either Square Meter or Square Foot";

    @Autowired
    ConversionInterface conversionInterface;

    @Test
    void shouldConvertInchesToMeters() {
        String value = conversionInterface.lengthInchesAndMeters("Inch", 100.00);
        Assertions.assertEquals(value, "Inch: 2.54");
    }

    @Test
    void shouldConvertMetersToInches() {
        String value = conversionInterface.lengthInchesAndMeters("Meter", 2.54);
        Assertions.assertEquals(value, "Meter: 100.0");
    }

    @Test
    void shouldDefaultMetersTAndInchesDefault() {
        String value = conversionInterface.lengthInchesAndMeters("Kilometer", 2.54);
        Assertions.assertEquals(value, LENGTH_DEFAULT_VALUE);
    }

    @Test
    void shouldConvertFahrenheitToCelsius() {
        String value = conversionInterface.temperatureFAndC("C", 30);
        Assertions.assertEquals(value, "C = 54.032");
    }

    @Test
    void shouldConvertCelsiusToFahrenheit() {
        String value = conversionInterface.temperatureFAndC("F", 30);
        Assertions.assertEquals(value, "F = -1.1111111111111112");
    }

    @Test
    void shouldDefaultFahrenheitToCelsiusCalculation() {
        String value = conversionInterface.temperatureFAndC("Test", 30);
        Assertions.assertEquals(value, TEMPERATURE_DEFAULT_VALUE);
    }

    @Test
    void shouldConvertGallonsToLiters() {
        String value = conversionInterface.volumeGallonsAndLiters("Liters", 20);
        Assertions.assertEquals(value, "Liters: 5.283457494584456");
    }

    @Test
    void shouldConvertLitersToGallons() {
        String value = conversionInterface.volumeGallonsAndLiters("Gallons", 20);
        Assertions.assertEquals(value, "Gallons: 75.708");
    }

    @Test
    void shouldDefaultConvertLitersToGallons() {
        String value = conversionInterface.volumeGallonsAndLiters("Default", 40);
        Assertions.assertEquals(value, VOLUME_DEFAULT_VALUE);
    }

    @Test
    void shouldConvertPoundToKilogram() {
        String value = conversionInterface.massPoundAndKilogram("Kilograms", 20);
        Assertions.assertEquals(value, "Kilograms: 44.052863436123346");
    }

    @Test
    void shouldConvertKilogramToPound() {
        String value = conversionInterface.massPoundAndKilogram("Pounds", 30);
        Assertions.assertEquals(value, "Pounds: 13.620000000000001");
    }

    @Test
    void shouldDefaultKilogramToPound() {
        String value = conversionInterface.massPoundAndKilogram("Default", 2.54);
        Assertions.assertEquals(value, MASS_ACTUAL_DEFAULT_VALUE);
    }

    @Test
    void shouldConvertSquareMeterToSquareFoot() {
        String value = conversionInterface.areaSquareMAndSquareFoot("SFoot", 20);
        Assertions.assertEquals(value, "Square Foot: 215.27999999999997");
    }

    @Test
    void shouldConvertSquareFootToSquareMeter() {
        String value = conversionInterface.areaSquareMAndSquareFoot("SMeter", 30);
        Assertions.assertEquals(value, "Square Meter: 2.787068004459309");
    }

    @Test
    void shouldDefaultSquareFootAndSquareMeter() {
        String value = conversionInterface.areaSquareMAndSquareFoot("Default", 2.54);
        Assertions.assertEquals(value, DEFAULT_AREA_MESSAGE);
    }
}
