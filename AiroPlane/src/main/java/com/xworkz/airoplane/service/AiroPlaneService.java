package com.xworkz.airoplane.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.airoplane.dto.AiroPlaneDTO;

public interface AiroPlaneService {
	Set<ConstraintViolation<AiroPlaneDTO>> validateAndSave(AiroPlaneDTO dto);

	default AiroPlaneDTO findById(int id) {
		return null;
	}
	
	
	

	}



