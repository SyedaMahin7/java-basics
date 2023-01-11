package com.xworkz.SpringBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext ref=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		
	}

}
