package io.sankalp.weatherapp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherReportDTO {

    private Integer temperature;

    @JsonProperty("wind_speed")
    private Integer windSpeed;

    @JsonProperty("wind_dir")
    private String windDirection;

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }
}
