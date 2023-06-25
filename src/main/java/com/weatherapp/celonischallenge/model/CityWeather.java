package com.weatherapp.celonischallenge.model;

import com.weatherapp.celonischallenge.client.WeatherApiForecastDay;

/*Represents the forcasts of today and tomorrow for a single city. Includes the region*/

public class CityWeather {


    private String city;
    private String region;
    private WeatherApiForecastDay todayWeather;

    private WeatherApiForecastDay tomorrowWeather;

    //Getters and setters


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public WeatherApiForecastDay getTodayWeather() {
        return todayWeather;
    }

    public void setTodayWeather(WeatherApiForecastDay todayWeather) {
        this.todayWeather = todayWeather;
    }

    public WeatherApiForecastDay getTomorrowWeather() {
        return tomorrowWeather;
    }

    public void setTomorrowWeather(WeatherApiForecastDay tomorrowWeather) {
        this.tomorrowWeather = tomorrowWeather;
    }


}


