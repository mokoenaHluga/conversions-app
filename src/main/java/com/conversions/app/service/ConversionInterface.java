package com.conversions.app.service;

public interface ConversionInterface {
    String distanceInchesAndMeters(String distanceType, double distanceValue);

    String temperatureFAndC(String temperatureType, double temperatureValue);

    String volumeGallonsAndLiters(String volumeType, double volumeValue);

    String massPoundAndKilogram(String massType, double massValue);
}
