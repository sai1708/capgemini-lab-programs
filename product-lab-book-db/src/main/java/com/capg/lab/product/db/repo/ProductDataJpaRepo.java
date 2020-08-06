package com.capg.lab.product.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.lab.product.db.model.Product;

public interface ProductDataJpaRepo extends JpaRepository<Product , Integer> {

}
