package com.xworks.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCity {
public static void main(String[] args) {
	Collection<String> c=new ArrayList<String>();
	c.add("rajaji nagar metro ");
	c.add("kempegoda metro ");
	c.add("kengeri");
	c.add("chickpete");
	c.add("malleshvaram");
	
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
