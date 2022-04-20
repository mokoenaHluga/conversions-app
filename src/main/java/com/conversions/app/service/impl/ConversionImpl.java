package com.conversions.app.service.impl;

import com.conversions.app.service.ConversionInterface;
import com.conversions.app.utils.Constants;
import org.springframework.stereotype.Service;

import static com.conversions.app.utils.Constants.AREA_CONSTANT;
import static com.conversions.app.utils.Constants.LENGTH_CONSTANT;
import static com.conversions.app.utils.Constants.MASS_CONSTANT;
import static com.conversions.app.utils.Constants.VOLUME_CONSTANT;

@Service
public class ConversionImpl implements ConversionInterface {

    @Override
    public String lengthInchesAndMeters(String lengthType, double lengthValue) {
        String value = "";
        switch (lengthType) {
            case "Inch":
                value = "Inch: " + lengthValue * LENGTH_CONSTANT;
                break;
            case "Meter":
                value = "Meter: " + lengthValue / LENGTH_CONSTANT;
                break;
            default:
                value = Constants.DEFAULT_LENGTH_MESSAGE;
        }
        return value;
    }

    @Override
    public String temperatureFAndC(String temperatureType, double temperatureValue) {
        String convertedTemp = "";
        switch (temperatureType) {
            case "F":
                convertedTemp = "F = " + (temperatureValue - 32) * 5 / 9;
                break;
            case "C":
                convertedTemp = "C = " + ((9 * temperatureValue) / 5) + 32;
                break;
            default:
                convertedTemp = Constants.DEFAULT_TEMPERATURE_MESSAGE;
        }
        return convertedTemp;
    }

    @Override
    public String volumeGallonsAndLiters(String volumeType, double volumeValue) {
        String volume = "";
        switch (volumeType) {
            case "Liters":
                volume = "Liters: " + volumeValue / VOLUME_CONSTANT;
                break;
            case "Gallons":
                volume = "Gallons: " + volumeValue * VOLUME_CONSTANT;
                break;
            default:
                volume = Constants.DEFAULT_VOLUME_MESSAGE;
        }
        return volume;
    }

    @Override
    public String massPoundAndKilogram(String massType, double massValue) {
        String mass = "";
        switch (massType) {
            case "Kilograms":
                mass = "Kilograms: " + massValue / MASS_CONSTANT;
                break;
            case "Pounds":
                mass = "Pounds: " + massValue * MASS_CONSTANT;
                break;
            default:
                mass = Constants.DEFAULT_MASS_MESSAGE;
        }
        return mass;
    }

    @Override
    public String areaSquareMAndSquareFoot(String areaType, double areaValue) {
        String areaReturnValue = "";
        switch (areaType) {
            case "SMeter":
                areaReturnValue = "Square Meter: " + areaValue / AREA_CONSTANT;
                break;

            case "SFoot":
                areaReturnValue = "Square Foot: " + areaValue * AREA_CONSTANT;
                break;
            default:
                areaReturnValue = Constants.DEFAULT_AREA_MESSAGE;
        }
        return areaReturnValue;
    }
}
