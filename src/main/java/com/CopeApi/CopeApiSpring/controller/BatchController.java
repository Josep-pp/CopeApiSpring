package com.CopeApi.CopeApiSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import com.CopeApi.CopeApiSpring.dto.Message;
import com.CopeApi.CopeApiSpring.entity.Batch;
import com.CopeApi.CopeApiSpring.service.BatchService;

public class BatchController {
    
    @Autowired
    BatchService batchService;

    @GetMapping("/list")
    public ResponseEntity<List<Batch>> List() {

        List<Batch> list = batchService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);

    }    
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") long id) {

        if (!batchService.existsById(id))
            return new ResponseEntity<>(new Message("Batch Not Found"), HttpStatus.NOT_FOUND);
        if (batchService.getOne(id).isPresent()) {
            Batch batch = batchService.getOne(id).get();
            return new ResponseEntity<>(batch, HttpStatus.OK);
        }
        return new ResponseEntity<>(new Message("Batch Not found"), HttpStatus.NOT_FOUND);
    }



}
