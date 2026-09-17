package com.example.splitease.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.splitease.model.PaymentStatus;

@Entity
@Table(name = "split_expense")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SplitExpense {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Expense expense;

    @ManyToOne
    private User user;

    private Double share;

    @ColumnDefault("'DUE'")
    @Enumerated(EnumType.STRING)
    private PaymentStatus status;




}
