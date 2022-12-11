package com.xworks.abstraction.hospital;

import java.util.Scanner;

public class AppoloTester {
		
		public static void main(String m[]) {
			System.out.println("add size");
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			Appolo a=new AppoloImp(size);
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
			
			//System.out.println("enter the pateuint");
			// String pateint=sc.next();
			//a.getGenderbyPateintName(pateint);
			
//			System.out.println("enter the patient name");
//			 String pateint=sc.next();
//			 
//			 System.out.println("enter the patient address");
//			 String addresss=sc.next();
//			 
//			a.updatedpatienadressByName(pateint,addresss);
//			a.readpatient();
			
			
//			System.out.println("enter the patient name");
//			 String name=sc.next();
//			 
//			 System.out.println("enter the patient age");
//			 int age=sc.nextInt();
//			 a.updatePateintagebyname( age, name );
			 a.readpatient();
			 System.out.println("enter the deleted patient name");
			 String name=sc.next();
			 a.deletePatientByName(name);
			 a.getAllnewData();
			
//			System.out.println("enter the deleted patient name");
//			 String gender=sc.next();
//			 a.setGender(Gender.valueOf(gender));
//			 a.deletePatientByGender( gender);
			 
			
			sc.close();
		

	}

}
