package com.example.bookmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookmovie.models.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {

}
