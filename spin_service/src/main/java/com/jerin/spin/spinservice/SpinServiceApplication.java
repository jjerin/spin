package com.jerin.spin.spinservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = {"com.jerin.spin.spinservice"})
@MapperScan("com.jerin.spin.spinservice.mapper")
public class SpinServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpinServiceApplication.class, args);
	}

}
