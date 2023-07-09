package com.CopeApi.CopeApiSpring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address")
@Getter
@Setter

public class Address {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "number")
    private String number;  

    @Column(name = "name")
    private String name;

    @Column(name = "citty")
    private String citty;

    @Column(name = "postalCode")
    private String postalCode;

    @Column(name = "floor")
    private String floor;

    @Column(name = "doorName")
    private String doorName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
}
