package com.yedam.java.book.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookService service;
	
	//등록 입력 폼
	@GetMapping("/insert")
	public String insertForm(Model model) {
		model.addAttribute("no", service.getBookNo());
		return "book/bookInsert";
	}
	
	//등록 DB
	@PostMapping("/insert")
	public String insertBook(BookVO bookVO) {
		service.insertBook(bookVO);
		return "redirect:list";
	}
	
	//전체조회
	@GetMapping("/list")
	public String selectBookList(Model model) {
		model.addAttribute("bookList", service.getBookList());
		return "book/bookList";
	}
}
