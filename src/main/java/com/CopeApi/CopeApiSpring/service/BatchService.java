package com.CopeApi.CopeApiSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.CopeApi.CopeApiSpring.dao.BatchRepository;
import com.CopeApi.CopeApiSpring.entity.Batch;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class BatchService {

    @Autowired
    BatchRepository batchRepository;

    public List<Batch> list() {return batchRepository.findAll(); }

    public Optional<Batch> getOne(long id) { return batchRepository.findById(id);}

    public void save(Batch batch) { batchRepository.save(batch);}

    public void delete(long id) { batchRepository.deleteById(id);}

    public boolean existsById(long id) { return batchRepository.existsById(id);}
    
}
