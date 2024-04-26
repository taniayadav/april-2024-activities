package com.npci.LoanApplication.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.npci.LoanApplication.Dao.CustomerRepository;
import com.npci.LoanApplication.Entity.Customer;
import com.npci.LoanApplication.Exception.BuisnessException;
import com.npci.LoanApplication.Service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer save(Customer customer) throws BuisnessException {
		try {
			validateCustomer(customer);
			
			return customerRepository.save(customer);
		} catch (Exception e) {
			throw new BuisnessException("Error occurred while saving customer", e);
		}
	}

	private void validateCustomer(Customer customer) throws Exception {
		if (customer == null || customer.getFirstname().isEmpty() || customer.getSecondname().isEmpty()) {
			throw new Exception("Customer data is invalid");
		}

	}

	@Override
	public Customer registerCustomer(Customer registrationDto) {
		
		
		return customerRepository.save(registrationDto);
	}

	@Override
	public Customer loginCustomer(String email, String password) {
		return customerRepository.login(email,password);
	}

}
