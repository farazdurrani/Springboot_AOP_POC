package com.example.demo.sampleone;

import org.springframework.stereotype.Component;

@Component
public class SpringBeanInPackageOne {
	public String methodInsideSpringBeanInPackageOne(String s) {
		return s;
	}
}
