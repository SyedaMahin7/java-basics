package com.xworkz.dependenci.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.dependenci.bean.Chrome;
import com.xworkz.dependenci.bean.FireBox;
import com.xworkz.dependenci.bean.PetrolBunk;
import com.xworkz.dependenci.configuration.SpringConfiguration;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext container =new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		PetrolBunk bunk=container.getBean(PetrolBunk.class);
		bunk.purchase();
		
		FireBox f=container.getBean("fireBox",FireBox.class);
		f.broese();
		Chrome f2=container.getBean("chrome",Chrome.class);
		f2.broese();
		
	}

}
