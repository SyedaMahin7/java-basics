package com.xworkz.SpringBean.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
private String name;
private String lang;
private int age;
public Actor(@Value("salmanKhan")String name, @Value("hindi")String lang, @Value("53")int age) {
	super();
	this.name = name;
	this.lang = lang;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLang() {
	return lang;
}
public void setLang(String lang) {
	this.lang = lang;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}



}
