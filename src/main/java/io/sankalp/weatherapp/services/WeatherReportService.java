package io.sankalp.weatherapp.services;

import io.sankalp.weatherapp.constants.WeatherAppConstants;
import io.sankalp.weatherapp.dtos.ResponseDTO;
import io.sankalp.weatherapp.utils.WeatherAPIUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherReportService {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseDTO getWeatherData (final String cityName) {
        WeatherAPIUrl url = WeatherAPIUrl.WeatherAPIUrlBuilder
                                         .getWeatherAPIUrlBuilder()
                                                 .accessKey("00b6206edd9920600c21b9bea7e627a0")
                                                         .hostName("api.weatherstack.com/current")
                                                                 .cityName(cityName)
                                                                         .build();
        System.out.println (url);
        return restTemplate.getForObject(url.toString(), ResponseDTO.class);
    }
}
