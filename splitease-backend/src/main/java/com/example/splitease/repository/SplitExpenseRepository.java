package com.example.splitease.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.splitease.model.SplitExpense;

@Repository
public interface SplitExpenseRepository extends JpaRepository<SplitExpense,Integer> {
    
}
