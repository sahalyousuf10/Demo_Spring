package com.sahal.spring.basics.demo_spring.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {
	
	@Autowired
    JdbcConnection jdbcconnection;

	public JdbcConnection getJdbcconnection() {
		return jdbcconnection;
	}

	public void setJdbcconnection(JdbcConnection jdbcconnection) {
		this.jdbcconnection = jdbcconnection;
	}
	

}
