package com.xworks.collection.CollectionDto.Stream;

import com.xworks.collection.CollectionDto.PlacesDTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PalaceDTO {
	private String name;
	private String location;
	private String builtby;
	private boolean isDestroyed;
	private int entryFees;
	public PalaceDTO(String name, String location, String builtby, boolean isDestroyed, int entryFees) {
		super();
		this.name = name;
		this.location = location;
		this.builtby = builtby;
		this.isDestroyed = isDestroyed;
		this.entryFees = entryFees;
	}
	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", builtby=" + builtby + ", isDestroyed="
				+ isDestroyed + ", entryFees=" + entryFees + "]";
	}
public boolean equals(Object obj) {
		
		if(obj!=null) {
			if(obj instanceof PalaceDTO ) {
				PalaceDTO eq=(PalaceDTO)obj;
			if(eq.getName().equals(this.getName())) {
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
