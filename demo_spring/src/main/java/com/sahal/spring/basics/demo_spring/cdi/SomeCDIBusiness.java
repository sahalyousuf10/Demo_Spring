package com.sahal.spring.basics.demo_spring.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

@Named
public class SomeCDIBusiness {
	
	@Inject
	SomeCDIDao someCDIDao;

	public SomeCDIDao getSomeCDIDao() {
		return someCDIDao;
	}
 	public void setSomeCDIDao(SomeCDIDao someCDIDao) {
		this.someCDIDao = someCDIDao;
	}

}
