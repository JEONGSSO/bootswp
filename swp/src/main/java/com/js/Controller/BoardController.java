package com.js.Controller;

import java.util.List;

import com.js.JPA.Jpa;
import com.js.domian.Board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("board/")
public class BoardController {

    @Autowired
    Jpa repository; // jpaRepository JPA

    Board gBoard = new Board();

    @PostMapping("regist")
    public ResponseEntity<Board> regist(@RequestBody Board board) {
        try {
            repository.save(board);
            return new ResponseEntity<>(board, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("list")
    public List<Board> list(Model model) {
        List<Board> board = repository.findByList();
        model.addAttribute("board", board);
        return board;
    }

    // @GetMapping("{bno}")
    // public Board findone(@PathVariable int bno) {
    //     return repository.findOne(bno);
    // }

    // @DeleteMapping("delete/{bno}")
    // public void delete(@PathVariable int bno) {
    //     repository.delete();
    //     System.out.println(bno + " 삭제 되었습니다.");
    // }
}