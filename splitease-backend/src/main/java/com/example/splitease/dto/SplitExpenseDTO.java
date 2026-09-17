package com.example.splitease.dto;

import com.example.splitease.model.Expense;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SplitExpenseDTO {
    private Integer expenseId;

    private Integer userId;

    private Double share;
}
