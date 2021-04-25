package com.gomaa.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gomaa.warehouse.model.Items;

@Repository
public interface ItemRepository extends JpaRepository<Items, Long> {

}
