package com.xworkz.autowired2.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String name ;
	private String type;
	@Value("122")
	private int number;
	@Value("12.23")
	private double version;
	private String company;
	private String stroke;
	@Autowired
	public Engine(@Qualifier("type1")String type,@Qualifier("name1")String name,@Qualifier("company")String company) {
		this.name=name;
		this.type=type;
		this.company=company;
		
	}
	public void setStroke(@Value("hjhh")String stroke) {
		this.stroke=stroke;
	}
	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", stroke=" + stroke + "]";
	}
	
	
	
}
