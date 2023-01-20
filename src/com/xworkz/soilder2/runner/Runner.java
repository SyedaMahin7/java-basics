package com.xworkz.soilder2.runner;

import com.xworkz.soilder2.dto.SoilderDTO;
import com.xworkz.soilder2.reposotory.RepoImp;
import com.xworkz.soilder2.service.ServiceImp;

public class Runner {

	public static void main(String[] args) {
		SoilderDTO s=new SoilderDTO();
		s.setCountry("India");
		s.setName("Syeda mahin");
		s.setRank("first");
		s.setBatallian("ghh");
		s.setId(20);
		ServiceImp i=new ServiceImp();
		RepoImp r=new RepoImp();
		i.validate(s);
		i.setRepo(r);

	}

}
