package com.weatherapp.celonischallenge.client;

import java.util.List;

public class WeatherApiForecast {

    private List<WeatherApiForecastDay> forecastday;

    public WeatherApiForecast() {
    }

    public WeatherApiForecast(List<WeatherApiForecastDay> forecastday) {
        this.forecastday = forecastday;
    }

    public List<WeatherApiForecastDay> getForecastDay() {
        return forecastday;
    }

    public void setForecastday(List<WeatherApiForecastDay> forecastday) {
        this.forecastday = forecastday;
    }
}
