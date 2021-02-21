package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class NumberRepositoryImpl implements NumberRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public synchronized void increment() {
		jdbcTemplate.update("update Number n set n.number = n.number+1");
	}

	@Override
	public int getNumber() {
		return jdbcTemplate.queryForObject(
			    "SELECT number FROM Number", Integer.class);	
	}

	@Override
	public void addNumber(int number) {
		jdbcTemplate.update("INSERT INTO Number (number) VALUES (?)", number);
    }
		
}
	
