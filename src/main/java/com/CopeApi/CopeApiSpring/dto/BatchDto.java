package com.CopeApi.CopeApiSpring.dto;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.CopeApi.CopeApiSpring.entity.OrderLine;
import jakarta.validation.constraints.NotBlank;

public class BatchDto {

    @NotBlank
    private String type;

    @NotBlank
    private double priceKilo;

    @NotBlank
    private int kilos;

    @Autowired
    private Set<OrderLine> orderLines;

        public BatchDto(String type, double priceKilo, int kilos, Set<OrderLine> orderLines){

            this.type = type;
            this.priceKilo = priceKilo;
            this.kilos = kilos;
            this.orderLines = orderLines;
        }

    public BatchDto(){}
}
