package com.xworkz.dependenci.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser {
	@Autowired
	@Qualifier("jio")
   private Provider p;
	
	@Override
	public void broese() {
		System.out.println("browse method is called");
		p.connet();	
	}

}
