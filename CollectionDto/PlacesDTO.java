package com.xworks.collection.CollectionDto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PlacesDTO {
	private String placesName;
	private String state;
	private String country;
	public PlacesDTO(String placesName,String state,String country){
		this.placesName=placesName;
		this.state=state;
		this.country=country;
		
	}
	
	public boolean equals(Object obj) {
		
		if(obj!=null) {
			if(obj instanceof PlacesDTO ) {
				PlacesDTO eq=(PlacesDTO)obj;
			if(eq.getPlacesName().equals(this.getPlacesName())) {
				return true;
			}
			}
		}
		return false;
		
	}
	@Override
	public int hashCode() {
		return 30;
		
	}

}
