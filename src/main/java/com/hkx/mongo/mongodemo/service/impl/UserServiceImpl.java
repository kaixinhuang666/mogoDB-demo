package com.hkx.mongo.mongodemo.service.impl;

import com.hkx.mongo.mongodemo.domain.User;
import com.hkx.mongo.mongodemo.service.IUserService;
import com.hkx.mongo.mongodemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public void update(User user) {
    userRepository.save(user);
    }

    @Override
    public User get(String id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }
}
