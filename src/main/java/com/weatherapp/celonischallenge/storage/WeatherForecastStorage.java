package com.weatherapp.celonischallenge.storage;


import com.weatherapp.celonischallenge.model.CityWeather;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class WeatherForecastStorage  {

    private static final Map<String, CityWeather> cityMap = new ConcurrentHashMap<>();


    private WeatherForecastStorage() {
    }

    public static void saveWeatherForecast(String cityName, CityWeather forecast) {
        cityMap.put(cityName, forecast);
    }

    public static CityWeather getWeatherForecasts(String cityName) {
        CityWeather city = cityMap.get(cityName);
        if (city != null) {
            return city;
        }
        return new CityWeather();
    }

    public static List<CityWeather> getAllCities() {

        TreeMap<String, CityWeather> sortedCities = new TreeMap<>(cityMap);
        return new ArrayList<>(sortedCities.values());
    }

    //check if the forecast already exists for today and tomorrow
    public static boolean isForecastAlreadySaved(String cityName, LocalDate today) {

        return cityMap.containsKey(cityName) && cityMap.get(cityName).getTodayWeather().getDate().isEqual(today);
    }
}
