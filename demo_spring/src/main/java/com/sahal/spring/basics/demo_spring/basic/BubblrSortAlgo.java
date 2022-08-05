package com.sahal.spring.basics.demo_spring.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BubblrSortAlgo implements SortAlgorithm{
	
	public int[] sort(int[] numbers) {
		
		//logic bubble sort
		return numbers;
		
	}

}
