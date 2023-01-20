package com.xworkz.soilder2.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.xml.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soilder2.dto.FirstAidDTO;
import com.xworkz.soilder2.reposotory.FirstAidRepo;

import lombok.NoArgsConstructor;
@NoArgsConstructor
@Component
public class FirstAidServiceImp implements FirstAidService {
private FirstAidRepo repo;
@Autowired
private Validator validator;
@Autowired
public FirstAidServiceImp(FirstAidRepo repo) {
	super();
	this.repo = repo;
	System.out.println("createdd"+this.getClass().getSimpleName());
}


	@Override
	public boolean validateAndSave(FirstAidDTO dto) {
		System.out.println("running validate and save method");
		System.out.println("dto"+dto);
		
		Set<ConstraintViolation<FirstAidDTO>> vilolation=validator.validate(dto);
		if(!vilolation.isEmpty()) {
			System.out.println(" dto is invalid");
			return false;
		}
		else {
			System.out.println("dto is valid");
			boolean saved=repo.save(dto);
			System.out.println(saved);
			return saved;
		}
		
	}

	

}
