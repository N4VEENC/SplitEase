package com.example.splitease.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.splitease.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Integer> {
    
}
