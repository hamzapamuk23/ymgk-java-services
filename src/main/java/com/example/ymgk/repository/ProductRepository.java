package com.example.ymgk.repository;

import java.util.UUID;

import com.example.ymgk.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product,UUID> 
{}