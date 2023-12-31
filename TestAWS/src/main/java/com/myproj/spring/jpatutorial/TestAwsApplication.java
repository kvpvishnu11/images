package com.myproj.spring.jpatutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class TestAwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestAwsApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
	    return new WebMvcConfigurer() {
	        @Override
	        public void addCorsMappings(CorsRegistry registry) {
	            registry.addMapping("/**")
	                    .allowedOrigins("http://128.226.29.123") // Specify the allowed origin
	                    .allowedMethods("GET", "POST", "PUT", "DELETE")
	                    .allowedHeaders("*")
	                    .allowCredentials(true)
	                    .maxAge(3600);
	        }
	    };
	}
}