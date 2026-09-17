package com.example.splitease.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.splitease.dto.SplitExpenseDTO;
import com.example.splitease.model.SplitExpense;
import com.example.splitease.service.SplitExpenseService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/split")
public class SplitExpenseController {
    
    public final SplitExpenseService splitExpenseService;

    @PostMapping("/new")
    public SplitExpense createNewSplitExpense(@RequestBody SplitExpenseDTO splitExpenseDTO){
        return splitExpenseService.createNewSplitExpense(splitExpenseDTO);
    }

}
