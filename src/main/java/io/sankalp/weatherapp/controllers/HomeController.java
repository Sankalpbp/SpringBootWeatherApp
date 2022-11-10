package io.sankalp.weatherapp.controllers;

import io.sankalp.weatherapp.dtos.ResponseDTO;
import io.sankalp.weatherapp.services.WeatherReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @Autowired
    private WeatherReportService weatherReportService;

    @GetMapping("/")
    public String home() {
        return "We are the one stop solution for all your weather data needs...";
    }

    @GetMapping("/weatherData")
    public ResponseDTO getWeatherData (@RequestParam Map<String, String> queryParameters) {
        return weatherReportService.getWeatherData(queryParameters.get("cityName"));
    }

}
