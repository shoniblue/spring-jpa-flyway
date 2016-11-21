package com.sblue.jpaflyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@EnableJpaRepositories("com.sblue.jpaflyway.demo")
@SpringBootApplication
public class SpringJpaFlywayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaFlywayApplication.class, args);
	}
}
