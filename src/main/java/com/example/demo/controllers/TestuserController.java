package com.example.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Testuser;
import com.example.demo.services.TestuserServiceImpl;

@RestController
public class TestuserController {
	
	@Autowired
	private TestuserServiceImpl testuserServiceImpl;
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registerUser(@Valid Testuser user, BindingResult bindingResult) {
		String result;
		if (bindingResult.hasErrors()) {
			result="something went wrong";
			return result;
		} else {
			testuserServiceImpl.saveuser(user);
			result="data svaed successfully!!";
		}
		return result;
	}
	

}
