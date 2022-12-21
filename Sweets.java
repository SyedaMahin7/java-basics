package com.xworks.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Sweets {
	public static void main(String m[]) {
		String sweets1="gulabjamun";
		String sweets2="jelebi";
	    String sweets3=	"peda";
	    String sweets4="cake";
	    String sweets5="pestry";
	    String sweets6="laddu";
	    String sweets7="milk peda";
	    String sweets8="kattu keer";
	    String sweets9="mysore pak";
	    String sweets10="dharvad peda";
	    String sweets11="mothi coore laddu";
	    String sweets12="kova";
	    String sweets13="chocolates";
	    Collection  collection = new ArrayList<String>();
	    collection .add(sweets1);
	    collection.add(sweets2);
	    collection.add(sweets3);
	    collection.add(sweets4);
	    collection.add(sweets5);
	    collection.add(sweets6);
	    collection.add(sweets7);
	    collection.add(sweets8);
	    collection.add(sweets9);
	    collection.add(sweets10);
	    collection.add(sweets11);
	    collection.add(sweets12);
	    System.out.println(collection .size());
	    collection . clear();
	    System.out.println(collection .size());
	    
	}

}
