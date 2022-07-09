package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.UserRepo.UserRepository;
import com.example.demo.model.User;

@Service

public class UserService {
	
	@Autowired private UserRepository userrepo;
	
	public List<User> login(String username,String password){
		return userrepo.findByUsernameAndPassword(username, password);
	}

}
