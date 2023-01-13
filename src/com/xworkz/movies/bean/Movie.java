package com.xworkz.movies.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	@Autowired
	private Director director;
	@Autowired
	private CameraMan cameraman;
	@Autowired
	private Producer producer;
	public Movie()
	{
		System.out.println("movie is created");
	}
	
	@Override
	public String toString() {
		return "Movie [director=" + director + ", cameraman=" + cameraman + ", producer=" + producer + "]";
	}

	public void display() {
		System.out.println(this.cameraman);
		
	}
}
