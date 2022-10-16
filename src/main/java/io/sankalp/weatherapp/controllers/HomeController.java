package io.sankalp.weatherapp.controllers;

import io.sankalp.weatherapp.dtos.WeatherDataDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "We are the one stop solution for all your weather data needs...";
    }

    @GetMapping("/weatherData")
    public WeatherDataDTO getWeatherData () {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://api.weatherstack.com/current?access_key=1033c76d0c1530af36960575ab2b03a8&query=Jalandhar", WeatherDataDTO.class);
    }

}
