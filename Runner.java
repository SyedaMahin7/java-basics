package com.xworkz.SpringBean.Bean;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.SpringBean.SpringConfiguration;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext ref=new AnnotationConfigApplicationContext(SpringCongiguration1.class);
		System.out.println(Arrays.toString(ref.getBeanDefinitionNames()));
		Rocket refRocket=ref.getBean("rocket",Rocket.class);
		System.out.println(refRocket);
	    System.out.println(	refRocket.getCountry());
	    System.out.println(refRocket.getName());
	    System.out.println(refRocket.getBudget());
	   
	    Rocket refRocket2=ref.getBean("rocket1",Rocket.class);
	    System.out.println(refRocket2);
	    System.out.println(	refRocket2.getCountry());
	    System.out.println(refRocket2.getName());
	    System.out.println(refRocket2.getBudget());
	    
	    
	    Actor ac=ref.getBean("actor",Actor.class);
	    System.out.println(ac);
	    System.out.println(ac.getName());
	    System.out.println(ac.getAge());
	    System.out.println(ac.getLang());
	    
	    Actor ac1=ref.getBean("actor1",Actor.class);
	    System.out.println(ac1);
	    System.out.println(ac1.getName());
	    System.out.println(ac1.getAge());
	    System.out.println(ac1.getLang());
	    
	    
	    Season s= ref.getBean("season",Season.class);
	    System.out.println(s);
	    System.out.println(s.getDuration());
	    System.out.println(s.getName());
	    System.out.println(s.getStartingMount());
	    
	    Season s1= ref.getBean("summer",Season.class);
	    System.out.println(s1);
	    System.out.println(s1.getDuration());
	    System.out.println(s1.getName());
	    System.out.println(s1.getStartingMount());
	    
	    
	}

}
