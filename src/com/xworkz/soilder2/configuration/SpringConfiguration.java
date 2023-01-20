package com.xworkz.soilder2.configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import com.xworkz.soilder2.dto.SoilderDTO;

@Configuration
@ComponentScan("com.xworkz.soilder2")
public class SpringConfiguration {
	@Bean
	public Validator validator() {
	ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
	Validator validator=factory.getValidator();
	return validator;
	}
}
