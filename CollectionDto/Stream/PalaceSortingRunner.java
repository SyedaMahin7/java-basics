package com.xworks.collection.CollectionDto.Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class PalaceSortingRunner {
	public static void main(String[] args) {
		PalaceDTO p=new PalaceDTO("mysore", "mysore", "vadeyar", false, 100);
		PalaceDTO p1=new PalaceDTO("vijayanagar", "hampi", "Akka bukka", true, 50);
		Collection<PalaceDTO> c=new ArrayList<PalaceDTO>();
		c.add(p1);
		c.add(p);
		//c.stream().sorted().forEach(n->System.out.println(n));
		Comparator<PalaceDTO> compare=(p3,p2)->Double.compare(p3.getEntryFees(),p2.getEntryFees());
		System.out.println("sorted by fees entey");
		c.stream().sorted(compare).forEach(n->System.out.println(n));
		
		
	}

}
