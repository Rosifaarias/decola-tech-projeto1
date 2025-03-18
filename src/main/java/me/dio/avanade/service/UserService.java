package me.dio.avanade.service;

import org.springframework.stereotype.Service;

import me.dio.avanade.Model.User;

@Service
public interface UserService {

	
    User findById(Long id);

    User create(User userToCreate);
}