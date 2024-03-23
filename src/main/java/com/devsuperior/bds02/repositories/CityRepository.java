package com.devsuperior.bds02.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds02.entities.City;
import com.devsuperior.bds02.entities.Event;


public interface CityRepository extends JpaRepository<City, Long>{
 }
