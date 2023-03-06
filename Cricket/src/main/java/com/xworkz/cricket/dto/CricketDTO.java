package com.xworkz.cricket.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CricketDTO {
	private int id;
	@NotBlank(message="name connot be blank")
	@Size(min =1, max = 30, message = "players Name should be more than 5 or less than 30 characters")
	private String name;
	@NotBlank(message="countru connot be blank")
	@Size(min =1, max = 30, message = "country Name should be more than 5 or less than 30 characters")
	private  String country ;
	@NotBlank(message="iplteam connot be blank")
	@Size(min =1, max = 30, message = "iplteam Name should be more than 5 or less than 30 characters")
	private  String iplteam ;
	@NotNull(message="runs connot be null")
	@Min(value = 1, message = "runs cannot be less than zero")
	private  Integer runs ;
	@NotNull(message="since connot be null")
	@Min(value = 1, message = "Since cannot be less than zero")
	private  Integer since ;
	
	
	
	

}
