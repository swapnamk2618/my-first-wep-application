package com.dlithe.demo.repository;

import com.dlithe.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {

}
