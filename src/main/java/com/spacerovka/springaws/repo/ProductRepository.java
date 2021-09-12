package com.spacerovka.springaws.repo;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
public interface ProductRepository extends CrudRepository<Product, String> {

    Optional<Product> findById(String id);
}
