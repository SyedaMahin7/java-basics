package com.xworkz.soilder2.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.xworkz.soilder2.dto.SoilderDTO;
import com.xworkz.soilder2.reposotory.Repo;
@Component
public class ServiceImp implements Service{
	private Repo repo;
	@Autowired
	private Validator validator;
	
	
	public Repo getRepo() {
		return repo;
	}

	public void setRepo(Repo repo) {
		this.repo = repo;
	}

	public ServiceImp() {
		System.out.println("Service is crested");
	}
   
	public boolean validate(SoilderDTO dto) {
		System.out.println("Running validate and save method");
		System.out.println("dto"+ dto);
//		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
//		Validator validator=factory.getValidator();
		Set<ConstraintViolation<SoilderDTO>> violotion=this.validator
				.validate(dto);
		if(!violotion.isEmpty()) {
			System.out.println("some error is there");
			violotion.forEach(v->System.out.println("message"+v.getMessage()));
			return false;
		}
		
		else {
			System.out.println("data is wirite");
			boolean save1=repo.save(dto);
			System.out.println(save1);
			return true;
		
		}
	}

}
