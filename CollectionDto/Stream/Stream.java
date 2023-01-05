package com.xworks.collection.CollectionDto.Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
		
		
		ArrayList<String> s=new ArrayList<String>();
		s.add("mahin");
		s.add("syeda");
		s.add("summu");
		
//		Collections.sort(s);
//		System.out.println(s);
//		s.stream().sorted().collect(Collectors.toList()).forEach(n->System.out.println(n));
//		Consumer<String> s1=(a)->System.out.println(a);
//		s.forEach(s1);
		//int count=0;
		s.stream().filter(n-> n.contains("summu")).map(n->n.toUpperCase()).collect(Collectors.toList()).forEach(n->System.out.println(n));
		
	}

}
