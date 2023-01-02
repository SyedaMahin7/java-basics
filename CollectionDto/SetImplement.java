package com.xworks.collection.CollectionDto;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplement {
	public static void main(String m[]) {
		PlacesDTO p=new PlacesDTO("hampi", "karnataka", "India");
		PlacesDTO p1=new PlacesDTO("hampi", "karnataka", "India");
		PlacesDTO p2=new PlacesDTO("chennai", "thamilnadu", "India");
		Set<PlacesDTO> s=new LinkedHashSet<PlacesDTO>();
		s.add(p);
		s.add(p1);
		s.add(p2);
		System.out.println(s.size());
        System.out.println(s.hashCode());
}
}
