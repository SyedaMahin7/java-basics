package com.xwork.hospital_management_syatem.hospital;
import com.xwork.hospital_management_syatem.patien.*;
public class Hospital{
	public Patient patient;
	public boolean isAdmitted;
	public boolean isEmergency;
	public boolean isTreatmentRequered;
	public boolean admit(Patient patient) {
		System.out.println("inside the admit method");
		 boolean isAdmitted=true;
		 if(isTreatmentRequered==false) {
			 if(isEmergency==false) {
				 System.out.println("pateint details are");
				 this.patient=patient;
				 this.patient.displayInfo();
				 System.out.println("pateint is allow to admit");
				 
			 }
			 else {
				 System.out.println("add the patient details");
				 
			 }
			 
		 }
		 else {
			 System.out.println("no need to admit");
			 
		 }
		 
	
	return isAdmitted;
}
}
