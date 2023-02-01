package com.f42o.app.controller;

import java.net.URI;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.f42o.app.model.Customer;
import com.f42o.app.service.ICustomerService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

	@Autowired
	ICustomerService customerService;

	@PostMapping("/new")
	public ResponseEntity<HashMap<String, Object>> save(@RequestBody Customer customer) {
		HashMap<String, Object> response = new HashMap<>();
		Customer newCustomer = customerService.save(customer);
		response.put("data", newCustomer);
		return new ResponseEntity<HashMap<String, Object>>(response, HttpStatus.CREATED);
	}

	@GetMapping("/all2")
	public ResponseEntity<HashMap<String, Object>> getAll2() {

		HashMap<String, Object> response = new HashMap<>();
		response.put("message", "Endpoint is working");
		return ResponseEntity.ok().body(response);
	}

}