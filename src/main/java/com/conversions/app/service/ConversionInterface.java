package com.conversions.app.service;

public interface ConversionInterface {
    String lengthInchesAndMeters(String lengthType, double lengthValue);

    String temperatureFAndC(String temperatureType, double temperatureValue);

    String volumeGallonsAndLiters(String volumeType, double volumeValue);

    String massPoundAndKilogram(String massType, double massValue);

    String areaSquareMAndSquareFoot(String areaType, double areaValue);
}
