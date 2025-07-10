package com.tup.ps.homeservice.entities;

import com.tup.ps.homeservice.enums.NotificationType;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "notifications")
public class Notifications {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private User user;

    private String title;

    private String description;

    private boolean markedRead;

    private NotificationType type;
}
