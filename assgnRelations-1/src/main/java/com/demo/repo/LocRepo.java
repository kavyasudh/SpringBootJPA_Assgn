package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.relations.Locations;

public interface LocRepo extends JpaRepository<Locations, Integer>{

}
