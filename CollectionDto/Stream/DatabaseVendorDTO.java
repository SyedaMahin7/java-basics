package com.xworks.collection.CollectionDto.Stream;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class DatabaseVendorDTO {
	private String name;
	private String developedBy;
	private  Type type;
	private int size;
	private int cost;
	public DatabaseVendorDTO(String name, String developedBy, Type type, int size, int cost) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.type = type;
		this.size = size;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "DatabaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", type=" + type + ", size=" + size
				+ ", cost=" + cost + "]";
	}
	
	

}
