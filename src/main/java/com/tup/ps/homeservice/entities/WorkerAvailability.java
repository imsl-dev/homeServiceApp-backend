package com.tup.ps.homeservice.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "worker_availabilities")
public class WorkerAvailability {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private DayOfWeek dayOfWeek;

    private LocalTime startTime;

    private LocalTime endTime;
}
