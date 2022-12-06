package com.xwork.hospital_management_syatem.patien;

import com.xwork.hospital_management_syatem.gender.Gender;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Patient {
   private	String patientName;
	private String address;
	private Gender gender;
	private Integer age;
	//private String getGender;
	
	public Patient() {
		super();
		//this.patientName=patientName;
		//this.address=address;
		//this.gender=gender;
		//this.age=age;
	}
	
	
	public void displayInfo() {
		System.out.println("patient name is:"+getPatientName());
		System.out.println("address is"+getAddress());
		System.out.println("gender is"+getGender());
		System.out.println("age is"+getAge());
	}

}
