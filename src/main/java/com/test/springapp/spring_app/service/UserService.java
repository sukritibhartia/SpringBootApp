package com.test.springapp.spring_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.springapp.spring_app.entity.User;
import com.test.springapp.spring_app.repo.UserRepository;

@Component
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public User saveUserDetails(User user) {
		User insertedUser = userRepository.save(user);
		return insertedUser;		
	}
}
