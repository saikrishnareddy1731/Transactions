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
@Table(name = "t_company_credit")
@NoArgsConstructor

public class CompanyCredit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int companyId;
    private int transactionId;
    private float credits;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private boolean status;

    // Getters and Setters
}
