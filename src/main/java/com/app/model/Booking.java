package com.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Bookings")
public class Booking {

	@Id
	@Column(name = "booking_id")
	@GeneratedValue
	private Integer id;
	
	@Column(name = "from_date")
	private Date fromDate;
	
	@Column(name = "to_date")
	private Date toDate;
	
	@JoinColumn(name = "car_booked", referencedColumnName = "car_number", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
	private Car car;
	
	
	@JoinColumn(name = "booked_by", referencedColumnName = "uname", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
	private User user;
	
	public Booking(Integer id, Date fromDate, Date toDate, Car car, User user) {
		super();
		this.id = id;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.car = car;
		this.user = user;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", fromDate=" + fromDate + ", toDate=" + toDate + ", car=" + car + ", user=" + user
				+ "]";
	}
}
