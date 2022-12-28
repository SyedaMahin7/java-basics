package com.xworks.collection.CollectionDto;

import java.util.ArrayList;
import java.util.Collection;

public class AirportTester {
	public static void main(String[] args) {
		
		AirportDTO a=new AirportDTO("kempe gouda","karnataka","telengana");
		AirportDTO a1=new AirportDTO("kempe gouda","andra","telengana");
		AirportDTO a2=new AirportDTO("kempe gouda","kerala","telengana");
		Collection<AirportDTO>ref=new ArrayList<AirportDTO>();
		ref.add(a);
		ref.add(a1);
		ref.add(a2);
		System.out.println(a.getAirportName().equals(a1.getAirportName()));
		System.out.println(a.getAirportName().contains(a1.getAirportName()));
		
		

	}

}
