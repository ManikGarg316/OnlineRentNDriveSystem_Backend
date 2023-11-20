package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.app.model.User;
import com.app.service.UserService;

import com.app.repo.UserRepository;

public class UserServiceImpl implements UserService{

	@Autowired
	private BCryptPasswordEncoder pwdEncoder;

	@Autowired
	private UserRepository repo;
	
	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String editUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String loginUser(String username, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

}
