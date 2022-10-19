package io.sankalp.weatherapp.controllers;

import io.sankalp.weatherapp.constants.WeatherAppConstants;
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
        final String url = new StringBuilder(WeatherAppConstants.HTTP)
                                .append(WeatherAppConstants.COLON)
                                .append(WeatherAppConstants.SLASH)
                                .append(WeatherAppConstants.SLASH)
                                .append("api.weatherstack.com/current")
                                .append(WeatherAppConstants.QUESTION_MARK)
                                .append("access_key=00b6206edd9920600c21b9bea7e627a0")
                                .append(WeatherAppConstants.AMPERSAND)
                                .append("query=Jalandhar")
                                .toString();
        System.out.println (url);
        return restTemplate.getForObject(url, WeatherDataDTO.class);
    }

}
