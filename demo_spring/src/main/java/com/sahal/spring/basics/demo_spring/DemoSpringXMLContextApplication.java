package com.sahal.spring.basics.demo_spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sahal.spring.basics.demo_spring.basic.BinarySearch;
import com.sahal.spring.basics.demo_spring.xml.XMLPersonDao;


public class DemoSpringXMLContextApplication {
	
	private static Logger logger = LoggerFactory.getLogger(DemoSpringScopeApplication2.class);

	public static void main(String[] args) {

		// BinarySearch bi narySearch = new BinarySearch(new QuickSortAlgo());

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml"); // SpringApplication.run(DemoSpringApplication.class, args);
		) {
			// ConfigurableApplicationContext applicationContext =
			// SpringApplication.run(DemoSpringApplication.class, args);
			
			logger.info("Beans Loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());
			XMLPersonDao personDao = applicationContext.getBean(XMLPersonDao.class);

			logger.info("{} {}", personDao, personDao.getXMLJdbcConnection());


//			int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
//			System.out.println(result);

			// annotationConfigApplicationContext.close();
		}

	}

}
