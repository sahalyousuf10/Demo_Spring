package com.sahal.spring.basics.demo_spring.basic;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//import ch.qos.logback.classic.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	
//	
//	public BinarySearch(SortAlgorithm algorithm) {
//		super();
//		this.algorithm = algorithm;
//	}



	public int binarySearch(int[] numbers, int number){
		
		
		//bubble sort algorithm
		//tightly coupled
		
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		
		
		return 3;
		
	}
	
	//sorting an array
	// search the array
	//return the result
	
	@PostConstruct
	public void postConstruct() {
		
		logger.info("postConstruct");
		
	}
	
	@PreDestroy
	public void preDestroy() {
		
		logger.info("preDestroy");
		
	}

}
