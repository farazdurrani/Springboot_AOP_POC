package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.sampleone.SpringBeanInPackageOne;
import com.example.demo.sampleone.subpackage.AnotherSpringBean;
import com.example.demo.sampletwo.SpringBeanInPackageTwo;

@SpringBootApplication
public class SpringAopPocApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAopPocApplication.class, args);
	}

	@Autowired
	private SpringBeanInPackageOne springBeanInPackageOne;
	@Autowired
	private SpringBeanInPackageTwo springBeanInPackageTwo;
	
	@Autowired
	private AnotherSpringBean anotherSpringBean;

	@Override
	public void run(String... args) throws Exception {
		
		springBeanInPackageOne.methodInsideSpringBeanInPackageOne("Five");
		
		springBeanInPackageTwo.methodInsideSpringBeanInPackageTwo("Six");
		
		anotherSpringBean.anotherMethod("a", "b", "c");

	}

}
