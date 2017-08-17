package com.jun.LoginAndReg.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.jun.LoginAndReg.models.User;
import com.jun.LoginAndReg.repositories.UserRepository;

@Service
public class LoginAndRegService {
	private UserRepository userRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public LoginAndRegService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.userRepository = userRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	
	public void saveUser(User user) {
		System.out.println("service, before encode");
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userRepository.save(user);
		System.out.println("service, after repo.save");
	}
	
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
}
