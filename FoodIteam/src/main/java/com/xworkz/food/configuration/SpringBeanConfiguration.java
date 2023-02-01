
package com.xworkz.food.configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan("com.xworkz.food")
public class SpringBeanConfiguration {
	public SpringBeanConfiguration() {
		System.out.println("created" + this.getClass().getSimpleName());
	}


}
