package com.xworkz.SpringBean.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.SpringBean.componet.HardwareStore;
import com.xworkz.SpringBean.componet.Pen;
import com.xworkz.SpringBean.componet.Pencil;
import com.xworkz.SpringBean.componet.Rubber;
import com.xworkz.SpringBean.componet.SoftwareEngineer;
import com.xworkz.SpringBean.configguration.SpringCongiguration2;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext ref=new AnnotationConfigApplicationContext(SpringCongiguration2.class);
		String[] bean=ref.getBeanDefinitionNames();
		System.out.println(Arrays.toString(bean));
		HardwareStore s=ref.getBean(HardwareStore.class);
		System.out.println(s);

		SoftwareEngineer sof=ref.getBean(SoftwareEngineer.class);
		System.out.println(sof);
		Pencil p=ref.getBean(Pencil.class);
		System.out.println(p);
		Rubber r=ref.getBean(Rubber.class);
		System.out.println(r);
		Pen p1=ref.getBean(Pen.class);
		System.out.println(p1);
	}

}
