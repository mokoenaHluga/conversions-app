package com.conversions.app.api;

import com.conversions.app.model.ConversionRequest;
import com.conversions.app.service.ConversionInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping(value = "/length")
    public String lengthInchesAndMeters(@RequestBody ConversionRequest request) {
        return conversionInterface.lengthInchesAndMeters(request);
    }

    @GetMapping(value = "/temperature")
    public String temperatureFAndC(@RequestBody ConversionRequest request) {
        return conversionInterface.temperatureFAndC(request);
    }

    @GetMapping(value = "/volume")
    public String volumeGallonsAndLiters(@RequestBody ConversionRequest request) {
        return conversionInterface.volumeGallonsAndLiters(request);
    }

    @GetMapping(value = "/mass")
    public String massPoundAndKilogram(@RequestBody ConversionRequest request) {
        return conversionInterface.massPoundAndKilogram(request);
    }

    @GetMapping(value = "/area")
    public String areaSquareMAndSquareFoot(@RequestBody ConversionRequest request) {
        return conversionInterface.areaSquareMAndSquareFoot(request);
    }
}
