package com.weatherapp.celonischallenge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "weatherForecast")
public class WeatherForecast {
    @Id
    private Integer forecastId;
    private double maxTemp;
    private double minTemp;
    private double totalPrecipitation;
    private int averageHumidity;
    private String condition;

    public WeatherForecast(double maxTemp, double minTemp, double totalPrecipitation, int averageHumidity, String condition) {
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.totalPrecipitation = totalPrecipitation;
        this.averageHumidity = averageHumidity;
        this.condition= condition;
    }

    // Getters and setters
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
