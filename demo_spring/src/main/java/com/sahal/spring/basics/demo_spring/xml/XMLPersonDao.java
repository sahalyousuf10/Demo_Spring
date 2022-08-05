package com.sahal.spring.basics.demo_spring.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class XMLPersonDao {
	
	
    XMLJdbcConnection xmlJdbcConnection;

	public XMLJdbcConnection getXMLJdbcConnection() {
		return xmlJdbcConnection;
	}

	public void setXMLJdbcconnection(XMLJdbcConnection jdbcconnection) {
		this.xmlJdbcConnection = jdbcconnection;
	}
	

}
