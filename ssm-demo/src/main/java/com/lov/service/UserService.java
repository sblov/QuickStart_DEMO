package com.lov.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lov.bean.User;
import com.lov.mapper.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public boolean login(String username,String password) {
		
		User user = userDao.findUserByName(username);
		
		if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
			return true;
		}
 		
		return false;
		
	}
	
}
