package com.xworkz.soilder2.reposotory;

import org.springframework.stereotype.Component;

import com.xworkz.soilder2.dto.SoilderDTO;
@Component
public class RepoImp implements Repo {
	public RepoImp() {
		System.out.println("repoimp no arg is created");
	}
     
	@Override
	public boolean save(SoilderDTO dto) {
		System.out.println(" all dto is save");
		System.out.println("dto"+dto);
		return false;
	}

}
