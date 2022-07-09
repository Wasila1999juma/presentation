package com.example.demo.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.UserRepo.UserRepository;
import com.example.demo.model.User;

@Service

public class UserServiceimplements implements UserService {
	
	@Autowired UserRepository user;

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		this.user.save(user);
		
		
	}

	@Override
	public List<User> getAlluser() {
		// TODO Auto-generated method stub
		return user.findAll();
	}

	

}
