package com.xworkz.autowired2.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class newsPaper {
	@Value("234")
	private int id;
	private String name;
	private String ownerName;
	@Value("kannada")
	private String language;
	private int price;
	@Autowired
	public newsPaper(@Qualifier("name") String name, @Qualifier("ownerName")String ownerName) {
		System.out.println("paramiteerconstructor is created by using spring");
		this.name=name;
		this.ownerName=ownerName;
	}
	public void setPrice(@Value("123")int price) {
		this.price=price;
		
	}
	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + "]";
	}
	
	
	

}
