package com.example.catalogueservice.dao;

import com.example.catalogueservice.entities.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface CategoryRepository extends MongoRepository<Category, String> {
}
