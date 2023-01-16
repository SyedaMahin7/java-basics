package com.xworkz.dependenci.bean;

import org.springframework.stereotype.Component;

@Component
public class Airtel  implements Provider{

	@Override
	public void connet() {
		System.out.println( "connet is called in Airtel");
	}

}
