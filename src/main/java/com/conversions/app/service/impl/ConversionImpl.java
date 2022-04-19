package com.conversions.app.service.impl;

import com.conversions.app.service.ConversionInterface;
import com.conversions.app.utils.Constants;
import org.springframework.stereotype.Service;

@Service
public class ConversionImpl implements ConversionInterface {

    @Override
    public String distanceInchesAndMeters(String distanceType, double distanceValue) {
        String value = "";
        switch (distanceType) {
            case "Inch":
                value = "Inch: " + distanceValue * Constants.distanceConstant;
                break;
            case "Meter":
                value = "Meter: " + distanceValue / Constants.distanceConstant;
                break;
            default:  value = Constants.defaultDistanceMessage;
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
            default:  convertedTemp = Constants.defaultTemperatureMessage;
        }
        return convertedTemp;
    }

    @Override
    public String volumeGallonsAndLiters(String volumeType, double volumeValue) {
        String volume = "";
        switch (volumeType) {
            case "Liters":
                volume = "Liters: " + volumeValue / 3.7854;
                break;
            case "Gallons":
                volume = "Gallons: " + volumeValue * 3.7854;
                break;
            default:
                volume = Constants.defaultVolumeMessage;
        }
        return volume;
    }

    @Override
    public String massPoundAndKilogram(String massType, double massValue) {
        String mass = "";
        switch (massType) {
            case "Kilograms":
                mass = "Kilograms: " + massValue / 0.454;
                break;
            case "Pounds":
                mass = "Pounds: " + massValue * 0.454;
                break;
            default:
                mass = Constants.defaultMassMessage;
        }
        return mass;
    }
}
