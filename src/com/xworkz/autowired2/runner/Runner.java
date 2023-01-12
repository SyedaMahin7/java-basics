package com.xworkz.autowired2.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired2.bean.Engine;
import com.xworkz.autowired2.bean.Ghost;
import com.xworkz.autowired2.bean.Snake;
import com.xworkz.autowired2.bean.newsPaper;
import com.xworkz.autowired2.configuration.SpringCoonfiguration;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext contener= new AnnotationConfigApplicationContext(SpringCoonfiguration.class);
		String[] ref=contener.getBeanDefinitionNames();
		int ref1=contener.getBeanDefinitionCount();
		System.out.println(ref1);
		System.out.println(Arrays.toString(ref));
		
		newsPaper n=contener.getBean(newsPaper.class);
		System.out.println(n);
		
		
		Engine e=contener.getBean(Engine.class);
		System.out.println(e);
		
		Snake s=contener.getBean(Snake.class);
		System.out.println(s);
		Ghost g=contener.getBean(Ghost.class);
		System.out.println(g);
		

	}

}
