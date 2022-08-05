package com.sahal.spring.basics.demo_spring;

import javax.management.loading.PrivateClassLoader;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sahal.spring.basics.demo_spring.basic.BinarySearch;
import com.sahal.spring.basics.demo_spring.cdi.SomeCDIBusiness;
import com.sahal.spring.basics.demo_spring.scope.PersonDao;

//import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class DemoSpringCdiApplication {
	
	private static Logger logger = LoggerFactory.getLogger(DemoSpringCdiApplication.class);

	public static void main(String[] args) {
		
		//BinarySearch binarySearch = new BinarySearch(new QuickSortAlgo());
		
	 
		
		ApplicationContext applicationContext = SpringApplication.run(DemoSpringCdiApplication.class, args);
		
		
		SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);

 
		logger.info("{} dao-{}",business, business.ge);



		
		//System.out.println(personDao);
		//System.out.println(binarySearch1);
		
//		 int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
//		System.out.println(result);
		
		
	}

}
