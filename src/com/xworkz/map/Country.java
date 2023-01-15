package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Country {
	public static void main(String[] args) {
		Map<String, String> map=new TreeMap<String,String>((n,m)->m.compareTo(n));
		map.put("india", "dropadi");
		map.put("china " ,"Xijinping ");
		map.put("japan " ," kassym");
		map.put("pak " ,"salman ");
		map.put("uk " ,"ali ");
		map.put("afganistan " ,"ebrahim ");
		map.put("srilanka " ,"khaltmaagin ");
		map.put("bhangladesh " ," joko");
		map.put("kenada " ,"arif Alvia ");
		map.put("astraliya " ,"tayyip ");
		map.put("africa" ," min aung ");
		map.put("america" ," mohammad hassan");
		map.put("koriya " ," serdar berdimuhamedow");
		map.put("spain " ,"abdul ltif ");
		map.put("soundiarabiya" ,"kishida ");
		map.put("sudan" ," yang di");
		map.put("swizeland " ," norodom");
//		System.out.println(map.keySet());
//		System.out.println(map.values());
//		System.out.println(map.entrySet());
		map.forEach((n,m)->System.out.println(n+" "+m));
		System.out.println("update the presidante if the country is grater than 10");
		
		map.forEach((n,m)->{ System.out.println(n+" "+m);if(m.length()>10) {
			map.replace("soundiarabiya","yang");
			}
		});
		
}
}
