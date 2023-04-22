package com.example.bookmovie.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.bookmovie.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("FROM users WHERE users.email = ?2")
    User findByEmail(String email);

}
