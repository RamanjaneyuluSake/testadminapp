package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Testuser;
import com.example.demo.repositories.TestuserRepository;

@Service
public class TestuserServiceImpl{

	@Autowired
	private TestuserRepository testuser;
	
	public void saveuser(Testuser user) {
		testuser.save(user);
	}
	
}
