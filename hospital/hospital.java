package com.xworkz.hospital;

public class hospital{
String patientName[]=new String[10];
int index;

  public boolean savePatientName(String nm) {
	  System.out.println("inside savePatientName");
	  if(nm!=null&&patientName.length>index) {
		  patientName[index++]=nm;
		  //index++;
		  return true;
	  }
	  else {
		  System.out.println("pateint name is full..bed ella");
	  }
	  System.out.println("outside savePatientName");
	  return false;
	  
  }
  public void getPatientName() {
	  for(int i=0;i<patientName.length;i++) {
		  System.out.println(patientName[i]);
	  }
  }
}
