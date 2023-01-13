package com.xworkz.movies.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	@Autowired
	private Lens lens;
	@Autowired
	private Battery battery;

	public Camera() {
		System.out.println("camera constructor is created");
	}

}
