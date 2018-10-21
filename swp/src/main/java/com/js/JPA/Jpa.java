package com.js.JPA;

import com.js.domian.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


    public interface Jpa extends JpaRepository<User, String> {

        @Query("delete from user where id =: id")
        User delete(String id);d
    }
