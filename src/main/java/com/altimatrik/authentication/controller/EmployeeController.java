package com.altimatrik.authentication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.altimatrik.authentication.model.EmployeeDetails;

@RestController
public class EmployeeController {
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ResponseEntity<EmployeeDetails> getEmployeeDetails() {
		
		EmployeeDetails employee = new EmployeeDetails("John", "Product Development", "B2", 100000);
		return new ResponseEntity<EmployeeDetails>(employee, HttpStatus.OK);
	}


}
