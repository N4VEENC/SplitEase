package com.example.splitease.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddExpenseDTO {
    private Integer groupId;
    private Integer userId;
    private String description;
    private Double totalAmount;
    private Double ownersShare;
}
