package com.xworkz.cricket.service;

import java.util.Collections;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.cricket.dto.CricketDTO;

public interface CricketService {
	Set<ConstraintViolation<CricketDTO>> validateAndSave(CricketDTO dto);

	Set<ConstraintViolation<CricketDTO>> validateAndUpdate(CricketDTO dto);

	default CricketDTO deleteById(int id) {
		return null;
	}

	default CricketDTO findById(int id) {
		return null;
	}

	default List<CricketDTO> findByName(String name) {
		return Collections.emptyList();
	}

}
