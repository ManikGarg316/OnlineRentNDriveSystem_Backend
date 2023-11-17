package com.app.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Car;
import com.app.util.Fuel;
import com.app.util.Transmission;

public interface CarRepository extends JpaRepository<Car, String>{
	List<Car> findAll();
	Optional<Car> findById(String carNumber);
	void deleteById(String carNumber);
	List<Car> findByFuel(Fuel fuel);
	List<Car> findBySeats(Integer numOfSeats);
	List<Car> findByTransmission(Transmission type);
	List<Car> findByTransmissionAndFuel(Transmission type, Fuel fuel);
	List<Car> findByTransmissionAndSeats(Transmission type, Integer numOfSeats);
	List<Car> findBySeatsAndFuel(Integer numOfSeats, Fuel fuel);
	List<Car> findByTransmissionAndFuelAndSeats(Transmission type, Fuel fuel, Integer numOfSeats);
}
