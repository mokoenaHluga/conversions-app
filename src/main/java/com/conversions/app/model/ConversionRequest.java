package com.conversions.app.model;

public class ConversionRequest {
    private String conversionTypeFrom;
    private String conversionTypeTo;
    private double conversionValue;

    public String getConversionTypeFrom() {
        return conversionTypeFrom;
    }

    public void setConversionTypeFrom(String conversionTypeFrom) {
        this.conversionTypeFrom = conversionTypeFrom;
    }

    public String getConversionTypeTo() {
        return conversionTypeTo;
    }

    public void setConversionTypeTo(String conversionTypeTo) {
        this.conversionTypeTo = conversionTypeTo;
    }

    public double getConversionValue() {
        return conversionValue;
    }

    public void setConversionValue(double conversionValue) {
        this.conversionValue = conversionValue;
    }
}
