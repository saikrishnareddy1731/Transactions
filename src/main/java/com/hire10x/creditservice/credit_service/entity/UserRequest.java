package com.hire10x.creditservice.credit_service.entity;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
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
import java.util.List;

import com.hire10x.creditservice.credit_service.enums.RequestStatus;
@Entity
@Table(name = "t_user_request")
@NoArgsConstructor

public class UserRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private int companyId;
    private float creditsRequested;
    private float creditsApproved;
    private int approverId;

    @Enumerated(EnumType.STRING)
    private RequestStatus requestStatus;

    private String comments;

    @ElementCollection
    private List<Float> companyCredits;

    private Timestamp createdAt;
    private Timestamp updatedAt;
    private boolean status;

    // Getters and Setters
}
