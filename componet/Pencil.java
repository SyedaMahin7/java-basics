package com.xworkz.SpringBean.componet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	@Autowired
	@Qualifier("name3")
	private String name;
	@Autowired
	@Qualifier("type")
	private String type;
	@Autowired
	@Qualifier("price")
	private int price;
	@Autowired
	@Qualifier("color")
	private String color;
	@Autowired
	@Qualifier("sharp")
	private boolean sharp;
	@Autowired
	@Qualifier("stolean")
	private boolean stolean;
	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp="
				+ sharp + ", stolean=" + stolean + "]";
	}
	
	

}
