package com.app.lokesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.lokesh.entity.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer> {

}
