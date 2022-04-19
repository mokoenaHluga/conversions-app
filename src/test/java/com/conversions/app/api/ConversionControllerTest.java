package com.conversions.app.api;

import com.conversions.app.service.ConversionInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = ConversionController.class)
public class ConversionControllerTest {
    private static final double inchToConvert = 100;
    private static final double meterToConvert = 2.54;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ConversionInterface conversionInterface;

    @Test
    void shouldConvertInchesToMeters() throws Exception {
        MockHttpServletRequestBuilder mockRequest =
                MockMvcRequestBuilders.get("/api/conversion/distance/{distanceType}/{distanceValue}", "Inch", inchToConvert);

        this.mockMvc.perform(mockRequest)
                .andExpect(status().isOk());
    }

    @Test
    void shouldConvertMetersToInches() throws Exception {

        MockHttpServletRequestBuilder mockRequest =
                MockMvcRequestBuilders.get("/api/conversion/distance/{distanceType}/{distanceValue}", "Meter", meterToConvert);

        this.mockMvc.perform(mockRequest)
                .andExpect(status().isOk());
    }

    @Test
    void shouldConvertFahrenheitToCelsius() throws Exception {
        MockHttpServletRequestBuilder mockRequest =
                MockMvcRequestBuilders.get("/api/conversion/temperature/{temperatureType}/{temperatureValue}", "Inch", inchToConvert);

        this.mockMvc.perform(mockRequest)
                .andExpect(status().isOk());
    }

    @Test
    void shouldConvertCelsiusToFahrenheit() throws Exception {

        MockHttpServletRequestBuilder mockRequest =
                MockMvcRequestBuilders.get("/api/conversion/temperature/{temperatureType}/{temperatureValue}", "F", 30.00);

        this.mockMvc.perform(mockRequest)
                .andExpect(status().isOk());
    }

    @Test
    void shouldConvertGallonsToLiters() throws Exception {
        MockHttpServletRequestBuilder mockRequest =
                MockMvcRequestBuilders.get("/api/conversion//volume/{volumeType}/{volumeValue}", "Liters", 20.00);

        this.mockMvc.perform(mockRequest)
                .andExpect(status().isOk());
    }

    @Test
    void shouldConvertLitersToGallons() throws Exception {

        MockHttpServletRequestBuilder mockRequest =
                MockMvcRequestBuilders.get("/api/conversion//volume/{volumeType}/{volumeValue}", "Gallons", meterToConvert);

        this.mockMvc.perform(mockRequest)
                .andExpect(status().isOk());
    }

    @Test
    void shouldConvertPoundToKilogram() throws Exception {
        MockHttpServletRequestBuilder mockRequest =
                MockMvcRequestBuilders.get("/api/conversion/mass/{massType}/{massValue}", "Kilograms", 10);

        this.mockMvc.perform(mockRequest)
                .andExpect(status().isOk());
    }

    @Test
    void shouldConvertKilogramToPound() throws Exception {

        MockHttpServletRequestBuilder mockRequest =
                MockMvcRequestBuilders.get("/api/conversion/mass/{massType}/{massValue}", "Pounds", 20);

        this.mockMvc.perform(mockRequest)
                .andExpect(status().isOk());
    }
}
