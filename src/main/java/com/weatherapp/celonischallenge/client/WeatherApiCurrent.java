package com.weatherapp.celonischallenge.client;

public class WeatherApiCurrent {
    private long last_updated_epoch;
    private String last_updated;
    private double temp_c;
    private double temp_f;

    public WeatherApiCurrent(long last_updated_epoch, String last_updated, double temp_c, double temp_f) {
        this.last_updated_epoch = last_updated_epoch;
        this.last_updated = last_updated;
        this.temp_c = temp_c;
        this.temp_f = temp_f;
    }

    public long getLast_updated_epoch() {
        return last_updated_epoch;
    }

    public void setLast_updated_epoch(long last_updated_epoch) {
        this.last_updated_epoch = last_updated_epoch;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public double getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(double temp_c) {
        this.temp_c = temp_c;
    }

    public double getTemp_f() {
        return temp_f;
    }

    public void setTemp_f(double temp_f) {
        this.temp_f = temp_f;
    }
}
