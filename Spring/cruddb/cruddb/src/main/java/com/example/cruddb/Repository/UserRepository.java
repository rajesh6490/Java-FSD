package com.example.cruddb.repository;

import com.example.cruddb.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}