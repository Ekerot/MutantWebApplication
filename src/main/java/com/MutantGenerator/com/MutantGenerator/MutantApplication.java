package com.MutantGenerator;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@EnableAutoConfiguration
@SpringBootApplication
@EnableConfigurationProperties
@ComponentScan(basePackages = "com.MutantGenerator") 
@PropertySource("classpath:application.properties")
public class MutantApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(MutantApplication.class, args);
		
	}
}
