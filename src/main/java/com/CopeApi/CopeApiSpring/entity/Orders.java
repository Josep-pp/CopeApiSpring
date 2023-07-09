package com.CopeApi.CopeApiSpring.entity;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "orders")
@Getter
@Setter

public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "total")
    private float total;

    @Column(name = "dateDelivery")
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date dateDelivery;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orders")
    @JsonManagedReference
    private Set<OrderLine> orderLines;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

}
