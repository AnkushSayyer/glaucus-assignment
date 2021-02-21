package com.example.service;

import org.springframework.stereotype.Service;

@Service
public interface NumberService {
	
	public void incrementNumber();
	
	public void add(int number);
	
	public int getNumber();
}
