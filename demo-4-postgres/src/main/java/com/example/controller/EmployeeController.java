package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.repository.Employee;
import com.example.repository.EmployeeRepo;

@RestController
public class EmployeeController {
	
	
	@Autowired
	private EmployeeRepo emp;
	
	
	@PostMapping("/save")
	ResponseEntity<Employee> saveEmployee( @RequestBody Employee p){		
		Employee employee = emp.save(p);	
		return ResponseEntity.ok().body(employee);
		
		
	}
	

}

