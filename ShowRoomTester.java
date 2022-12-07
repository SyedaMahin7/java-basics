package com.xworkz.showroommanagement;

import java.util.Scanner;

import com.xworkz.showroommanagement.manager.Manager;
import com.xworkz.showroommanagement.showroom.Gender;
import com.xworkz.showroommanagement.showroom.ShowRoom;

public class ShowRoomTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size ");
		int size =sc.nextInt();
		ShowRoom s=new ShowRoom(size);
	    Manager m=new Manager();
	   for (int i = 0; i < size; i++) {
		   System.out.println("enter the manager name");
	  String name= sc.next();
	  m.setManagerName(name);
	  System.out.println("enter the manager age");
	  int age= sc.nextInt();
	  m.setAge(age);
	  System.out.println("enter the manager address");
	  String address= sc.next();
	  m.setAddress(address);
	  System.out.println("enter the manager gender");
	  String gender= sc.next();
	  m.setGender(Gender.valueOf(gender));
	  s.addManager(m);
	   }
	   
	  
	 
//	  System.out.println("enter the manager name");
//	  String name=sc.next();
//	  s.getManagerNameByName(name);
	   s.readManager();
//	  System.out.println("enter the manager name");
//	  String name=sc.next();
//	  System.out.println("enter new address");
//	  String address=sc.next();
//	  s.updatednameByAddress(name, address);
	  
	  System.out.println("enter the deliting manager name");
	  String name=sc.next();
	  s.deleteManagerNameByName(name);
	  s.getAllnewData();
	  sc.close();
	
	  
	  
	  
	  
	  
	  
		
	}

}
