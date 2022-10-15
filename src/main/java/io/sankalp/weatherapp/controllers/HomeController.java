package io.sankalp.weatherapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "We are the one stop solution for all your weather data needs...";
    }

    @GetMapping("/weatherData")
    public String getWeatherData () {
        return "Temperature is 30°C";
    }

}
