package com.example.bookmovie.service;

import java.util.List;

import com.example.bookmovie.models.User;

public interface UserService {
    public List<User> getUsers();
    public User addUser(User user);
    public User getUserById(Integer userId);
}
