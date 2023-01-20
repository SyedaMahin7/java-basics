package com.xworkz.soilder2.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

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
public abstract class AbstractFirstAid implements Serializable {
	private String createdby;
	private LocalDateTime createdon;
	private String updatedby;
	private LocalDateTime updatedon;


}
