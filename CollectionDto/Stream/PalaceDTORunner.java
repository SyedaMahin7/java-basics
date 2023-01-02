package com.xworks.collection.CollectionDto.Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PalaceDTORunner {
public static void main(String[] args) {
	PalaceDTO p=new PalaceDTO("mysore", "mysore", "vadeyar", false, 100);
	PalaceDTO p1=new PalaceDTO("vijayanagar", "hampi", "Akka bukka", true, 100);
	Collection<PalaceDTO> c=new ArrayList<PalaceDTO>();
	c.add(p1);
	c.add(p);
	List<PalaceDTO> list=c.stream().filter(s ->s.isDestroyed()!=true).collect(Collectors.toList())
			;
	System.out.println(list);
	
}
}
