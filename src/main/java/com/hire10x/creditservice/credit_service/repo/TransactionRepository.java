package com.hire10x.creditservice.credit_service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hire10x.creditservice.credit_service.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {}
