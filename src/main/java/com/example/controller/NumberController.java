package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.NumberService;

@RestController
@RequestMapping("/number")
public class NumberController {
	
	@Autowired
	private NumberService numberService;
	
	@PutMapping(path="/increment")
	public void incrementNumber() {
		numberService.incrementNumber();
	}
	
	@PostMapping(path="/{number}")
	public void add(@PathVariable("number") int number) {
		numberService.add(number);
	}
	
	@GetMapping(path="")
	public int getNumber() {
		return numberService.getNumber();
	}

}
