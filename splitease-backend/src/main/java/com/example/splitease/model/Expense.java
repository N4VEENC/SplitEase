package com.example.splitease.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="expenses")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Expense {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Group group;

    @ManyToOne
    private User paidBy;

    private String description;

    private Double totalAmount;

    @Column(nullable = false)
    private Double ownersShare;


}
