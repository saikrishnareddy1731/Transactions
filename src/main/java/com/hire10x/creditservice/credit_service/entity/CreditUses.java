package com.hire10x.creditservice.credit_service.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

import com.hire10x.creditservice.credit_service.enums.CreditSource;
@Entity
@Table(name = "t_credit_uses")
@NoArgsConstructor
public class CreditUses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private int companyId;
    private int cid;
    private boolean isEmailFound;
    private boolean isPhoneFound;
    private float credit;

    @Enumerated(EnumType.STRING)
    private CreditSource source;

    private Timestamp createdAt;
    private Timestamp updatedAt;
    private boolean status;

    // Getters and Setters
}
