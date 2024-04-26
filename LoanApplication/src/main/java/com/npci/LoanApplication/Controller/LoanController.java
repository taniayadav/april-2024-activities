package com.npci.LoanApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.LoanApplication.Entity.Loanapplication;
import com.npci.LoanApplication.ServiceImpl.LoanApplicationServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/customers")
public class LoanController {
	
	@Autowired
	LoanApplicationServiceImpl loan;
	
	@PostMapping("/createLoanApplication")
	Loanapplication createLoanApplication(@RequestBody Loanapplication loanapplication) {
		
		return loan.createLoanApplication(loanapplication);
	}
	
	
}
