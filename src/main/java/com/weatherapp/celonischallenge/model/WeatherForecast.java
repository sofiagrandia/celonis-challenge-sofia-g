package com.weatherapp.celonischallenge.model;

import jakarta.persistence.*;


/*Represents the weather forecast, to store only the weather information, not the city
* This way I can use this representation for day1 and day2 and associate them to a single city*/

public class WeatherForecast {

    private Integer forecastId;
    private double maxTemp;
    private double minTemp;
    private double totalPrecipitation;
    private int averageHumidity;
    private String condition;

    public WeatherForecast(Integer forecastId, double maxTemp, double minTemp, double totalPrecipitation, int averageHumidity, String condition) {
        this.forecastId = forecastId;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.totalPrecipitation = totalPrecipitation;
        this.averageHumidity = averageHumidity;
        this.condition= condition;
    }

    // Getters and setters

    public Integer getForecastId() {
        return forecastId;
    }

    public void setForecastId(Integer forecastId) {
        this.forecastId = forecastId;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getTotalPrecipitation() {
        return totalPrecipitation;
    }

    public void setTotalPrecipitation(double totalPrecipitation) {
        this.totalPrecipitation = totalPrecipitation;
    }

    public int getAverageHumidity() {
        return averageHumidity;
    }

    public void setAverageHumidity(int averageHumidity) {
        this.averageHumidity = averageHumidity;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
