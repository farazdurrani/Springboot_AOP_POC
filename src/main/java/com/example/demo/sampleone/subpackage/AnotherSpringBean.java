package com.example.demo.sampleone.subpackage;

import org.springframework.stereotype.Component;

@Component
public class AnotherSpringBean {
	public String anotherMethod(String one, String two, String three) {
		return one + two + three;
	}
}
