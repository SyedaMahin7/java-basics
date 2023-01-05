package com.xworks.collection.CollectionDto.Stream;

import com.xworks.collection.CollectionDto.PlacesDTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PalaceDTO implements Comparable<PalaceDTO>{
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
	
//	@Override
//	public int compareTo(PalaceDTO o) {
//		// TODO Auto-generated method stub
//		if(o.entryFees==entryFees) {
//			return 0;
//		}else if(o.entryFees>this.entryFees) {
//			return 1;}
//			if(o.entryFees>entryFees) {
//				return -1;
//			}
//		else 
//		return -1;
//		//return entryFees.compareTo(o.entryFees);
//	
//	}
	}
	
	
	
	
	


