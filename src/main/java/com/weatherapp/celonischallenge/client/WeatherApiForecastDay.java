package com.weatherapp.celonischallenge.client;

import java.time.LocalDate;

public class WeatherApiForecastDay {
    private LocalDate date;
    private long date_epoch;
    private WeatherApiDay day;

    public WeatherApiForecastDay(LocalDate date, long date_epoch, WeatherApiDay day) {
        this.date = date;
        this.date_epoch = date_epoch;
        this.day = day;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public long getDate_epoch() {
        return date_epoch;
    }

    public void setDate_epoch(long date_epoch) {
        this.date_epoch = date_epoch;
    }

    public WeatherApiDay getDay() {
        return day;
    }

    public void setDay(WeatherApiDay day) {
        this.day = day;
    }
}
