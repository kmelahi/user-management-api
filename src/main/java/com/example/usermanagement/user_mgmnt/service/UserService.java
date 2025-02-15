package com.example.usermanagement.user_mgmnt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usermanagement.user_mgmnt.entity.Iuser;
import com.example.usermanagement.user_mgmnt.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<Iuser> getAllUser() {
		return userRepository.findAll();
	}
	
	public Optional<Iuser> getUserByUsername(String username){
		return userRepository.findUsername(username);
	}

}
