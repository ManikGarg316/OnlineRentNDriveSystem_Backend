package com.app.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Car;
import com.app.util.Fuel;
import com.app.util.Transmission;

public interface CarRepository extends JpaRepository<Car, String>{
	public String addCar(Car cab);
	public List<Car> getAllCars();
	public Optional<Car> findByCarNumber(String carNumber);
	public String deleteCar(String carNumber);
	public List<Car> filterByFuelType(Fuel fuel);
	public List<Car> filterBySeats(Integer numOfSeats);
	public List<Car> filterByTransmission(Transmission type);
	public List<Car> filterByTransmissionAndFuel(Transmission type, Fuel fuel);
	public List<Car> filterByTransmissionAndSeats(Transmission type, Integer numOfSeats);
	public List<Car> filterBySeatsAndFuel(Integer numOfSeats, Fuel fuel);
	public List<Car> filterByTransmissionAndFuelAndSeats(Transmission type, Fuel fuel, Integer numOfSeats);
}
