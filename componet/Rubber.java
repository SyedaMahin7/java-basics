package com.xworkz.SpringBean.componet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Rubber {
	@Autowired
	@Qualifier("name4")
	private String name;
	@Autowired
	@Qualifier("type1")
	private String type;
	@Autowired
	@Qualifier("price1")
	private int price;
	@Autowired
	@Qualifier("color1")
	private String color;
	@Autowired
	@Qualifier("sharp1")
	private boolean sharp;
	@Autowired
	@Qualifier("stolean1")
	private boolean stolean;
	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolean=" + stolean + "]";
	}
	

}
