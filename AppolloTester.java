package com.xwork.hospital_management_syatem;

import java.util.Scanner;

import com.xwork.hospital_management_syatem.Appolo.Appolo;
import com.xwork.hospital_management_syatem.gender.Gender;
import com.xwork.hospital_management_syatem.patien.Patient;

public class AppolloTester {
	public static void main(String m[]) {
		System.out.println("add size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		Appolo a=new Appolo(size);
		for(int i=0;i<size;i++) {
		Patient patient=new Patient();
		System.out.println("enter the patient name");
		//patient.setPatientName(sc.next());
		String name=sc.next();
		patient.setPatientName(name);
		System.out.println("enter the patient address");
		patient.setAddress(sc.next());
		System.out.println("enter the patient gender");
		String gender=sc.next();
		patient.setGender(Gender.valueOf(gender));
		System.out.println("enter the patient age");
		patient.setAge(sc.nextInt());
		a.addpatient(patient);
		}
		a.readpatient();
		//System.out.println("enter the pateint name");
		//String pateintName=sc.next();
		//a.getPatentByName(pateintName);
		
		//System.out.println("enter the pateint age");
		//int pateintage=sc.nextInt();
		//a.getPateintByAge(pateintage);
		
		//System.out.println("enter the gender");
		// String gender=sc.next();
		//a.getPateintByGender(Gender.valueOf(gender));
		
		System.out.println("enter the pateuint");
		 String pateint=sc.next();
		a.getGenderbyPateintName(pateint);
		
		
		
		
		
		sc.close();
	}

}
