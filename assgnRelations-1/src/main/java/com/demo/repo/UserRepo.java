package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.demo.relations.Users;

public interface UserRepo extends JpaRepository<Users, Integer> {

}
