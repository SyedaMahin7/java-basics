package com.xworks.collection.Sorting;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class WeaponsDTO implements Serializable,Comparable{
	private String name;
	private String madeBy;
	private String  madeOn;
	private int price;
	private Type type;
	public WeaponsDTO(String name, String madeBy, String madeOn, int price, Type type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}
	
	@Override
	public int hashCode() {
		return 30;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof WeaponsDTO ) {
				WeaponsDTO  wepons	=(WeaponsDTO) obj;
				if(wepons.getName().equals(this.getName())&&wepons.getType().equals(this.getPrice())) {
					return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "WeaponsDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
	
	return 1;
	}
	
	

}
