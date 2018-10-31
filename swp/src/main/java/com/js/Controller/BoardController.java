package com.js.Controller;

import java.util.List;

import com.js.domian.Board;
import com.js.mappers.BoardMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("board")
public class BoardController {

	@Autowired
	private BoardMapper boardMapper;

	@PostMapping("/regist")
	public ResponseEntity<Board> regist(@RequestBody Board board) {
		try {

			return new ResponseEntity<>(board, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/delete/{bno}")
	public ResponseEntity<String> delete(@PathVariable int bno) {
		try {
			boardMapper.remove(bno);
			return new ResponseEntity<>("Delete OK", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@PatchMapping("/update")

	@GetMapping("/list/{bno}")
	public Board list(@PathVariable("bno") int bno) {
		return boardMapper.search(bno);
	}

	// @GetMapping("/list/{bno}") 검색
	// public Board list(@PathVariable("bno") int bno) {
	// return boardMapper.search(bno);
	// }

	// @Autowired
	// Jpa repository; // jpaRepository JPA

	// @GetMapping("{bno}")
	// public Board findone(@PathVariable int bno) {
	// return repository.findOne(bno);
	// }

	// @DeleteMapping("delete/{bno}")
	// public void delete(@PathVariable int bno) {
	// repository.delete();
	// System.out.println(bno + " 삭제 되었습니다.");
	// }
	// // @Autowired
	// // Jpa repository; // jpaRepository JPA

	// @PostMapping("regist")
	// public ResponseEntity<Board> regist(@RequestBody Board board) {
	// try {
	// repository.save(board);
	// return new ResponseEntity<>(board, HttpStatus.OK);
	// } catch (Exception e) {
	// return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	// }
	// }

	// @GetMapping("list")
	// public List<Board> list(Model model) {
	// List<Board> board = repository.findByList();
	// return board;
	// }

	// // @GetMapping("{bno}")
	// // public Board findone(@PathVariable int bno) {
	// // return repository.findOne(bno);
	// // }

	// // @DeleteMapping("delete/{bno}")
	// // public void delete(@PathVariable int bno) {
	// // repository.delete();
	// // System.out.println(bno + " 삭제 되었습니다.");
	// // }
}