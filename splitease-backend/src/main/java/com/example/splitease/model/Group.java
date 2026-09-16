package com.example.splitease.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import com.example.splitease.model.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="expensegroups")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer groupId;

    @Column(nullable = false)
    private String groupName;

    @ManyToOne
    private User createdBy;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @JsonIgnore 
    @ManyToMany
    @JoinTable(name="groupmembers",joinColumns = @JoinColumn(name="group_id",referencedColumnName = "groupId"),inverseJoinColumns = @JoinColumn(name="id",referencedColumnName = "id"))
    private List<User> members;
    
}
