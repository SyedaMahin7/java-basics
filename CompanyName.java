package com.xworks.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CompanyName {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("tcs");
		c.add("wipro");
		c.add("sonata ");
		c.add("terologic");
		c.add("infosis");
		c.add("ibm");
		c.add("hp");
		c.add("lg");
		c.add("Mphosis");
		c.add("6dTEchnology");
		c.add("robosoft");
		c.add("justdial");
		c.add("capchemini ");
		c.add("google");
		c.add("microsoft");
		c.add("tech mahendra");
		c.add("bell");
		c.add("apple ");
		c.add("google");
		c.add("infosis");
		System.out.println(c.size());
		
		
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
