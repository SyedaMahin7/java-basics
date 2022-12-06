package com.xwork.hospital_management_syatem;
import com.xwork.hospital_management_syatem.hospital.*;
import com.xwork.hospital_management_syatem.patien.*;

import java.util.Scanner;

import com.xwork.hospital_management_syatem.gender.*;
public class HospitalTester {
	public static void main(String m[]) {
		
		int age9=89;
		Integer age1=age9;
		
		long age2=9618408008l;
		Long age3=age2;
		long age4=age3;
		
		

	    float age22=9618408008l;
	  Float   age33=age22;
	 float age44=age33;
	 

		double age25=96.000;
		Double age35=age25;
		double age26=age35;
		
		

		char c='k';
		Chara age3=age2;
		long age4=age3;
		
		
		
		//Patient patient=new Patient("mahi","hospet",Gender.male,23);
		//p.displayInfo();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the patiet name");
		String name=sc.next();
		System.out.println("enter the patiet address");
		String add=sc.next();
		System.out.println("enter the patiet age");
		int age=sc.nextInt();
		
		
		Patient patient=new Patient(name,add,Gender.male,age);
		Hospital h=new Hospital();
		h.admit(patient);
		System.out.println(age1);
		
		sc.close();
		}

}
