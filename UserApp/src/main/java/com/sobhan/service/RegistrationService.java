package com.sobhan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sobhan.model.Registration;
import com.sobhan.repository.RegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
	RegistrationRepository regisrepo;
	
	public void addData(Registration user) {
		regisrepo.save(user);
		
	}
	
	public Registration fetchData(String uname){
		return regisrepo.findById(uname).orElse(null);
	}
	
		public String userLogin(String uname,String pas) {
		Registration user=regisrepo.findById(uname).orElse(null);
		if(pas.equals(user.getPass())) {
			return "Logged in successfull";
		}
		return "Logged in Denied";
		
	}
	
}
