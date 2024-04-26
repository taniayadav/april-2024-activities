package com.npci.LoanApplication.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.LoanApplication.Dao.LoanApplicationRepository;
import com.npci.LoanApplication.Entity.Loanapplication;

@Service
public class LoanApplicationServiceImpl {
	
	@Autowired
	private LoanApplicationRepository loan;
	
	public Loanapplication createLoanApplication(Loanapplication loanapplication) {
		
			return loan.save(loanapplication);
		
	 }

}
