package com.mynotes.spring.cloud.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mynotes.spring.cloud.service.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {

}
