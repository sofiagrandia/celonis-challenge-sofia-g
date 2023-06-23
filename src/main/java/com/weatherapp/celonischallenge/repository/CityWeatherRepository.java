package com.weatherapp.celonischallenge.repository;

import com.weatherapp.celonischallenge.model.CityWeather;
import com.weatherapp.celonischallenge.model.WeatherForecast;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityWeatherRepository extends JpaRepository<CityWeather,Integer> {
}
