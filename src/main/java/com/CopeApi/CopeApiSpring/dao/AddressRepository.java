package com.CopeApi.CopeApiSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.CopeApi.CopeApiSpring.entity.Address;

@RepositoryRestResource
public interface AddressRepository extends JpaRepository <Address, Long>{
    
}
