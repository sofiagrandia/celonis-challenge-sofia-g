package com.weatherapp.celonischallenge;

import com.weatherapp.celonischallenge.controller.WeatherController;
import com.weatherapp.celonischallenge.model.CityWeather;
import com.weatherapp.celonischallenge.service.WeatherService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class CelonisChallengeApplicationTests {

	@Mock
	private WeatherService weatherService;

	private WeatherController weatherController;


	@BeforeEach
	public void setup() {
		weatherController = new WeatherController(weatherService);
	}

	@Test
	public void testSaveWeatherForecast() throws IOException {
		String city = "London";
		ResponseEntity<String> expectedResponse = ResponseEntity.ok("The forecast for the city " + city + " was correctly saved.");

		doNothing().when(weatherService).saveWeatherForecast(city);

		ResponseEntity<?> actualResponse = weatherController.saveWeatherForecast(city);

		assertEquals(expectedResponse.getStatusCode(), actualResponse.getStatusCode());
		assertEquals(expectedResponse.getBody(), actualResponse.getBody());

		Mockito.verify(weatherService, times(1)).saveWeatherForecast(city);
	}

	@Test
	public void testGetWeatherForecast() {
		String city = "London";
		CityWeather cityWeather = new CityWeather();
		cityWeather.setCity(city);

		when(weatherService.getWeatherForecast(city)).thenReturn(cityWeather);


		ResponseEntity<?> expectedResponse = ResponseEntity.ok(cityWeather);
		ResponseEntity<?> actualResponse = weatherController.getWeatherForecast(city);

		assertEquals(expectedResponse.getStatusCode(), actualResponse.getStatusCode());
		assertEquals(expectedResponse.getBody(), actualResponse.getBody());

		verify(weatherService, times(1)).getWeatherForecast(city);
	}

	@Test
	public void testGetAllWeatherForecasts() {
		String city1 = "London";
		String city2 = "Madrid";
		CityWeather city1Weather = new CityWeather();
		CityWeather city2Weather = new CityWeather();

		city1Weather.setCity(city1);
		city2Weather.setCity(city2);
		List<CityWeather> cities = new ArrayList<>();
		cities.add(city1Weather);
		cities.add(city2Weather);

		when(weatherService.getAllCities()).thenReturn(cities);


		ResponseEntity<?> expectedResponse = ResponseEntity.ok(cities);
		ResponseEntity<?> actualResponse = weatherController.getAllForecasts();

		assertEquals(expectedResponse.getStatusCode(), actualResponse.getStatusCode());
		assertEquals(expectedResponse.getBody(), actualResponse.getBody());

		verify(weatherService, times(1)).getAllCities();
	}

}
