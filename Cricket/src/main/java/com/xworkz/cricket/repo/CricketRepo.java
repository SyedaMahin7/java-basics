package com.xworkz.cricket.repo;

import java.util.Collections;
import java.util.List;

import com.xworkz.cricket.entity.CricketEntity;


public interface CricketRepo {
boolean save(CricketEntity entity);
	
	boolean update(CricketEntity entity);
	
	
	
	
	default CricketEntity deleteById(int id) {
		return null;
	}

	default CricketEntity findById(int id) {
		return null;
	}
	

	default List<CricketEntity> findByName(String name) {
		return Collections.emptyList();
	}

}
