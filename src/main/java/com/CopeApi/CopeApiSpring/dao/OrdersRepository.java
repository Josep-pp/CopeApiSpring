package com.CopeApi.CopeApiSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.CopeApi.CopeApiSpring.entity.Orders;

@RepositoryRestResource
public interface OrdersRepository extends JpaRepository<Orders, Long>{
    
}
