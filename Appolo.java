package com.xworks.abstraction.hospital;
public interface Appolo {
	//public Patient[] patient;
	public void  Appolo(int size) ;
	public boolean addpatient(Patient patient);
	public void readpatient();
	public void getPatentByName(String pateintname) ;
	public void getPateintByAge(int age);
	public void getPateintByGender(Gender gender);
	public void  getPateintbyAdress(String adress);
	public void getGenderbyPateintName(String pateintname) ;
	public boolean updatedpatienadressByName(String name,String newPateintAdress );
	public boolean updatePateintagebyname(int age,String name );
	public boolean deletePatientByName(String name);
	public boolean deletePatientByAge(int age) ;
	public boolean deletePatientByGender(Gender gender) ;
	public void  getAllnewData();
	
		
}
