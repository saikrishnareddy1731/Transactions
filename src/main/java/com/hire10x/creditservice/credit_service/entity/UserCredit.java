package com.hire10x.creditservice.credit_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;
@Entity
@Table(name = "t_user_credit")
@NoArgsConstructor

public class UserCredit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private int companyId;
    private int requestId;
    private float phoneCredits;
    private float emailCredits;
    private Timestamp expiredAt;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private boolean status;

    // Getters and Setters
}
