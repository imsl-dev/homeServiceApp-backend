package com.tup.ps.homeservice.entities;

import com.tup.ps.homeservice.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastName;
    private String email;
    private String password;
    private String address;
    private String district; //barrio
    private String phoneNumber;
    private UserRole role;
    private String imagePath;
    private String createdAt;
    private boolean isActive;

    //private WorkerProfile workerProfile
    //private JobRequests jobRequests;
}
