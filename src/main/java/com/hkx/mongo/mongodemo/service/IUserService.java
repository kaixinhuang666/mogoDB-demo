package com.hkx.mongo.mongodemo.service;

import com.hkx.mongo.mongodemo.domain.User;

import java.util.List;

public interface IUserService {
    void save(User user);
    void delete(String id);
    void update(User user);
    User get(String id);
    List<User> list();

}
