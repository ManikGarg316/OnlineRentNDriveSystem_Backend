package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.model.Car;
import com.app.repo.CarRepository;
import com.app.service.CarService;
import com.app.util.Fuel;
import com.app.util.Transmission;

public class CarServiceImpl implements CarService{
	@Autowired
	private CarRepository repo;

	@Override
	public String addCar(Car cab) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> getAllCars() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Car> findByCarNumber(String carNumber) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public String deleteCar(String carNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> filterByFuelType(Fuel fuel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> filterBySeats(Integer numOfSeats) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> filterByTransmission(Transmission type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> filterByTransmissionAndFuel(Transmission type, Fuel fuel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> filterByTransmissionAndSeats(Transmission type, Integer numOfSeats) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> filterBySeatsAndFuel(Integer numOfSeats, Fuel fuel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> filterByTransmissionAndFuelAndSeats(Transmission type, Fuel fuel, Integer numOfSeats) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
