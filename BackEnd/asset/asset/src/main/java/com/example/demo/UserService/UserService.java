package com.example.demo.UserService;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.demo.model.User;
@Service

public interface UserService {
	List <User> getAlluser();
	void saveUser(User user);

	



}
