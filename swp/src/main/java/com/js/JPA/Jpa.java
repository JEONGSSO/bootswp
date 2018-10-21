package com.js.JPA;

import com.js.domian.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Jpa extends JpaRepository<User, String> {
    
}