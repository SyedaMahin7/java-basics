package com.xworkz.terrorist.Dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractAudicDTO implements Serializable{
	private String createdBy;
	private LocalDateTime CreatedAt;
	private String updatedBy;
	private LocalDateTime updatedAt;
	

}
