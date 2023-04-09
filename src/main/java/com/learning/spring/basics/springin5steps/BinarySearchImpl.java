package com.learning.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	SortAlogrithm sortAlogrithm;
	
	
	
	public BinarySearchImpl(SortAlogrithm sortAlogrithm) {
		super();
		this.sortAlogrithm = sortAlogrithm;
	}

	public int binarySearch(int[] numbers, int numberToSearch ) {
		
//		Implementing sorting logic
		int[] sortedNumbers = sortAlogrithm.sort(numbers);
		System.out.println(sortedNumbers);
		System.out.println(sortAlogrithm);
//		Search the array
//		returning the result
		
		return 3;
	}

}
