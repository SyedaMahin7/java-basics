package com.xworkz.autowired2.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.autowired2.bean")
public class SpringCoonfiguration {
	@Bean
	public String name() {
		return "PrajaVani";
	}
	@Bean
	public String lang() {
		return "abc";
	}
	@Bean
	public String ownerName() {
		return "ahjj";
	}
	@Bean
	public String type1() {
		return "carEngine";
	}
	@Bean
	public String name1() {
		return "bajajmotor";
	}
	@Bean
	public String company() {
		return "bajaj";
	}
	@Bean
	public String name2() {
		return "blackkobra";
	}
	@Bean
	public String type3() {
		return "watersnake";
	}
	@Bean
	public boolean isPosionous() {
		return true;
	}
	
	@Bean
	public LocalDate date() {
		return LocalDate.of(2000, 2, 3);
		
	}
	@Bean
	public boolean isSuside() {
		return true;
	}
	@Bean
	public String schhool() {
		return "syn schhool";
	}
	@Bean
	public String grandfather() {
		return "jilan";
	}
	@Bean
	public String grandMother() {
		return "mohammadi";
	}
	@Bean
	public String friendName() {
		return "sahana";
	}
	@Bean
	public String murderName() {
		return "sudha";
	}
	@Bean
	public String collegename() {
		return "rymec";
	}
	
	
	
	
	

}
