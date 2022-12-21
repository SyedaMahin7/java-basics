package com.xworks.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Currencies {
	public static void main(String[] args) {
		Collection collection =new ArrayList<String>();
		collection.add("pound");
		collection.add("rupee");
		collection.add("dollar");
		collection.add("swiss");
		collection.add("pAustrain dollar");
		collection.add("yen");
		collection.add("kuwalti");
		collection.add("yuan");
		collection.add("new zealand Dollar");
		collection.add("Rand");
		collection.add("Omani");
		collection.add("dinar");
		collection.add("singapore dollar");
		collection.add("cyman islands dollar");
		collection.add("hong kong dollar");
		collection.add("brunei dollar");
		collection.add("gibraltar");
		collection.add("indonesian");
		collection.add("Mexican peso");
		collection.add("danish krone");
		collection.add("shekel");
		collection.add("norwegian krone");
		collection.add("dinar");
		collection.add("russian ruble");
		collection.add("lira");
		collection.add("swedish krone");
		
		System.out.println(collection .size());
		collection .clear();
		System.out.println(collection.size());
		
		
	}

}
