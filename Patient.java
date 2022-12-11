package com.xworks.abstraction.hospital;
import com.xworks.abstraction.hospital.Appolo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data	
@Getter
@Setter


	public class Patient {
	   private	String patientName;
		private String address;
		private Gender gender;
		private Integer age;
		
		
		public Patient() {
			
		}
		
		
		public void displayInfo() {
			System.out.println("patient name is:"+getPatientName());
			System.out.println("address is"+getAddress());
			System.out.println("gender is"+getGender());
			System.out.println("age is"+getAge());
		}

}
