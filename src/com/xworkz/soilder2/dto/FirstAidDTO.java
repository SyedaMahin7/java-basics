package com.xworkz.soilder2.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FirstAidDTO extends AbstractFirstAid{
	@NotNull(message="name shoild bee not null")
	@Size(max=40,min=1)
	private String name;

}
