package com.npci.LoanApplication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	private long customer_id;
	private String firstname;
	private String secondname;
	private String email;
	private String password;
	private String phone;
	private String pan;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getCustomer_id() {
		return customer_id;
	}
	
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public Customer(long customer_id, String firstname, String secondname, String email, String password, String phone,
			String pan) {
		super();
		this.customer_id = customer_id;
		this.firstname = firstname;
		this.secondname = secondname;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.pan = pan;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	

}
