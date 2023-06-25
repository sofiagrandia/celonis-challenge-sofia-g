package com.weatherapp.celonischallenge.service;

import com.weatherapp.celonischallenge.client.WeatherApiClient;
import com.weatherapp.celonischallenge.model.CityWeather;
import com.weatherapp.celonischallenge.storage.WeatherForecastStorage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class WeatherService {
    private static final Logger logger = LoggerFactory.getLogger(WeatherService.class);

    private WeatherForecastStorage forecastStorage;
    private WeatherApiClient weatherApiClient;

    public WeatherService(WeatherForecastStorage weatherForecastStorage, WeatherApiClient weatherApiClient) {
        this.forecastStorage = weatherForecastStorage;
        this.weatherApiClient = weatherApiClient;
    }

    public void saveWeatherForecast(String cityName) {
        if (WeatherForecastStorage.isForecastAlreadySaved(cityName, LocalDate.now())) {
            return ; // Skip saving if forecast for the city for BOTH days already exists
        }

        CityWeather weatherForecast = weatherApiClient.getWeatherForecast(cityName);
        if (weatherForecast != null) {
            WeatherForecastStorage.saveWeatherForecast(cityName, weatherForecast);
            logger.info("Weather forecast saved for: {}", cityName);
        } else {
            logger.error("An error occured when trying to save weather forecast for: {}", cityName);

            throw new WeatherForecastException("Failed to fetch weather forecast for the city: " + cityName);
        }
    }

    public CityWeather getWeatherForecast(String cityName) {
        return WeatherForecastStorage.getWeatherForecasts(cityName);
    }

    public List<CityWeather> getAllCities() {
        return WeatherForecastStorage.getAllCities();
    }


}
