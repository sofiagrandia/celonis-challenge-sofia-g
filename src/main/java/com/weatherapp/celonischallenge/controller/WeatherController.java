package com.weatherapp.celonischallenge.controller;

import com.weatherapp.celonischallenge.model.CityWeather;
import com.weatherapp.celonischallenge.model.ErrorResponse;
import com.weatherapp.celonischallenge.service.WeatherForecastException;
import com.weatherapp.celonischallenge.service.WeatherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/forecasts")

public class WeatherController {

    private WeatherService forecastService;

    public WeatherController(WeatherService forecastService) {
        this.forecastService = forecastService;
    }

    //Saving today and tomorrow's forecast for a City
    @PostMapping("/{city}")
    public ResponseEntity<?> saveWeatherForecast(@PathVariable String city) {
        try{
            forecastService.saveWeatherForecast(city);
            return new ResponseEntity<>("The forecast for the city " + city + " was correctly saved.", HttpStatus.OK);

        }catch(WeatherForecastException e){
            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), "ERROR:the city was not found." +
                    " Try again with another city name." , LocalDateTime.now());
            return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);

        }



    }

    //Fetching today and tomorrow's forecast for a given City
    @GetMapping("/{city}")
    public ResponseEntity<?> getWeatherForecast(@PathVariable String city) {
        CityWeather cityForecast = forecastService.getWeatherForecast(city);
        if (cityForecast.getCity() != null) {
            return new ResponseEntity<>(cityForecast, HttpStatus.OK);

        } else {
            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), "ERROR: City not found. Try again with another city name, or try" +
                    " saving this city's forecast.", LocalDateTime.now());
            return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);


        }
    }

    //Fetching all available forecasts
    @GetMapping("/")
    public ResponseEntity<?> getAllForecasts() {
        List<CityWeather> allForecasts = forecastService.getAllCities();
        if (allForecasts != null) {
            return new ResponseEntity<>(allForecasts, HttpStatus.OK);
        } else {
            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND.value(), "No forecasts were found.", LocalDateTime.now());
            return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);       }
    }


}
