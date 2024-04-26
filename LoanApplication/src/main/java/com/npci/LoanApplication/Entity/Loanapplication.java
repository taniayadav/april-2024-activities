package com.npci.LoanApplication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Loanapplication {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long application_id;

	@OneToOne
	@JoinColumn(name = "customer_id")
	private Customer customer_id;

	@OneToOne
	@JoinColumn(name = "loan_id")
	private Loan loan_id;

	public Loanapplication() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loanapplication(Long id, Customer customer, Loan loan, String status) {
		super();
		this.application_id = id;
		this.customer_id = customer;
		this.loan_id = loan;
		this.status = status;
	}

	public Long getId() {
		return application_id;
	}

	public void setId(Long id) {
		this.application_id = id;
	}

	public Customer getCustomer() {
		return customer_id;
	}

	public void setCustomer(Customer customer) {
		this.customer_id = customer;
	}

	public Loan getLoan() {
		return loan_id;
	}

	public void setLoan(Loan loan) {
		this.loan_id = loan;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private String status;

}
