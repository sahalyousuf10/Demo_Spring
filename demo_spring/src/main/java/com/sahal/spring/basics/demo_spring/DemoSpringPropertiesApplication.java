package com.sahal.spring.basics.demo_spring;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.sahal.spring.basics.demo_spring.basic.BinarySearch;
import com.sahal.spring.basics.demo_spring.properties.SomeExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class DemoSpringPropertiesApplication {

	public static void main(String[] args) {
		
		//BinarySearch binarySearch = new BinarySearch(new QuickSortAlgo());
		
		
		try(		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(DemoSpringPropertiesApplication.class);  //SpringApplication.run(DemoSpringApplication.class, args);
){
			// ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoSpringApplication.class, args);
			SomeExternalService service = annotationConfigApplicationContext.getBean(SomeExternalService.class);

			
			System.out.println(service.returnServiceUrl());
			
			//annotationConfigApplicationContext.close();
		}
		

	}

}
