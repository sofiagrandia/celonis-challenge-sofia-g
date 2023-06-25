package com.weatherapp.celonischallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class })
public class CelonisChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CelonisChallengeApplication.class, args);
	}
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
