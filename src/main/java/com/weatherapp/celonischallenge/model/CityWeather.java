package com.weatherapp.celonischallenge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDate;

@Entity
@Table(name = "cityWeather")
public class CityWeather {
    @Id
    private Integer cityWeatherId;
    private String city;
    private LocalDate date;
    private Integer todayWeather;
    private Integer tomorrowWeather;

    public CityWeather(String city, LocalDate date, Integer todayWeather, Integer tomorrowWeather) {
        this.city = city;
        this.date = date;
        this.todayWeather = todayWeather;
        this.tomorrowWeather = tomorrowWeather;
    }

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

    public Integer getTodayWeather() {
        return todayWeather;
    }

    public void setTodayWeather(Integer todayWeather) {
        this.todayWeather = todayWeather;
    }

    public Integer getTomorrowWeather() {
        return tomorrowWeather;
    }

    public void setTomorrowWeather(Integer tomorrowWeather) {
        this.tomorrowWeather = tomorrowWeather;
    }
}
