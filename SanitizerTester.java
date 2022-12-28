package com.xworks.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SanitizerTester  {
	public static void main(String[] args) {
		SanitizerDTO s=new SanitizerDTO(52,"dettal", 20.00, "white");
		
		SanitizerDTO s1=new SanitizerDTO(53,"himalaya", 20.00,"white");
		SanitizerDTO s2=new SanitizerDTO(54,"cossmic", 20.00,"white");
		SanitizerDTO s3=new SanitizerDTO(55,"zuci", 20.00,"white");
		SanitizerDTO s4=new SanitizerDTO(56,"lifebuoy", 20.00,"pink");
		SanitizerDTO s5=new SanitizerDTO(57,"savlon", 20.00,"white");
		SanitizerDTO s6=new SanitizerDTO(58,"detal", 20.00,"white");
		SanitizerDTO s7=new SanitizerDTO(59,"Sterillium", 20.00,"white");
		SanitizerDTO s8=new SanitizerDTO(60,"godre", 20.00,"white");
		SanitizerDTO s9=new SanitizerDTO(61,"detal", 20.00,"white");
		
		Collection<SanitizerDTO> coll=new ArrayList<SanitizerDTO>();
		coll.add(s);
		coll.add(s1);
		coll.add(s2);
		coll.add(s3);
		coll.add(s4);
		coll.add(s5);
		coll.add(s6);
		coll.add(s7);
		coll.add(s8);
		coll.add(s9);
		for(SanitizerDTO sani:coll) {
			if(sani.getPrice()>10) {
				System.out.println(" prce is"+ sani);
			}
		}
		Iterator<SanitizerDTO> re=coll.iterator();
		while(re.hasNext()) {
		
			SanitizerDTO sa=re.next();
			if(sa.getColor().contains("white")) {
			
				coll.remove(sa);
				System.out.println("remove method"+sa);
				
			}
			
		}
		
		for(SanitizerDTO min:coll) {
			
		}
		
		
		
	}

}
