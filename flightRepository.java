package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.flightModel;

@Repository
public interface flightRepository extends CrudRepository<flightModel ,Integer>{

}
