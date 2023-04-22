package com.example.bookmovie.service;

import java.util.List;

import com.example.bookmovie.models.Login;
import com.example.bookmovie.models.User;
import com.example.bookmovie.payloadResponse.LoginMessage;

public interface UserService {
    public List<User> getUsers();

    public User addUser(User user);

    public LoginMessage loginUser(Login login);

    public void logoutUser(User user);

    public User getUserById(Integer userId);
}
