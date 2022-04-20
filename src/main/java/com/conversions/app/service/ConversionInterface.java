package com.conversions.app.service;

import com.conversions.app.model.ConversionRequest;

public interface ConversionInterface {
    String lengthInchesAndMeters(ConversionRequest request);

    String temperatureFAndC(ConversionRequest request);

    String volumeGallonsAndLiters(ConversionRequest request);

    String massPoundAndKilogram(ConversionRequest request);

    String areaSquareMAndSquareFoot(ConversionRequest request);
}
