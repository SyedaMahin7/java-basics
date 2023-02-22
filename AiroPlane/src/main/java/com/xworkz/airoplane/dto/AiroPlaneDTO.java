package com.xworkz.airoplane.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
public class AiroPlaneDTO {
	private int id;
	@NotBlank(message = "Company cannot be null")
	@Size(min = 5, max = 30, message = "Name should be more than 5 or less than 30 characters")
	private String company;
	@NotBlank(message = "Name cannot be null")
	@Size(min = 4, max = 14, message = "Name should be more than 4 or less than 14 characters")
	private String name;
	@Min(value = 1, message = "Cost cannot be less than zero")
	private int cost;
	@NotBlank(message = "Type should be selected")
	private String type;
	@NotBlank(message = "Country should be selected")
	private String country;

}
