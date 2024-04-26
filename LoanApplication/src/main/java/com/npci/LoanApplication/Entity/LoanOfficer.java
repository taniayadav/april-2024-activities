package com.npci.LoanApplication.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class LoanOfficer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long employee_id ;
	private String employee_name;
	private String email_id;
	private String password;
	public LoanOfficer(long employee_id, String employee_name, String email_id, String password) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.email_id = email_id;
		this.password = password;
	}
	public LoanOfficer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(long employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
