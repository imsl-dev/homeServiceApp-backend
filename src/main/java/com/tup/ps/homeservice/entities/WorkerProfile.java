package com.tup.ps.homeservice.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="worker_profiles")
public class WorkerProfile {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String bio;

    private WorkerReviews reviews;
    private boolean isVerified;
    private String verificationImgPath;
    private LocalDateTime verifiedAt;

    private WorkerServices services;
}
