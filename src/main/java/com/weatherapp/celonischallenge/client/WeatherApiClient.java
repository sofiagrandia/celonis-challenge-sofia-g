package com.weatherapp.celonischallenge.client;

import com.weatherapp.celonischallenge.model.CityWeather;
import com.weatherapp.celonischallenge.model.WeatherForecast;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherApiClient {

    private static final String API_BASE_URL = "https://api.weatherapi.com/v1";
    private static final String API_KEY = "41e0577e32fc4916967173543232206";

    private final RestTemplate restTemplate;

    public WeatherApiClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public CityWeather getWeatherForecast(String city) {
        String url = API_BASE_URL + "/forecast.json?key=" + API_KEY + "&q=" + city + "&days=2";

        try {
            ResponseEntity<WeatherApiResponseBody > responseEntity = restTemplate.getForEntity(url, WeatherApiResponseBody .class);
            WeatherApiResponseBody responseBody = responseEntity.getBody();

            if (responseBody != null) {
                CityWeather weatherApiResponse = new CityWeather();
                weatherApiResponse.setCity(city);
                weatherApiResponse.setRegion(responseBody.getLocation().getRegion());
                weatherApiResponse.setTodayWeather(responseBody.getForecast().getForecastDay().get(0));
                weatherApiResponse.setTomorrowWeather(responseBody.getForecast().getForecastDay().get(1));

                return weatherApiResponse;
            }
        } catch (RestClientException e) {

            throw new WeatherApiClientException("Error occurred while calling Weather API: " + e.getMessage(), e);
        }catch (Exception e) {

            throw new WeatherApiClientException("An unexpected error occurred: " + e.getMessage(), e);
        }



        return null;
    }
    }

