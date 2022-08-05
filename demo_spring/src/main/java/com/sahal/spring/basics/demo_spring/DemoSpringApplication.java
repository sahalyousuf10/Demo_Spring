package com.sahal.spring.basics.demo_spring;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sahal.spring.basics.demo_spring.basic.BinarySearch;

@Configuration
@ComponentScan("com.sahal.spring.basics.demo_spring")
public class DemoSpringApplication {

	public static void main(String[] args) {
		
		//BinarySearch binarySearch = new BinarySearch(new QuickSortAlgo());
		
		
		try(		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(DemoSpringApplication.class);  //SpringApplication.run(DemoSpringApplication.class, args);
){
			// ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoSpringApplication.class, args);
			BinarySearch binarySearch = annotationConfigApplicationContext.getBean(BinarySearch.class);
			BinarySearch binarySearch1 = annotationConfigApplicationContext.getBean(BinarySearch.class);
	 
			System.out.println(binarySearch);
			System.out.println(binarySearch1);
			
			 int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
			System.out.println(result);
			
			//annotationConfigApplicationContext.close();
		}
		

	}

}
