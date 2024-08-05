package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.StuEntity;
import com.student.repositroy.StuRepositroy;

@RestController
@RequestMapping("/api/user")
public class StuController {

	@Autowired
	private StuRepositroy userRepository;
	
	@PostMapping
	public StuEntity saveUser(@Validated @RequestBody StuEntity user) {
	    return this.userRepository.save(user);
	}

}
