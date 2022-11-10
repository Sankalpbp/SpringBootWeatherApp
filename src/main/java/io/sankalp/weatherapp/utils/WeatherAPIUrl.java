package io.sankalp.weatherapp.utils;

import io.sankalp.weatherapp.constants.WeatherAppConstants;

public class WeatherAPIUrl {

    private String hostName;
    private String accessKey;
    private String cityName;

    public WeatherAPIUrl ( WeatherAPIUrlBuilder builder ) {
        this.hostName = builder.hostName;
        this.accessKey = builder.accessKey;
        this.cityName = builder.cityName;
    }

    public static class WeatherAPIUrlBuilder {

        private WeatherAPIUrl url;
        private String hostName;
        private String accessKey;
        private String cityName;

        public static WeatherAPIUrlBuilder getWeatherAPIUrlBuilder () {
            return new WeatherAPIUrlBuilder();
        }

        private WeatherAPIUrlBuilder () {

        }

        public WeatherAPIUrlBuilder hostName (String hostName) {
            this.hostName = hostName;
            return this;
        }

        public WeatherAPIUrlBuilder accessKey (String accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        public WeatherAPIUrlBuilder cityName (String cityName) {
            this.cityName = cityName;
            return this;
        }

        public WeatherAPIUrl build() {
            return new WeatherAPIUrl(this);
        }
    }

    public String toString () {
        return new StringBuilder()
                .append(WeatherAppConstants.HTTP)
                .append(WeatherAppConstants.COLON)
                .append(WeatherAppConstants.SLASH)
                .append(WeatherAppConstants.SLASH)
                .append(hostName)
                .append(WeatherAppConstants.QUESTION_MARK)
                .append(WeatherAppConstants.ACCESS_KEY)
                .append(WeatherAppConstants.EQUALS)
                .append(accessKey)
                .append(WeatherAppConstants.AMPERSAND)
                .append(WeatherAppConstants.QUERY)
                .append(WeatherAppConstants.EQUALS)
                .append(cityName)
                .toString();
    }
}
