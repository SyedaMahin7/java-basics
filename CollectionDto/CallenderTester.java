package com.xworks.collection.CollectionDto;

public class CallenderTester {
	public static void main(String[] args) {
		
		CallenderDTO c= new CallenderDTO("ganesh", 2022, "hindu");
		CallenderDTO c2= new CallenderDTO("bharati", 2022, "hindu");
		CallenderDTO c3= new CallenderDTO("icici", 2022, "hindu");
		System.out.println(c.getName().contains(c2.getName()));
		
	}

}
