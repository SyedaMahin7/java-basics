package com.xworks.collection.CollectionDto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class CallenderDTO {
	private String name;
	private int year;
	private String type;
	public CallenderDTO(String name, int year, String type) {
		super();
		this.name = name;
		this.year = year;
		this.type = type;
	}
	
	public boolean equals(Object obj) {
		if(obj!=null) {
			
			if(obj instanceof CallenderDTO) {
	         CallenderDTO ref=(CallenderDTO)obj;	
	         if(ref.getName().equals(this.getName()))
	        	 return true;
				
			}
		}
		return false;
	}

}
