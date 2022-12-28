package com.xworks.collection.CollectionDto;

public class PlaceDTOTester {
	public static void main(String[] args) {
		PlacesDTO p=new PlacesDTO("hampi", "karnataka", "India");
		PlacesDTO p1=new PlacesDTO("adoni", "andra pradesh", "India");
		PlacesDTO p2=new PlacesDTO("chennai", "thamilnadu", "India");
		System.out.println(p.getPlacesName().contains(p2.getPlacesName()));
		
	}

}
