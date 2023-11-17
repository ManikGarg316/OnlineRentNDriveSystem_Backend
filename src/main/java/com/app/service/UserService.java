package com.app.service;

import com.app.model.User;

public interface UserService {
	public String addUser(User user);
	public String editUser(User user);
	public String deleteUser(String username);
	public String loginUser(String username, String pwd);
}
