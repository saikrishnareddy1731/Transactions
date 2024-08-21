package com.hire10x.creditservice.credit_service.entity;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_transaction")
@NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "company_id", nullable = false)
    private int companyId;

    private float credits;
    private int purchasedBy;
    private String transactionMethod;
    private String transactionId;
    private String payload;
    private String receipt;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private boolean status;

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCompanyId() {
        return companyId;
    }
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
    public float getCredits() {
        return credits;
    }
    public void setCredits(float credits) {
        this.credits = credits;
    }
    public int getPurchasedBy() {
        return purchasedBy;
    }
    public void setPurchasedBy(int purchasedBy) {
        this.purchasedBy = purchasedBy;
    }
    public String getTransactionMethod() {
        return transactionMethod;
    }
    public void setTransactionMethod(String transactionMethod) {
        this.transactionMethod = transactionMethod;
    }
    public String getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public String getPayload() {
        return payload;
    }
    public void setPayload(String payload) {
        this.payload = payload;
    }
    public String getReceipt() {
        return receipt;
    }
    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }
    public Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
