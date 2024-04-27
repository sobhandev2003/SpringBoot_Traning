package com.sobhan.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sobhan.model.Registration;
import com.sobhan.service.RegistrationService;

public interface RegistrationRepository extends JpaRepository<Registration, String> {
		
		
}
