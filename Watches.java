package com.xworks.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watches {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("sonata");
		c.add("titanic");
		c.add("Apple ");
		c.add("omega ");
		c.add("rolex");
		
		//System.out.println(c);
		for(String i:c) {
			System.out.println(i);
		}
		System.out.println("--------------------");
		Iterator<String> i=c.iterator();
		while(i.hasNext()) {
			String element=i.next();
			System.out.println(element);
		}
	
	}

}
