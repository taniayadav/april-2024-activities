package com.npci.LoanApplication.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.npci.LoanApplication.Entity.Loanapplication;

@Repository
public interface LoanApplicationRepository extends JpaRepository<Loanapplication, Long> {

		@SuppressWarnings("unchecked")
		public Loanapplication save(Loanapplication loan);

}
