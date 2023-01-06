package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircleRunner {
public static void main(String[] args) {
	ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	BhashamCircle ref=spring.getBean(BhashamCircle.class);
	System.out.println(ref);
}
}
