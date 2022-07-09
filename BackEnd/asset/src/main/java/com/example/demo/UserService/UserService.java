package com.example.demo.UserService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Asset;
import com.example.demo.model.User;
@Service

public interface UserService {
	List <User> getAlluser();
	void saveUser(User user);

	
	//delete function//
	
		void delet(long id);
		
		Optional<User> findId(long id);

	



}
