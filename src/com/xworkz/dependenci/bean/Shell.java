package com.xworkz.dependenci.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Shell implements PetrolBunk {
	@Autowired
	@Qualifier("petrol")
	private Fuel f;
    
	@Override
	public void purchase() {
		System.out.println("purchase method is creted in shell");
		f.consume();
	}
    
}
