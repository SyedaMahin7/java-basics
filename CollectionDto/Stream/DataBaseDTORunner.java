package com.xworks.collection.CollectionDto.Stream;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataBaseDTORunner {
	public static void main(String[] args) {
		
		DatabaseVendorDTO d=new DatabaseVendorDTO ("microsoft","xyz", Type.network, 101, 5000);
		
		DatabaseVendorDTO d2=new DatabaseVendorDTO ("oracle","hjhj", Type.objectoriented, 30, 5000);
		Collection <DatabaseVendorDTO> c=new LinkedList<DatabaseVendorDTO>();
		c.add(d2);
		c.add(d);
		System.out.println(c);
//		List<String> l=c.stream().map(n->n.getDevelopedBy().toUpperCase()).collect(Collectors.toList());
//		System.out.println(l);
//		List<DatabaseVendorDTO> l2=c.stream().filter(n->n.getCost()<100 && n.getType().equals("network")).collect(Collectors.toList());
//		System.out.println(l2);
		List<DatabaseVendorDTO> l3=c.stream().filter(n->c.contains(n.getType())).collect(Collectors.toList());
		System.out.println(l3);
		l3.forEach(n->System.out.println(n));
	}

}
