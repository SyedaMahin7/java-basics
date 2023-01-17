package com.xworkz.terrorist.Dto;

import java.time.LocalDateTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class TerroristDTO extends AbstractAudicDTO{
	@NotNull(message="name cannot be null")
	@NotEmpty(message="name cannot be empty")
	@Size(max=30,min=3,message="name shoud be less than 30")
	private String name;
	@Max(value=40,message="age shoud be less than 40")
	@Min(value=35,message="age is grater than 35")
	 private int age;
	private boolean alive;
	private boolean prison;
	@NotNull(message="Specilization cannot be null")
	@NotEmpty(message="Specilization cannot be empty")
	@Size(max=30,min=3,message="Specilizationn shoud be less than 30")
	private String Specilization;
	@NotNull(message="organization cannot be null")
	@NotEmpty(message="organization cannot be empty")
	@Size(max=30,min=3,message="organization shoud be less than 30")
	private String organization;
	

}
