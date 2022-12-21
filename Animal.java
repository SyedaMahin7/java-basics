package com.xworks.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animal {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("lion");
		c.add("monkey");
		c.add("crocadile ");
		c.add("snake ");
		c.add("dog ");
		c.add("cow ");
		c.add("pig ");
		c.add(" parrot");
		c.add(" ajgar ");
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
