package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.repo.CarRepository;

public class CarServiceImpl {
	@Autowired
	private CarRepository repo;
}
