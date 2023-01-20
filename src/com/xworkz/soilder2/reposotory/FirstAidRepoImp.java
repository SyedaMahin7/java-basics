package com.xworkz.soilder2.reposotory;

import org.springframework.stereotype.Component;

import com.xworkz.soilder2.dto.FirstAidDTO;
@Component
public class FirstAidRepoImp implements FirstAidRepo{

	@Override
	public boolean save(FirstAidDTO dto) {
		System.out.println("all the dto is save");
		System.out.println("dto"+dto);
		return false;
	}

}
