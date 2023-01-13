package com.xworkz.movies.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMan {
	@Autowired
	private Camera camera;
	
	public CameraMan() {
		System.out.println("cameraman is created bi using spring ");
	}

}
