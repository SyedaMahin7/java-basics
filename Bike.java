package com.xworks.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Bike {
public static void main(String[] args) {
	 Collection c=new ArrayList<String>();
	 c.add("honda");
	 c.add("tvs");
	 c.add("activa"); 
	 c.add("bmw");
	 c.add("honda");
	 c.add("jupital");
	 c.add("bajaj");
	 c.add("royal Enfield");
	 c.add("yamaha");
	 c.add("suzuki");
	 c.add("activa");
	 c.add("xl");
	 c.add("kawasaki");
	 c.add("ducati");
	 c.add("cbr");
	 c.add("ducati");
	 c.add("kawasaki");
	 c.add("honda");
	 
	 System.out.println(c.size());
	 c.clear();
	 System.out.println(c.size());
}
}
