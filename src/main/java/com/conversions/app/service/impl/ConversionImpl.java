package com.conversions.app.service.impl;

import com.conversions.app.model.ConversionRequest;
import com.conversions.app.service.ConversionInterface;
import com.conversions.app.utils.Constants;
import org.springframework.stereotype.Service;

import static com.conversions.app.utils.Constants.INCH_METER_RATIO;
import static com.conversions.app.utils.Constants.POUND_KILOGRAM_RATIO;
import static com.conversions.app.utils.Constants.S_ROOT_S_METER_RATIO;
import static com.conversions.app.utils.Constants.GALLON_LITERS_RATIO;

@Service
public class ConversionImpl implements ConversionInterface {

    @Override
    public String lengthInchesAndMeters(ConversionRequest request) {
        String value = "";
        switch (request.getConversionTypeTo()) {
            case "Inch":
                value = "Inch: " + request.getConversionValue() * INCH_METER_RATIO;
                break;
            case "Meter":
                value = "Meter: " + request.getConversionValue() / INCH_METER_RATIO;
                break;
            default:
                value = Constants.DEFAULT_LENGTH_MESSAGE;
        }
        return value;
    }

    @Override
    public String temperatureFAndC(ConversionRequest request) {
        String convertedTemp = "";
        switch (request.getConversionTypeTo()) {
            case "F":
                convertedTemp = "F = " + (float) ((request.getConversionValue() * 1.8) + 32);
                break;
            case "C":
                convertedTemp = "C = " + (request.getConversionValue() - 32) * 5 / 9;
                break;
            default:
                convertedTemp = Constants.DEFAULT_TEMPERATURE_MESSAGE;
        }
        return convertedTemp;
    }

    @Override
    public String volumeGallonsAndLiters(ConversionRequest request) {
        String volume = "";
        switch (request.getConversionTypeTo()) {
            case "Liters":
                volume = "Liters: " + request.getConversionValue() * GALLON_LITERS_RATIO;
                break;
            case "Gallons":
                volume = "Gallons: " + request.getConversionValue() / GALLON_LITERS_RATIO;
                break;
            default:
                volume = Constants.DEFAULT_VOLUME_MESSAGE;
        }
        return volume;
    }

    @Override
    public String massPoundAndKilogram(ConversionRequest request) {
        String mass = "";
        switch (request.getConversionTypeTo()) {
            case "Kilograms":
                mass = "Kilograms: " + request.getConversionValue() * POUND_KILOGRAM_RATIO;
                break;
            case "Pounds":
                mass = "Pounds: " + request.getConversionValue() / POUND_KILOGRAM_RATIO;
                break;
            default:
                mass = Constants.DEFAULT_MASS_MESSAGE;
        }
        return mass;
    }

    @Override
    public String areaSquareMAndSquareFoot(ConversionRequest request) {
        String areaReturnValue = "";
        switch (request.getConversionTypeTo()) {
            case "SMeter":
                areaReturnValue = "Square Meter: " + request.getConversionValue() / S_ROOT_S_METER_RATIO;
                break;

            case "SFoot":
                areaReturnValue = "Square Foot: " + request.getConversionValue() * S_ROOT_S_METER_RATIO;
                break;
            default:
                areaReturnValue = Constants.DEFAULT_AREA_MESSAGE;
        }
        return areaReturnValue;
    }
}
