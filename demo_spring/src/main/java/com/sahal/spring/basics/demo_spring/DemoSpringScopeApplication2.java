package com.sahal.spring.basics.demo_spring;

import javax.management.loading.PrivateClassLoader;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sahal.spring.basics.demo_spring.basic.BinarySearch;
import com.sahal.spring.basics.demo_spring.scope.PersonDao;

//import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class DemoSpringScopeApplication2 {
	
	private static Logger logger = LoggerFactory.getLogger(DemoSpringScopeApplication2.class);

	public static void main(String[] args) {
		
		//BinarySearch binarySearch = new BinarySearch(new QuickSortAlgo());
		
	 
		
		ApplicationContext applicationContext = SpringApplication.run(DemoSpringScopeApplication2.class, args);
		
		
		// ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoSpringApplication.class, args);
		PersonDao personDao = applicationContext.getBean(PersonDao.class);
		PersonDao personDao2 = applicationContext.getBean(PersonDao.class);

		//BinarySearch binarySearch1 = applicationContext.getBean(BinarySearch.class);
 
		logger.info("{}",personDao);
		logger.info("{}",personDao.getJdbcconnection());
		logger.info("{}",personDao.getJdbcconnection());

		
		logger.info("{}",personDao2);
		logger.info("{}",personDao2.getJdbcconnection());


		
		//System.out.println(personDao);
		//System.out.println(binarySearch1);
		
//		 int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
//		System.out.println(result);
		
		
	}

}
