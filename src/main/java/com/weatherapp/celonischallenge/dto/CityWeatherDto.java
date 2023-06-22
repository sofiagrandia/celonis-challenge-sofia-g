package com.weatherapp.celonischallenge.dto;

import com.weatherapp.celonischallenge.model.WeatherForecast;

import java.time.LocalDate;

public class CityWeatherDto {
    private String city;
    private LocalDate date;
    private WeatherForecast todayWeather;
    private WeatherForecast tomorrowWeather;

    // Getters and setters
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public WeatherForecast getTodayWeather() {
        return todayWeather;
    }

    public void setTodayWeather(WeatherForecast todayWeather) {
        this.todayWeather = todayWeather;
    }

    public WeatherForecast getTomorrowWeather() {
        return tomorrowWeather;
    }

    public void setTomorrowWeather(WeatherForecast tomorrowWeather) {
        this.tomorrowWeather = tomorrowWeather;
    }
}
