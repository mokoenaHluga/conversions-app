package com.conversions.app.testData;

import com.conversions.app.model.ConversionRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestData {
    public static ConversionRequest getRequestData(String conversionTypeTo, double conversionValue){
        ConversionRequest request = new ConversionRequest();
        request.setConversionTypeTo(conversionTypeTo);
        request.setConversionValue(conversionValue);

        return request;
    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
