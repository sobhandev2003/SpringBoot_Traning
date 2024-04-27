package com.sobhan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sobhan.model.Registration;
import com.sobhan.service.RegistrationService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/register")
public class RegistrationController {

	@Autowired
	private RegistrationService rservice;
	
	@PostMapping("/add")
	public ResponseEntity<String> addData(@RequestBody Registration user){
	String msg="Add succsefully";
	rservice.addData(user);
	return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/fetch/{uname}")
	public ResponseEntity<Registration> fetchData(@PathVariable String uname){
		Registration user =rservice.fetchData(uname);
		return new ResponseEntity<Registration>(user,HttpStatus.OK);
		
	}
	
	@GetMapping("/login/{uname}/{pas}")
	public ResponseEntity<String> userLogin(@PathVariable String uname, @PathVariable String pas) {
		
		String str=rservice.userLogin(uname, pas);
		return new ResponseEntity<String>(str,HttpStatus.OK);
		
	}
	
}
