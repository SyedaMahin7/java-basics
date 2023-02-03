package com.xworkz.goa.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class GoaWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println(" get root Config Clasees is running ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("get SrvletConfiguration is running");
		
		return new Class[] {GoaSpringConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println(" getServletApping is called");
		return new String[] {"/"};
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	System.out.println("Configure ServletHandling is called");	
	configurer.enable();
	}

}
