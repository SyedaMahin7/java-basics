package com.xworks.abstraction.hospital;
import com.xworks.abstraction.hospital.Appolo;
import com.xworks.abstraction.hospital.Patient;
public class AppoloImp implements Appolo {
	public Patient patients[];
	public Patient newPatients[];
	public int index;
	public AppoloImp(int size) {
		patients=new Patient[size];
		
	}

	@Override
	public boolean addpatient(Patient patient) {
		boolean isAdmitted=false;
		System.out.println("inside add pateint method");
		boolean isPateintisAdded=false;
		if(patient!=null ) {
			System.out.println("pateint deatils are right");
			patients[index++]=patient;
					}	
	
	
		return isAdmitted;
	}

	@Override
	public void readpatient() {
		System.out.println("iside read method");
		for(int i=0;i<patients.length;i++) {
			System.out.println(patients[i].getPatientName()+" "+patients[i].getAddress()+" "+patients[i].getAge());
			
		}
		
	}

	@Override
	public void getPatentByName(String pateintname) {
		System.out.println("inside getpatient method");
		for(int i=0;i<patients.length;i++) {
			if(patients[i].getPatientName().equals(pateintname)) {
			System.out.println(patients[i].getPatientName()+" "+patients[i].getAddress()+" "+patients[i].getAge());
			}
			else {
				System.out.println("pateint is not visible");
			}
			
			
	}
		
	}

	@Override
	public void getPateintByAge(int age) {
		System.out.println("inside getpateint method");
		for(int i=0;i<patients.length;i++) {
		if(patients[i].getAge().equals(age)) {
			System.out.println(patients[i].getPatientName()+" "+patients[i].getAddress()+" "+patients[i].getAge());
	
			
		}
		}
		
	}

	@Override
	public void getPateintByGender(Gender gender) {
		System.out.println("inside getpateint method");
		for(int i=0;i<patients.length;i++) {
		if(patients[i].getGender().equals(gender)) {
			System.out.println(patients[i].getPatientName()+" "+patients[i].getAddress());
	
			
		}
		}
		
	}

	@Override
	public void getPateintbyAdress(String adress) {
		System.out.println("inside getpateint method");
		for(int i=0;i<patients.length;i++) {
		if(patients[i].getAddress().equals(adress)) {
			System.out.println(patients[i].getPatientName()+" "+patients[i].getAddress());
	
			
		}
		}
		
	}

	@Override
	public void getGenderbyPateintName(String pateintname) {
		System.out.println("inside getpateint method");
		for(int i=0;i<patients.length;i++) {
		if(patients[i].getPatientName().equals(pateintname)) {
			System.out.println(patients[i].getPatientName()+" "+patients[i].getAddress());
	
			
		}
		}
		
	}

	@Override
	public boolean updatedpatienadressByName(String name, String newPateintAdress) {
	
		boolean isUpdated=false;
		System.out.println("inside update methods");
		for(int i=0;i<patients.length;i++) {
			 if(patients[i].getPatientName().equals(name));
			 {
				 System.out.println("patient name is mathced ");
				 patients[i].setAddress(newPateintAdress);
				 isUpdated=true;
			 }
		}
		return isUpdated;
		
	}

	@Override
	public boolean updatePateintagebyname(int age, String name) {
		
		boolean isUpdated=false;
		System.out.println("inside age updates method");
		System.out.println("inside update methods");
		for(int i=0;i<patients.length;i++) {
			 if(patients[i].getPatientName().equals(name));
			 {
				 System.out.println("patient name is mathced ");
				 patients[i].setAge(age);
				 isUpdated=true;
			 }
		}
		return isUpdated;
	}

	@Override
	public boolean deletePatientByName(String name) {
		boolean isDeleted=false;
		 newPatients=new Patient[patients.length-1];
		for(int i=0,k=0;i<patients.length;i++) {
			if(!patients[i].getPatientName().equals(name)) {
				newPatients[k++]=patients[i];
				isDeleted=true;
			}
		}
		return isDeleted;
	}

	@Override
	public boolean deletePatientByAge(int age) {
		boolean isDeleted=false;
		 newPatients=new Patient[patients.length-1];
		for(int i=0,k=0;i<patients.length;i++) {
			if(!patients[i].getPatientName().equals(age)) {
				newPatients[k++]=patients[i];
				isDeleted=true;
			}
		}
		return isDeleted;
		
	}

	@Override
	public boolean deletePatientByGender(Gender gender) {
		boolean isDeleted=false;
		 newPatients=new Patient[patients.length-1];
		for(int i=0,k=0;i<patients.length;i++) {
			if(!patients[i].getPatientName().equals(gender)) {
				newPatients[k++]=patients[i];
				isDeleted=true;
			}
		}
		return isDeleted;
		
	
	}

	@Override
	public void getAllnewData() {
		System.out.println("iside read method");
		for(int i=0;i<newPatients.length;i++) {
			System.out.println(newPatients[i].getPatientName()+" "+newPatients[i].getAddress()+" "+patients[i].getAge());
			
		}
	}

	@Override
	public void Appolo(int size) {
		// TODO Auto-generated method stub
		
	}
		
	}
	

