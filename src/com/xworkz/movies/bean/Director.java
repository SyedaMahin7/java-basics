package com.xworkz.movies.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	@Autowired
	private Experiance experiance;
	public Director() {
		System.out.println("director is created by using Spring");
	}
	

}
