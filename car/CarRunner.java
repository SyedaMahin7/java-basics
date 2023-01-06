package com.xworkz.spring.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarRunner {
	public static void main(String[] args) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
	}

}
