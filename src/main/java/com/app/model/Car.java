package com.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.app.util.Fuel;
import com.app.util.Transmission;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



public class Car {
	
	private String carNumber;
	private String model;
	private String make;
	private Integer ratePerDay;
	private Integer seats;
	private Integer pincode;
	private String city;
	private Float mileage;
	private Transmission type;
	private List<String> images;
	private List<String> securityPapers;
	private User user;
	private Fuel fuelType;
	
	
	public Car(String carNumber, String model, String make, Integer ratePerDay, Integer seats, Integer pincode,
			String city, Float mileage, Transmission type, List<String> images, List<String> securityPapers, User user,
			Fuel fuelType) {
		super();
		this.carNumber = carNumber;
		this.model = model;
		this.make = make;
		this.ratePerDay = ratePerDay;
		this.seats = seats;
		this.pincode = pincode;
		this.city = city;
		this.mileage = mileage;
		this.type = type;
		this.images = images;
		this.securityPapers = securityPapers;
		this.user = user;
		this.fuelType = fuelType;
	}

	
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public Integer getRatePerDay() {
		return ratePerDay;
	}
	public void setRatePerDay(Integer ratePerDay) {
		this.ratePerDay = ratePerDay;
	}
	public Integer getSeats() {
		return seats;
	}
	public void setSeats(Integer seats) {
		this.seats = seats;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Float getMileage() {
		return mileage;
	}
	public void setMileage(Float mileage) {
		this.mileage = mileage;
	}
	public Transmission getType() {
		return type;
	}
	public void setType(Transmission type) {
		this.type = type;
	}
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Fuel getFuelType() {
		return fuelType;
	}

	public void setFuelType(Fuel fuelType) {
		this.fuelType = fuelType;
	}
	
	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", model=" + model + ", make=" + make + ", ratePerDay=" + ratePerDay
				+ ", seats=" + seats + ", pincode=" + pincode + ", city=" + city + ", mileage=" + mileage + ", type="
				+ type + ", images=" + images + ", securityPapers=" + securityPapers + ", user=" + user + ", fuelType="
				+ fuelType + "]";
	}

	public List<String> getSecurityPapers() {
		return securityPapers;
	}
	public void setSecurityPapers(List<String> securityPapers) {
		this.securityPapers = securityPapers;
	}
}

