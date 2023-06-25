package com.weatherapp.celonischallenge.client;

import com.weatherapp.celonischallenge.model.CityWeather;
import org.springframework.web.client.RestClientException;

public class WeatherApiClientException extends RuntimeException {
    public WeatherApiClientException(String s, Exception e) {
    }
}
