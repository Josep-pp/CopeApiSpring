package com.CopeApi.CopeApiSpring.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "batch")
@Getter
@Setter

public class Batch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "priceKilo")
    private double priceKilo;

    @Column(name = "kilos")
    private int kilos;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "batch")
    @JsonManagedReference
    private Set<OrderLine> orderLine;
    
}
