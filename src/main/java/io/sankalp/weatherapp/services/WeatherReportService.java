package io.sankalp.weatherapp.services;

import io.sankalp.weatherapp.constants.WeatherAppConstants;
import io.sankalp.weatherapp.dtos.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherReportService {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseDTO getWeatherData (final String cityName) {
        final String url = new StringBuilder(WeatherAppConstants.HTTP)
                .append(WeatherAppConstants.COLON)
                .append(WeatherAppConstants.SLASH)
                .append(WeatherAppConstants.SLASH)
                .append("api.weatherstack.com/current")
                .append(WeatherAppConstants.QUESTION_MARK)
                .append("access_key=00b6206edd9920600c21b9bea7e627a0")
                .append(WeatherAppConstants.AMPERSAND)
                .append("query")
                .append(WeatherAppConstants.EQUALS)
                .append(cityName)
                .toString();
        return restTemplate.getForObject(url, ResponseDTO.class);
    }
}
