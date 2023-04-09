package com.learning.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		BinarySearchImpl  binarySearchImpl= applicationContext.getBean(BinarySearchImpl.class);
		
		int result = binarySearchImpl.binarySearch(new int[] {10,5,6,8,11}, 8);
		
		System.out.println(result);
	}

}
