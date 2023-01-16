package com.xworkz.dependenci.bean;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider{

	@Override
	public void connet() {
		System.out.println(" cannet method is called in jio");
		
	}

}
