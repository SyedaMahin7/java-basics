package com.xworks.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoesSize {
	public static void main(String[] args) {
		Collection<Integer> c=new ArrayList<Integer>();
		c.add(6);
		c.add(7);
		c.add(8);
		c.add(9);
		c.add(10);
		c.add(11);
		c.add(12);
		c.add(13);
		c.add(14);
		c.add(9);
		c.add(10);
		c.add(11);
		c.add(12);
		c.add(13);
		c.add(14);
		
		
		//System.out.println(c);
		for(Integer i:c) {
			System.out.println(i);
		}
		System.out.println("--------------------");
		Iterator<Integer> i=c.iterator();
		while(i.hasNext()) {
			Integer element=i.next();
			System.out.println(element);
		}
	
	}

}
