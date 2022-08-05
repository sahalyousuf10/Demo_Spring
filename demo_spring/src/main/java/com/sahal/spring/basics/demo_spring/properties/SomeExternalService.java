package com.sahal.spring.basics.demo_spring.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {
	
	@Value("${external.service.url}")
	private String url;
	
	public String returnServiceUrl() {
		
		return url;
	}

}
