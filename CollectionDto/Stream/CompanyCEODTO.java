package com.xworks.collection.CollectionDto.Stream;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyCEODTO {
	private String name;
	private String company;
	private int age;
	private String country;
	private String qualification;
	private boolean married;
	private DaugtherDTO doughterDTO;
	public CompanyCEODTO(String name, String company, int age, String country, String qualification, boolean married,
			DaugtherDTO doughterDTO) {
		super();
		this.name = name;
		this.company = company;
		this.age = age;
		this.country = country;
		this.qualification = qualification;
		this.married = married;
		this.doughterDTO = doughterDTO;
	}
	public CompanyCEODTO(String name2, String company2, int age2, String country2, String qualification2, String string,
			DaugtherDTO d) {
		// TODO Auto-generated constructor stub
		this.name = name2;
		this.company = company2;
		this.age = age2;
		this.country = country2;
		this.qualification = qualification2;
		this.married = married;
		this.doughterDTO = doughterDTO;
	}
	@Override
	public String toString() {
		return "CompanyCEODTO [name=" + name + ", company=" + company + ", age=" + age + ", country=" + country
				+ ", qualification=" + qualification + ", married=" + married + ", doughterDTO=" + doughterDTO + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj!=null) {
			if(obj instanceof CompanyCEODTO ) {
				CompanyCEODTO eq=(CompanyCEODTO)obj;
			if(eq.getName().equals(this.getName())) {
				return true;
			}
			}
		}
		return false;
	}
	

}
