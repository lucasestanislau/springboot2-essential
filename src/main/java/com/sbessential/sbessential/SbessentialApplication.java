package com.sbessential.sbessential;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SbessentialApplication {

	public static void main(String[] args) {
		System.out.println("password" + new BCryptPasswordEncoder().encode("123456"));
		SpringApplication.run(SbessentialApplication.class, args);
	}

}
