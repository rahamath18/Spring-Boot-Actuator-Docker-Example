package com.example.springboot.actuator.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.springboot.actuator.docker.bean.MyHomeBean;

@SpringBootApplication
public class MainSpringBootApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(MainSpringBootApplication.class, args);
	}
	
	@Bean
	public MyHomeBean getMyWelcomeBean() {
		return new MyHomeBean();
	}

}
