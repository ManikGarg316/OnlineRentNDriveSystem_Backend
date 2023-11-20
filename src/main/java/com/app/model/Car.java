package com.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.app.util.Fuel;
import com.app.util.Transmission;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.Entity;

@Entity
@Table(name = "Cars")
public class Car {
	
	@Id
	@Column(name = "car_number")
	private String carNumber;
	
	@Column(name = "car_model")
	private String model;
	
	@Column(name = "car_make")
	private String make;
	
	@Column(name = "rate_per_day")
	private Integer ratePerDay;
	
	@Column(name = "num_of_seats")
	private Integer seats;
	
	@Column(name = "pincode")
	private Integer pincode;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "mileage")
	private Float mileage;
	
	@Column(name = "transmission")
	private Transmission type;
	
//	@ElementCollection(fetch = FetchType.EAGER)
//	@CollectionTable(
//			name="images_table", // table name
//			joinColumns = @JoinColumn(name="car_number")//key column
//	)
//	@Column(name = "image")
//	private List<String> images;
//	
//	@ElementCollection(fetch = FetchType.EAGER)
//	@CollectionTable(
//			name="sec_papers_table", // table name
//			joinColumns = @JoinColumn(name="car_number")//key column
//	)
//	@Column(name = "security_paper")
//	private List<String> securityPapers;
	
	@JoinColumn(name = "belongs_to", referencedColumnName = "uname", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    User user;
	
	@Column(name = "fuel_type")
	private Fuel fuelType;
	
	public Car(String carNumber, String model, String make, Integer ratePerDay, Integer seats, Integer pincode,
			String city, Float mileage, Transmission type, /*List<String> images, List<String> securityPapers,*/ User user,
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
//		this.images = images;
//		this.securityPapers = securityPapers;
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
//	public List<String> getImages() {
//		return images;
//	}
//	public void setImages(List<String> images) {
//		this.images = images;
//	}
//	public List<String> getSecurityPapers() {
//		return securityPapers;
//	}
//	public void setSecurityPapers(List<String> securityPapers) {
//		this.securityPapers = securityPapers;
//	}

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
				+ type + /*", images=" + images + ", securityPapers=" + securityPapers +*/ ", user=" + user + ", fuelType="
				+ fuelType + "]";
	}
}

