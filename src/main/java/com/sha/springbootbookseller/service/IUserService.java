package com.sha.springbootbookseller.service;

import model.User;

import java.util.Optional;

public interface IUserService {
    public User saveUser(User user);
    public Optional<User> findByUsername(String username);
    public void makeAdmin(String username);

}
