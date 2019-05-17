package com.acme.yumm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YummApplication {

	public static void main(String[] args) {
		SpringApplication.run(YummApplication.class, args);
		System.out.println("app started.!");
	}

}
