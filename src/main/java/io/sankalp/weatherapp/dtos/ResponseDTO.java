package io.sankalp.weatherapp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDTO {

    private LocationDTO location;

    @JsonProperty("current")
    private WeatherReportDTO weatherReport;

    public LocationDTO getLocation() {
        return location;
    }

    public void setLocation(LocationDTO location) {
        this.location = location;
    }

    public WeatherReportDTO getWeatherReport() {
        return weatherReport;
    }

    public void setWeatherReport(WeatherReportDTO weatherReport) {
        this.weatherReport = weatherReport;
    }
}
