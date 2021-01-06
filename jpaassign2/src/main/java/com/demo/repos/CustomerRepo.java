package com.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Course;
import com.demo.entities.Customer;
import com.demo.entities.Product;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
