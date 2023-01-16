package com.xworkz.dependenci.bean;

import org.springframework.stereotype.Component;

@Component
public class FireBox implements Browser {

	@Override
	public void broese() {
	System.out.println("browser method is calle in firebox");
		
	}

}
