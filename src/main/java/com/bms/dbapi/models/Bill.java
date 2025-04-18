package com.bms.dbapi.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "bills")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID billId;
    @ManyToOne
    AppUser user;
    @ManyToOne
    Show show;
    int totalTickets;
    String seats;
    int totalAmount;
    LocalDateTime startTime;
    LocalDateTime endTime;
}
