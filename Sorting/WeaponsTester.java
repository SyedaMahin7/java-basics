package com.xworks.collection.Sorting;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;


public class WeaponsTester {
	public static void main(String[] args) {
		WeaponsDTO we1=new WeaponsDTO("Stick", "wood","wood" , 50, Type.wood);
		WeaponsDTO we2=new WeaponsDTO("knife", "steel","metal" , 452, Type.metal);
		WeaponsDTO we3=new WeaponsDTO("blade", "steel", "metal", 456,Type.metal );
		WeaponsDTO we4=new WeaponsDTO("clud", "steel", "metal", 89, Type.metal);
		WeaponsDTO we5=new WeaponsDTO("ax", "metal", "metal", 78, Type.metal);
		Collection<WeaponsDTO> c=new LinkedList<WeaponsDTO>();
		c.add(we5);
		c.add(we4);
		c.add(we3);
		c.add(we2);
		c.add(we1);
		System.out.println("=====");
		//c.stream().filter(n->n.getPrice()>100).collect(Collectors.toList()).forEach(m->System.out.println(m));
		//c.stream().filter(n->n.getMadeBy().equals("metal")&& n.getMadeOn().equals("metal")).collect(Collectors.toList()).forEach(m->System.out.println(m));
		//c.stream().sorted().forEach(b->System.out.println(b));
	//c.stream().sorted((a1,a2)->a2.getName().compareToIgnoreCase(a1.getName())).forEach(n->System.out.println(n));
	//c.stream().sorted((a1,a2)->a1.getMadeBy().compareToIgnoreCase(a2.getMadeBy())).forEach(n->System.out.println(n));
		//c.stream().sorted((a1,a2)->a2.getMadeOn().compareTo(a1.getMadeOn())).forEach(n->System.out.println(n));
		//c.stream().sorted((a1,a2)->a2.getPrice().compareTo(a1.getPrice())).forEach(n->System.out.println(n));
		
//		Comparator <WeaponsDTO> m2=Comparator.comparing(WeaponsDTO::getPrice);
//		c.stream().sorted(m2).forEach(n->System.out.println(n));
		Comparator <WeaponsDTO> m2=Comparator.comparing(WeaponsDTO::getName).thenComparing(WeaponsDTO::getPrice);
		c.stream().sorted(m2).forEach(n->System.out.println(n));
		
		
		
		
	}

}
