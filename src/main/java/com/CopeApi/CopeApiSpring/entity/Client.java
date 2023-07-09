package com.CopeApi.CopeApiSpring.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "client")
@Getter
@Setter

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "active")
    private boolean active;

    @Column(name = "paymentInfo")
    private String paymentInfo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    @JsonManagedReference
    private Set<Orders> orders;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    @JsonManagedReference
    private Set<Address> addresses;

    
}
