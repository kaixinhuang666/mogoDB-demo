package com.hkx.mongo.mongodemo.repository;

import com.hkx.mongo.mongodemo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
