package com.conversions.app.api;

import com.conversions.app.service.ConversionInterface;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static com.conversions.app.testData.TestData.asJsonString;
import static com.conversions.app.testData.TestData.getRequestData;
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
        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
                .get("/api/conversion/length/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(getRequestData("Inch", inchToConvert)));

        this.mockMvc.perform(mockRequest)
                .andExpect(status().isOk());
    }

    @Test
    void shouldConvertMetersToInches() throws Exception {

        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
                .get("/api/conversion/length/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(getRequestData("Meter", meterToConvert)));

        this.mockMvc.perform(mockRequest)
                .andExpect(status().isOk());
    }

    @Test
    void shouldConvertFahrenheitToCelsius() throws Exception {
        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
                .get("/api/conversion/temperature/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(getRequestData("Inch", inchToConvert)));

        this.mockMvc.perform(mockRequest)
                .andExpect(status().isOk());
    }

    @Test
    void shouldConvertCelsiusToFahrenheit() throws Exception {

        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
                .get("/api/conversion/temperature/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(getRequestData("F", 30.00)));

        this.mockMvc.perform(mockRequest)
                .andExpect(status().isOk());
    }

    @Test
    void shouldConvertGallonsToLiters() throws Exception {
        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
                .get("/api/conversion/volume/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(getRequestData("Liters", 20.00)));

        this.mockMvc.perform(mockRequest)
                .andExpect(status().isOk());
    }

    @Test
    void shouldConvertLitersToGallons() throws Exception {

        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
                .get("/api/conversion/volume/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(getRequestData("Gallons", meterToConvert)));

        this.mockMvc.perform(mockRequest)
                .andExpect(status().isOk());
    }

    @Test
    void shouldConvertPoundToKilogram() throws Exception {
        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
                .get("/api/conversion/mass/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(getRequestData("Kilograms", 10)));

        this.mockMvc.perform(mockRequest)
                .andExpect(status().isOk());
    }

    @Test
    void shouldConvertKilogramToPound() throws Exception {

        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
                .get("/api/conversion/mass/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(getRequestData("Pounds", 20)));

        this.mockMvc.perform(mockRequest)
                .andExpect(status().isOk());
    }

    @Test
    void shouldConvertSquareMeterToSquareFoot() throws Exception {

        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
                .get("/api/conversion/area/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(getRequestData("Foot", meterToConvert)));

        this.mockMvc.perform(mockRequest)
                .andExpect(status().isOk());
    }

    @Test
    void shouldConvertSquareFootToSquareMeter() throws Exception {
        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
                .get("/api/conversion/area/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(getRequestData("SMeter", 10)));

        this.mockMvc.perform(mockRequest)
                .andExpect(status().isOk());
    }
}
