package com.xworks.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Coupoun {
	public static void main(String[] args) {
		Collection collection =new ArrayList<String>();
		collection.add("free shipping coupons");
		collection.add("percentace off coupounds");
		collection.add("free trials");
		collection.add("holiday sales");
		collection.add("buy 1 get 2");
		collection.add(" Abandoned Cart coupons");
		collection.add("First -time Purchase");
		collection.add("newSettet subscription discount");
		collection.add("loyalty point");
		collection.add("Referrall promo");
		collection.add("customet mi;lestone");
		collection.add("automated counpons");
		collection.add("minimum purchase doscount");
		collection.add(" Exit-inteent");
		System.out.println(collection.size());
		collection.clear();
		System.out.println(collection.size());
		
	}

}
