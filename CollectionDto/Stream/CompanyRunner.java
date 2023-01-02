package com.xworks.collection.CollectionDto.Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CompanyRunner {
	public static void main(String[] args) {
		DaugtherDTO d= new DaugtherDTO(" mahin", 2020145864L, 523, false, true);
		DaugtherDTO d2= new DaugtherDTO(" summu", 2020167764L, 5452, true, true);
	
		CompanyCEODTO c=new CompanyCEODTO("Syeda","CEO", 40, "indian","BE", "true",d);
		CompanyCEODTO c2=new CompanyCEODTO("mehatab","CEO", 35, "indian","BE", "true",d2);
		
		Collection <CompanyCEODTO> m= new ArrayList<CompanyCEODTO>();
		m.add(c);
		m.add(c2);
		List<CompanyCEODTO> l=m.stream().filter(n->n.getDoughterDTO()).collect(Collectors.toList());
		System.out.println(l);
		
	}

}
