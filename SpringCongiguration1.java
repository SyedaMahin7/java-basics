package com.xworkz.SpringBean.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.SpringBean.Bean")
public class SpringCongiguration1 {
	@Bean
	public String read() {
		System.out.println("read method is created");
		return null;
	}
	@Bean
	public Rocket rocket1() {
		Rocket ref=new Rocket();
		ref.setCountry("china");
		ref.setBudget(5262.1);
		ref.setName("chinaRocket");
		
		return ref;
		
	}
	@Bean
	public Actor actor1() {
		Actor ac=new Actor("sharuk","hindi",53);
		return ac;
		
	}
	@Bean
	public Season summer() {
		System.out.println("registering with then summer with spring");
		Season s= new Season();
		s.setDuration(3);
		s.setName("summer");
		s.setStartingMount("march");
		return s;
	}
	

}
