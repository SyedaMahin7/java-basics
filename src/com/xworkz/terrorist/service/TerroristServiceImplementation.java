package com.xworkz.terrorist.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.xml.validation.Validator;

import com.xworkz.terrorist.Dto.TerroristDTO;

public class TerroristServiceImplementation implements TerroristService {

	@Override
	public boolean validateAndSave(TerroristDTO dto) {
		System.out.println("exsicuting validation ");
		System.out.println(" dto is passed "+ dto);
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		javax.validation.Validator validator=factory.getValidator();
		Set<ConstraintViolation<TerroristDTO>> violaations=validator.validate(dto);
		if(!violaations.isEmpty()) {
			System.out.println("error in the data");
			return false;
		}
		System.out.println("no errors ");
		return true;
		
	}

}
