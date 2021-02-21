package com.example.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface NumberRepository {

	public void increment();
	
	public int getNumber();
	
	public void addNumber(int number);
}
