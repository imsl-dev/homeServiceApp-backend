package com.tup.ps.homeservice.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "worker_services")
public class WorkerServices {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;
}
