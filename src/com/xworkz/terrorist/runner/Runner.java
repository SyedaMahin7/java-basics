package com.xworkz.terrorist.runner;

import com.xworkz.terrorist.Dto.TerroristDTO;
import com.xworkz.terrorist.service.TerroristServiceImplementation;

public class Runner {

	public static void main(String[] args) {
		TerroristDTO  dto= new TerroristDTO(); 
        dto.setAge(40);
        dto.setName("syeda");
        TerroristServiceImplementation imp=new TerroristServiceImplementation();
        imp.validateAndSave(dto);
	}

}
