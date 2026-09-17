package com.example.splitease.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.splitease.dto.AddExpenseDTO;
import com.example.splitease.model.Expense;
import com.example.splitease.service.ExpenseService;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {
    
    public final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService){
        this.expenseService = expenseService;
    }

    @PostMapping("/add")
    public Expense createNewExpense(@RequestBody AddExpenseDTO addExpenseDTO){
        return expenseService.addExpense(addExpenseDTO);
    }


}
