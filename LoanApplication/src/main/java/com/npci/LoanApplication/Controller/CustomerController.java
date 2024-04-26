package com.npci.LoanApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.npci.LoanApplication.Entity.Customer;
import com.npci.LoanApplication.Entity.LoginRequest;
import com.npci.LoanApplication.Service.CustomerService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/register")
    public ResponseEntity<?> registerCustomer(@RequestBody Customer registrationDto) {
        Customer customer = customerService.registerCustomer(registrationDto);
		return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginCustomer(@RequestBody LoginRequest loginRequest) {
        try {
            Customer loggedInCustomer = customerService.loginCustomer(loginRequest.getEmail(), loginRequest.getPassword());
            return ResponseEntity.ok(loggedInCustomer);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}

