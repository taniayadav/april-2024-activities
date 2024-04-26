package com.npci.LoanApplication.Service;


import com.npci.LoanApplication.Entity.Customer;
import com.npci.LoanApplication.Exception.BuisnessException;

public interface CustomerService {
	Customer save(Customer customer) throws BuisnessException;
	Customer registerCustomer(Customer registrationDto);
	Customer loginCustomer(String email, String password);

}
