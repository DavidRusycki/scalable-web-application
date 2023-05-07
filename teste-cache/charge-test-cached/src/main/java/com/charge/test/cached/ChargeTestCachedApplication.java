package com.charge.test.cached;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ChargeTestCachedApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChargeTestCachedApplication.class, args);
	}

}
