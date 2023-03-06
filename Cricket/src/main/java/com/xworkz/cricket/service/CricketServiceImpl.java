package com.xworkz.cricket.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.Validator;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.cricket.dto.CricketDTO;
import com.xworkz.cricket.entity.CricketEntity;
import com.xworkz.cricket.repo.CricketRepo;

@Service
public class CricketServiceImpl implements CricketService {
	@Autowired
	private CricketRepo repo;
	public CricketServiceImpl() {
		System.out.println("Create:" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<CricketDTO>> validateAndSave(CricketDTO dto) {
		System.out.println("Running validateAndSave in service:" + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<CricketDTO>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.out.println("Violation in  the dto:" +dto);
			return violations;
		} else {
			System.out.println("There is no violation in dto save in controller:" + dto);

			CricketEntity entity = new CricketEntity();
			BeanUtils.copyProperties(dto,entity);
			

			boolean saved = this.repo.save(entity);
			System.out.println("Saved:" + saved);
			return Collections.emptySet();
		}
	}

	@Override
	public Set<ConstraintViolation<CricketDTO>> validateAndUpdate(CricketDTO dto) {
		System.out.println("Running validateAndUpdate in service:" + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		javax.validation.Validator validator = factory.getValidator();
		Set<ConstraintViolation<CricketDTO>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.out.println("Violation in dto:" + dto);
			return violations;
		} else {
			System.out.println("There is no violation in dto save in controller:" + dto);

			CricketEntity entity = new CricketEntity();
			BeanUtils.copyProperties(dto,entity);

			boolean saved = this.repo.update(entity);
			System.out.println("Saved  update in service:" + saved);
			return Collections.emptySet();

		}
	}
	@Override
	public CricketDTO findById(int id) {
		System.out.println("Running find by id in service: " + id);
		if (id > 0) {
			CricketEntity entity = this.repo.findById(id);

			if (entity != null) {
				System.out.println("the entity is good convert value into dto");

				CricketDTO dto = new CricketDTO();
				BeanUtils.copyProperties(entity,dto);
				return dto;
			}

		}
		return CricketService.super.findById(id);
	}
	@Override
	public List<CricketDTO> findByName(String name) {
		System.out.println("Running findByName in service:" + name);

		if (name != null && !name.isEmpty()) {
			List<CricketEntity> entityy = this.repo.findByName(name);

			List<CricketDTO> listDto = new ArrayList<CricketDTO>();

			for (CricketEntity entity : entityy) {

				CricketDTO dto = new CricketDTO();
				BeanUtils.copyProperties(entity,dto);
				listDto.add(dto);
				
				System.out.println("Size of dtos:" + listDto.size());
				System.out.println("Size of entitys:" + entityy.size());
				return listDto;

			}

		} else {
			System.out.println("Invalid name");
		}
		return CricketService.super.findByName(name);
	}
	@Override
	public CricketDTO deleteById(int id) {
		System.out.println("Running delete by id in service:"+id);
		if(id>0) {
			CricketEntity entity=this.repo.deleteById(id);
		}
		return CricketService.super.deleteById(id);
	}

}
