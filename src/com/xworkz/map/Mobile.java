package com.xworkz.map;

import java.util.Map;
import java.util.TreeMap;

public class Mobile {
	public static void main(String[] args) {
		Map<String,Double> map=new TreeMap<String,Double>();
		map.put("vivo", 23000D);
		map.put("oppo", 24000D);
		map.put("readme", 25000D);
		map.put("realme", 27000D);
		System.out.println(map.size());
		map.forEach((n,m)->System.out.println(n+" "+m));
		System.out.println("print in upper case");
		map.forEach((n,m)->{System.out.println(n.toUpperCase()+" "+m);});
		map.forEach((n,m)->{System.out.println("============"); if(m>25000) {System.out.println(n+" "+m);}});
		
		System.out.println("key is less than 5");
		map.forEach((n,m)->{System.out.println("==="); if(n.length()<5) {
			System.out.println(n+" "+m);};
		});
		
		
	}

}
