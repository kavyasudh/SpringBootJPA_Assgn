package com.demo.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.UserResponse;
import com.demo.relations.Users;
import com.demo.repo.UserRepo;

@RestController
public class UserController {
	
	private UserRepo urepo;

	public UserController(UserRepo urepo) {
		
		this.urepo = urepo;
	} 
	
	@GetMapping(path="users", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Users> getAllUsers(){
		List<Users> users=urepo.findAll();
		return users;
	}
	
	@PostMapping(path="selusers", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Users> getSelectedUsers(@RequestBody UserResponse ids) {
		List<Users> users=urepo.findAllById(ids.getUids());
		return users;
	}

	
	

}
