package com.xworks.collection.CollectionDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListImplementation {
	public static void main(String[] args) {
	      List<String> var=new LinkedList<String>();
	      var.add("mahi");
	      var.add("summu");
	      var.add("anu");
	      var.set(1, "syeda");//[mahi syeda,anu]
	      var.remove(0);//syeda anu
	      var.remove("anu");
	      var.add(0,"anu");
	      var.add(1,"baba");//mehatabsyeda
	      System.out.println(var);
	      ListIterator<String> l=var.listIterator(3);
	     while(l.hasPrevious()) {
	    	 String k=l.previous();
	    	 System.out.println(k);
	     }
	     
	      
	}

}
