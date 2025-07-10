package com.tup.ps.homeservice.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "worker_reviews")
public class WorkerReviews {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    //should this go from 1.0 and upwards or allow lower
    //will probably depend on the front library to select the stars
    private Double rating;

    private User reviewedBy;

    private String description;
}
