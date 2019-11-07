package com.sheikh.szcompany.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
public class EmployeeController {

	@GetMapping("/employees")
	public ResponseEntity<String> getAllEmployees(){
		return ResponseEntity.ok("Helllo");
		
	}
	
	@GetMapping("/employee/{empId}")
	public ResponseEntity<String> getEmployee(){
		return ResponseEntity.ok("Helllo");
		
	}
}
