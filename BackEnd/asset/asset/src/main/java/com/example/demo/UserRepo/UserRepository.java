package com.example.demo.UserRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {
	public  List<User> findByUsernameAndPassword(String username,String password);
		
	}


