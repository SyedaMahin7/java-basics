package com.xworks.collection.CollectionDto.Stream;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class DaugtherDTO {
private String name;
private long mobile;
private int age;
private boolean isCommitted;
private boolean isAlive;
public DaugtherDTO(String name, long mobile, int age, boolean isCommitted, boolean isAlive) {
	super();
	this.name = name;
	this.mobile = mobile;
	this.age = age;
	this.isCommitted = isCommitted;
	this.isAlive = isAlive;
}
@Override
public String toString() {
	return "DaugtherDTO [name=" + name + ", mobile=" + mobile + ", age=" + age + ", isCommitted=" + isCommitted
			+ ", isAlive=" + isAlive + "]";
}


}
