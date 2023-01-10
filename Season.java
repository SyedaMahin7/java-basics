package com.xworkz.SpringBean.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	private String name;
	private int duration;
	private String startingMount;
	public String getName() {
		return name;
	}
	@Value("Winter")
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	@Value("3")
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public String getStartingMount() {
		return startingMount;
	}
	@Value("Dcecemmber")
	public void setStartingMount(String startingMount) {
		this.startingMount = startingMount;
	}
	
	
	

}
