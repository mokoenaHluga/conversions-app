package com.conversions.app.api;

import com.conversions.app.service.ConversionInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/conversion")
public class ConversionController {

    private final ConversionInterface conversionInterface;

    @Autowired
    public ConversionController(ConversionInterface conversionInterface) {
        this.conversionInterface = conversionInterface;
    }

    @GetMapping(value = "/distance/{distanceType}/{distanceValue}")
    public String distanceInchesAndMeters(@PathVariable("distanceValue") double distanceValue, @PathVariable("distanceType") String distanceType) {
        return conversionInterface.distanceInchesAndMeters(distanceType, distanceValue);
    }

    @GetMapping(value = "/temperature/{temperatureType}/{temperatureValue}")
    public String temperatureFAndC(@PathVariable("temperatureType") String temperatureType, @PathVariable("temperatureValue") double temperatureValue) {
        return conversionInterface.temperatureFAndC(temperatureType, temperatureValue);
    }

    @GetMapping(value = "/volume/{volumeType}/{volumeValue}")
    public String volumeGallonsAndLiters(@PathVariable("volumeType") String volumeType, @PathVariable("volumeValue") double volumeValue) {
        return conversionInterface.volumeGallonsAndLiters(volumeType, volumeValue);
    }

    @GetMapping(value = "/mass/{massType}/{massValue}")
    public String massPoundAndKilogram(@PathVariable("massType") String massType, @PathVariable("massValue") double massValue) {
        return conversionInterface.massPoundAndKilogram(massType, massValue);
    }
}
