package com.xworkz.dependenci.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Disel implements Fuel {
   
	@Override
	public void consume() {
		System.out.println(" consume in the disel method");
		
	}
	

}
