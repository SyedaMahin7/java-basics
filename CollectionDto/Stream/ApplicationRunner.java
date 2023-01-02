package com.xworks.collection.CollectionDto.Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ApplicationRunner {
public static void main(String[] args) {
	
	ApplicationDTO A=new ApplicationDTO("java",1.8D,true);
	ApplicationDTO A1=new ApplicationDTO("python",6D,false);
	Collection<ApplicationDTO> c=new ArrayList<ApplicationDTO>();
	c.add(A1);
	c.add(A);
//	List <ApplicationDTO> l=c.stream().filter(n-> n.isFree()).filter(m->m.getName().equals("java")).collect(Collectors.toList());
//	System.out.println(l);
	List <ApplicationDTO> l2=c.stream().filter(n-> n.getVersion()>5).collect(Collectors.toList());
	System.out.println(l2);
	
}
}
