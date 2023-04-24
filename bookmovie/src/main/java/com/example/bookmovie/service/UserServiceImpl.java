package com.example.bookmovie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.bookmovie.models.Login;
import com.example.bookmovie.models.User;
import com.example.bookmovie.payloadResponse.LoginMessage;
import com.example.bookmovie.repositories.LoginRepository;
import com.example.bookmovie.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private LoginRepository loginRepository;

    public UserServiceImpl(UserRepository userRepository) {
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

    @Override
    public LoginMessage loginUser(Login login) {
        User user1 = userRepository.findByEmailId(login.getEmail());
        if (user1 != null) {
            String password = user1.getPassword();
            boolean isRight = false;
            if (password == login.getPassword())
                isRight = true;
            else
                return new LoginMessage("ERROR PASSWORD MATCH", false);
            if (isRight) {
                loginRepository.save(login);
                return new LoginMessage("LOGIN SUCCESS", true);
            } else {
                return new LoginMessage("LOGIN FAILED", false);
            }
        } else
            return new LoginMessage("USER NOT FOUND", false);
    }

    @Override
    public void logoutUser(User user) {

    }

    @Override
    public boolean deleteUser(Integer userId) {
        userRepository.deleteById(userId);

        if (userRepository.findById(userId) != null) {
            return true;
        }

        return false;
    }

    @Override
    public User getUserByEmailId(String email) {
        User result = userRepository.findByEmailId(email);
        return result;
    }
}
