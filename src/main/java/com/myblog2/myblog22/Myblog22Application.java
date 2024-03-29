package com.myblog2.myblog22;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.myblog2.myblog22")
public class Myblog22Application {

	public static void main(String[] args) {
		SpringApplication.run(Myblog22Application.class, args);
	}
		@Bean
		public ModelMapper getModelMapper(){
			return  new ModelMapper();
		}
}
