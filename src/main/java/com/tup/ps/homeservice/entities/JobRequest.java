package com.tup.ps.homeservice.entities;

import com.tup.ps.homeservice.enums.JobCancelReason;
import com.tup.ps.homeservice.enums.JobRequestStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "job_requests")
public class JobRequest {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private WorkerServices service;

    //TODO does user set the duration of the job? what if worker suggests?
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;

    private WorkerProfile appliedWorkers;

    private String clientNotes;

    private JobRequestStatus status;

    //private Booking booking;

    private JobCancelReason cancelReason;
}
