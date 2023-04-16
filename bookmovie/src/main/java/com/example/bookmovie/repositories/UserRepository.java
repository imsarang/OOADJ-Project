package com.example.bookmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookmovie.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
