package com.sahal.spring.basics.demo_spring.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSortAlgo implements SortAlgorithm{
	
	public int[] sort(int[] numbers) {
		
		//logic quick sort
		return numbers;

}
}
