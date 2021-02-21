package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.NumberRepository;

@Component
public class NumberServiceImpl implements NumberService {

	@Autowired
	private NumberRepository numberRepo;
	
	@Override
	public void incrementNumber() {
		numberRepo.increment();
	}

	@Override
	public void add(int number) {
		numberRepo.addNumber(number);
	}

	@Override
	public int getNumber() {
		return numberRepo.getNumber();
	}
}

