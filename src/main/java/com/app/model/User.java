package com.app.model;

import com.app.util.Roles;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User {
	
	@Id
	@Column(name = "uname")
	private String username;
	
	@Column(name = "pwd")
	private String password;
	
	@Column(name = "contact_number")
	private String mobile;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "role")
	private Roles role;
	
//	@OneToMany(cascade = CascadeType.ALL)
//    private List<Car> cars;
	
//	@OneToMany(cascade = CascadeType.ALL)
//  private List<Booking> cars;
	
	public User(String username, String password, String mobile, String name, String email, Roles role) {
		super();
		this.username = username;
		this.password = password;
		this.mobile = mobile;
		this.name = name;
		this.email = email;
		this.role = role;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Roles getRole() {
		return role;
	}
	public void setRole(Roles role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", mobile=" + mobile + ", name=" + name
				+ ", email=" + email + ", role=" + role + "]";
	}
}
