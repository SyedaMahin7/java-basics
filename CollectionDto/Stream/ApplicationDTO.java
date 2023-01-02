package com.xworks.collection.CollectionDto.Stream;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class ApplicationDTO {
	private String name;
	private double version;
	private boolean free;
	public ApplicationDTO(String name, double version, boolean free) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
	}
	
	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", free=" + free + "]";
	}
	

}
