package com.scorpio.h2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.scorpio.h2.entity.Country;
import com.scorpio.h2.repository.CountryRepository;

@SpringBootApplication
public class H2testApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2testApplication.class, args);
	}
	
	@Bean
	CommandLineRunner myRunner(CountryRepository cr)
	{
		return args->
		{
			cr.save(new Country(1L,"India"));
		};
	}

}
