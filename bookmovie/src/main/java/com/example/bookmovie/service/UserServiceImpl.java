package com.example.bookmovie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.bookmovie.models.User;
import com.example.bookmovie.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{


    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Integer userId) {
        Optional<User> result = userRepository.findById(userId);
        return result.get();
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }


    
    
}
