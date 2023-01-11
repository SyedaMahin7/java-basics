package com.xworkz.SpringBean.configguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.xworkz.SpringBean.componet")
public class SpringCongiguration2 {
	@Bean
	public int id() {
		System.out.println("rigidtering with id");
		return 2341;
		
	}
	@Bean
	public String name() {
		return "mahin";
	}
	@Bean
	public int gst() {
	return 2305;
      }
	@Bean
	 public String ownername() {
		return "mahinSyeda";
	}
	@Bean
	public String address() {
		return "hospet";
     }
	@Bean
	public String name1() {
		return "abx";
		
	}
	@Bean
	public double verstion() {
		return 203.2;
		
	}
	@Bean
	public String developerName() {
		return "mahi";
		
	}
	@Bean
	public boolean free() {
		return true;
		
	}
	@Bean
	public String name3() {
		return "apsara";
		
	}
	@Bean
	public String type() {
		return "pencil";
	}
	@Bean
	public int price() {
		return 4;
	}
	@Bean
	public String color() {
		return "black";
	}
	@Bean
	public boolean sharp() {
		return false;
	}
	@Bean
	public boolean stolean() {
		return true;
		
	}

	@Bean
	public String name4() {
		return "apsara";
		
	}
	@Bean
	public String type1() {
		return "pencil";
	}
	@Bean
	public int price1() {
		return 4;
	}
	@Bean
	public String color1() {
		return "black";
	}
	@Bean
	public boolean sharp1() {
		return false;
	}
	@Bean
	public boolean stolean1() {
		return true;
		
	}
	@Bean
	public String name5() {
		return "apsara";
		
	}
	@Bean
	public String type2() {
		return "pencil";
	}
	@Bean
	public int price2() {
		return 4;
	}
	@Bean
	public String color2() {
		return "black";
	}
	@Bean
	public boolean sharp2() {
		return false;
	}
	@Bean
	public boolean stolean2() {
		return true;
		
	}
	
	
	
	
	

}
