package com.baidya.movie.cast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class MovieCastApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCastApplication.class, args);
	}

}
