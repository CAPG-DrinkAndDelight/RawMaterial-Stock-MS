package com.capgemini.drinkanddelight.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.drinkanddelight.main.entity.RawMaterialStock;
@Repository
public interface RawMaterialRepo extends JpaRepository<RawMaterialStock, String> {

}
