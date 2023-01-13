package com.xworkz.movies.bean;

import org.springframework.stereotype.Component;

@Component
public class Producer {
	private Assistant assistant;
	public Producer() {
		System.out.println("producer is created ");
	}

}
