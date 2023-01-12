package com.xworkz.autowired2.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Snake {

	private String name;
	@Value("5.23")
	private double lenght;
	@Value("Black")
	private String color;
	private String type;
	private boolean isPosionous;
	@Autowired
	public Snake(@Qualifier("name2") String name,@Qualifier("type3")String type,@Qualifier("isPosionous")boolean isPosionous) {
		this.name=name;
		this.type=type;
		this.isPosionous=isPosionous;
	}
	@Override
	public String toString() {
		return "Snake [name=" + name + ", lenght=" + lenght + ", color=" + color + ", type=" + type + ", isPosionous="
				+ isPosionous + "]";
	}
	
	
	

}
