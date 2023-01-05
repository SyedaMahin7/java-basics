package com.xworks.collection.Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Sorting {
	public static void main(String[] args) {
		LinkedList<Integer> n=new LinkedList<Integer>();
		n.add(2);
		n.add(5);
		n.add(1);
		//old methods
		//Collections.sort(n);
		//System.out.println(n);
		n.stream().sorted().forEach(e->System.out.println(e));
	}

}
