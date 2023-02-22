package com.xworkz.airoplane.repo;

import com.xworkz.airoplane.entity.AiroPlaneEntity;

public interface AiroPlaneRepo {
	boolean save(AiroPlaneEntity entity);

	AiroPlaneEntity findById(int id);

}
