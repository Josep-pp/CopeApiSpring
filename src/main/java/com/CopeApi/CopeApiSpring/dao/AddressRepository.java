package com.CopeApi.CopeApiSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CopeApi.CopeApiSpring.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository <Address, Long>{
    
}
