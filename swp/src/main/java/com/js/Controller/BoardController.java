package com.js.Controller;

import java.util.List;

import com.js.JPA.Jpa;
import com.js.domian.Board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @Autowired
    Jpa repository; // jpaRepository JPA

    @PostMapping("/regist")
    public String regist(@RequestBody Board board) {
        repository.save(board);
        System.out.println(board.getBno() + " 번 글 작성완료 되었습니다.");
        return "list";
    }

    @RequestMapping("/pagelist")
    public List<Board> list(Model model) {
        List<Board> board = repository.findAll();
        model.addAttribute("board", board);
        return board;
    }

    // @PostMapping("/add")
    // public User addtion(@RequestBody User user) {
    //     User userData = repository.save(user);
    //     System.out.println(user.getId() + " 가입 되었습니다.");
    //     return userData;
    // }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        // repository.delete(id);
        System.out.println(id + " 삭제 되었습니다.");
    }
}