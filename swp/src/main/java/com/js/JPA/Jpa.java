package com.js.JPA;

import java.util.List;

import com.js.domian.Board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

    public interface Jpa extends JpaRepository<Board, Integer> {

        @Query(value = "select * from board")
        List<Board> findByList();

        List<Board> findByNameAnd (int bno);

    }
