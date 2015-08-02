package com.it99.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.it99.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {

}
