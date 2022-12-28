package com.xworks.collection.CollectionDto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Holiday {
	private String holidayType;
	private int noOfholiday;
	public Holiday(String holidayType, int noOfholiday) {

		this.holidayType = holidayType;
		this.noOfholiday = noOfholiday;
	}
	
	public boolean equals(Object obj) {
		if(obj!=null) {
			
			if(obj instanceof Holiday) {
	         Holiday ref=(Holiday)obj;	
	         if(ref.holidayType.equals(this.getHolidayType()))
	        	 return true;
				
			}
		}
		return false;
	}

}



