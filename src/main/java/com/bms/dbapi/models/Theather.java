package com.bms.dbapi.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Theathers")
public class Theather {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String name;
    String address;
    String pincode;
    String state;
    @ManyToOne
    AppUser owner;
}
