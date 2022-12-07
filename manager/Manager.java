package com.xworkz.showroommanagement.manager;

import com.xworkz.showroommanagement.showroom.Gender;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Manager {
	private String ManagerName;
	private Gender gender;
	private int age;
	private String address;
	
	public Manager() {
		
		
	}
	public void displayInfo() {
		System.out.println("manager name is"+getManagerName());
		System.out.println("manager gender is"+ getGender());
		System.out.println("manager address is"+ getAddress());
		System.out.println("manager age is"+ getAge());
		
		
	}
	
	

}
