package com.xworkz.airoplane.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.xml.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.airoplane.dto.AiroPlaneDTO;
import com.xworkz.airoplane.entity.AiroPlaneEntity;
import com.xworkz.airoplane.repo.AiroPlaneRepo;
@Service
public class AiroPlaneServiceImp implements AiroPlaneService{
	@Autowired
	private AiroPlaneRepo aeroplaneRepository;

	public AiroPlaneServiceImp() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	@Override
	public Set<ConstraintViolation<AiroPlaneDTO>> validateAndSave(AiroPlaneDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		javax.validation.Validator validator = factory.getValidator();
		Set<ConstraintViolation<AiroPlaneDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in dto " + dto);
			return violations;
		} else {
			System.out.println("Violations is not there in dto,can save");
			AiroPlaneEntity entity = new AiroPlaneEntity();
			entity.setCompany(dto.getCompany());
			entity.setName(dto.getName());
			entity.setCost(dto.getCost());
			entity.setType(dto.getType());
			entity.setCountry(dto.getCountry());
			boolean saved = this.aeroplaneRepository.save(entity);
			System.out.println("Entity data is saved " + saved);
			return Collections.emptySet();
		}
	}

	@Override
	public AiroPlaneDTO findById(int id) {
		if (id > 0) {
			AiroPlaneEntity entity = this.aeroplaneRepository.findById(id);
			if (entity != null) {
				System.out.println("Entity is found in service for id " + id);
				AiroPlaneDTO dto = new AiroPlaneDTO();
				dto.setCompany(entity.getCompany());
				dto.setName(entity.getName());
				dto.setCost(entity.getCost());
				dto.setType(entity.getType());
				dto.setCountry(entity.getCountry());
				dto.setId(entity.getId());
				return dto;
			}
		}
		return AiroPlaneService.super.findById(id);
	}
	}


