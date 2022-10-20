package com.xworkz.hospital;
import com.xworkz.hospital.Hospital;
public class HospitalTester {
public static void main(String n[]) {
	Hospital hospital = new Hospital() ; 
	  hospital.savePatientNames("Ganesh");
	  hospital.savePatientNames("Ganesha");
	  hospital.savePatientNames("Ganeshi");
	  hospital.savePatientNames("Guna");
	  hospital.savePatientNames("Dasappa");
	  hospital.savePatientNames("Yellamma");
	  hospital.savePatientNames("Tiger");

	  hospital.getPatientNames();

	  hospital.updatePatientNames("Guna", "Guna Sarkar");

	  hospital.getPatientNames();
	
	
}
}
