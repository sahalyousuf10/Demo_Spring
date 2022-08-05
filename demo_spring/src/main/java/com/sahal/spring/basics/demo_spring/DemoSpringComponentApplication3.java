package com.sahal.spring.basics.demo_spring;

import javax.management.loading.PrivateClassLoader;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.sahal.spring.basics.componentscan.ComponentDao;
import com.sahal.spring.basics.demo_spring.basic.BinarySearch;
import com.sahal.spring.basics.demo_spring.scope.PersonDao;

//import ch.qos.logback.classic.Logger;

@SpringBootApplication
@ComponentScan("com.sahal.spring.basics.componentscan")
public class DemoSpringComponentApplication3 {
	
	private static Logger logger = LoggerFactory.getLogger(DemoSpringComponentApplication3.class);

	public static void main(String[] args) {
		
		//BinarySearch binarySearch = new BinarySearch(new QuickSortAlgo());
		
	 
		
		ApplicationContext applicationContext = SpringApplication.run(DemoSpringComponentApplication3.class, args);
		
		
		// ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoSpringApplication.class, args);
		ComponentDao componentDao = applicationContext.getBean(ComponentDao.class);
		//ComponentDao componentDao2 = applicationContext.getBean(ComponentDao.class);

		//BinarySearch binarySearch1 = applicationContext.getBean(BinarySearch.class);
 
		logger.info("{}",componentDao);
//		logger.info("{}",personDao.getJdbcconnection());
//		logger.info("{}",personDao.getJdbcconnection());
//
//		
//		logger.info("{}",personDao2);
//		logger.info("{}",personDao2.getJdbcconnection());


		
		//System.out.println(personDao);
		//System.out.println(binarySearch1);
		
//		 int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
//		System.out.println(result);
		
		
	}

}
