package com.app.model;

import com.app.util.Roles;

public class User {
	public User(String username, String password, String mobile, String name, String email, Roles role) {
		super();
		this.username = username;
		this.password = password;
		this.mobile = mobile;
		this.name = name;
		this.email = email;
		this.role = role;
	}
	private String username;
	private String password;
	private String mobile;
	private String name;
	private String email;
	private Roles role;
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
