 package com.xwork.hospital_management_syatem.Appolo;

import com.xwork.hospital_management_syatem.gender.Gender;
import com.xwork.hospital_management_syatem.hospital.Hospital;
import com.xwork.hospital_management_syatem.patien.Patient;


public class Appolo extends Hospital{
	public Patient[] patients;
	public int index;
	public Appolo(int size) {
		patients=new Patient[size];
		
	}
	public boolean addpatient(Patient patient) {
		System.out.println("inside add pateint method");
		boolean isPateintisAdded=false;
		if(patient!=null ) {
			System.out.println("pateint deatils are right");
			patients[index++]=patient;
					}	
		
		return isAdmitted;
		
	}
	
	public void readpatient() {
		System.out.println("iside read method");
		for(int i=0;i<patients.length;i++) {
			System.out.println(patients[i].getPatientName()+" "+patients[i].getAddress());
			
		}
	}
	public void getPatentByName(String pateintname) {
		System.out.println("inside getpatient method");
		for(int i=0;i<patients.length;i++) {
			if(patients[i].getPatientName().equals(pateintname)) {
			System.out.println(patients[i].getPatientName()+" "+patients[i].getAddress());
			}
			else {
				System.out.println("pateint is not visible");
			}
			//getPateintNameByGender9Gender)
			//getGenderbyPateintName(String pateintname)
			
	}

}
	public void getPateintByAge(int age) {
		System.out.println("inside getpateint method");
		for(int i=0;i<patients.length;i++) {
		if(patients[i].getAge().equals(age)) {
			System.out.println(patients[i].getPatientName()+" "+patients[i].getAddress());
	
			
		}
		}
	}
	
	public void getPateintByGender(Gender gender) {
		System.out.println("inside getpateint method");
		for(int i=0;i<patients.length;i++) {
		if(patients[i].getGender().equals(gender)) {
			System.out.println(patients[i].getPatientName()+" "+patients[i].getAddress());
	
			
		}
		}
	}
	public void  getPateintbyAdress(String adress) {
		System.out.println("inside getpateint method");
		for(int i=0;i<patients.length;i++) {
		if(patients[i].getAddress().equals(adress)) {
			System.out.println(patients[i].getPatientName()+" "+patients[i].getAddress());
	
			
		}
		}
	}
	public void getGenderbyPateintName(String pateintname) {
		System.out.println("inside getpateint method");
		for(int i=0;i<patients.length;i++) {
		if(patients[i].getPatientName().equals(pateintname)) {
			System.out.println(patients[i].getPatientName()+" "+patients[i].getAddress());
	
			
		}
		}
	}
	
}
