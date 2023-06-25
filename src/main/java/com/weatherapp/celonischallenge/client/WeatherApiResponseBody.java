package com.weatherapp.celonischallenge.client;

public class WeatherApiResponseBody {
    private WeatherApiLocation location;
    private WeatherApiCurrent current;
    private WeatherApiForecast forecast;

    public WeatherApiResponseBody(WeatherApiLocation location, WeatherApiCurrent current, WeatherApiForecast forecast) {
        this.location = location;
        this.current = current;
        this.forecast = forecast;
    }

    public WeatherApiLocation getLocation() {
        return location;
    }

    public void setLocation(WeatherApiLocation location) {
        this.location = location;
    }

    public WeatherApiCurrent getCurrent() {
        return current;
    }

    public void setCurrent(WeatherApiCurrent current) {
        this.current = current;
    }

    public WeatherApiForecast getForecast() {
        return forecast;
    }

    public void setForecast(WeatherApiForecast forecast) {
        this.forecast = forecast;
    }
}
