package com.npci.LoanApplication.Dao;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.npci.LoanApplication.Entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	


	@SuppressWarnings("unchecked")
	Customer save(Customer customer);
	
	@Query("SELECT c FROM Customer c WHERE c.email = :email AND c.password = :password")
	Customer login(@Param("email") String email, @Param("password") String password);
	Optional<Customer> findByEmail(String email);
}
