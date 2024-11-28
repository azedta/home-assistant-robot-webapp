package com.azedta.homebuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HomeAssistantRobotWebappApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeAssistantRobotWebappApiApplication.class, args);
	}

}
