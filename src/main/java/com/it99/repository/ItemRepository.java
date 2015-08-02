package com.it99.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it99.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
