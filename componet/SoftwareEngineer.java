package com.xworkz.SpringBean.componet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class SoftwareEngineer {
	@Autowired
	@Qualifier("name1")
	private String name;
	@Autowired
	@Qualifier("verstion")
	private double version;
	@Autowired
	@Qualifier("developerName")
	private String developername;
	@Autowired
	@Qualifier("free")
	private boolean free;
	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", version=" + version + ", developername=" + developername
				+ ", free=" + free + "]";
	}
	
	
}
