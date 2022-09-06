package com.yedam.java.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.board.service.BoardService;
import com.yedam.java.board.service.BoardVO;

import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	BoardService service;
	
	//등록-입력폼	-> 등록하는 페이지를 처리하는 방식
	@GetMapping("/insert")
	public String insertForm(Model model) {
		model.addAttribute("no", service.getBoardNo());
		return "board/boardInsert";	
	}
	
	//등록-DB에 실제 입력 
	@PostMapping("/insert")	// 매핑 경로가 같아도 get, post 차이 있으므로 괜찮음
	public String insertBoard(BoardVO boardVO) {
		service.insertBoard(boardVO);
		return "redirect:list";
	}
	
	//전체조회
	@GetMapping("/list")
	public String selectBoardList(Model model) {
		model.addAttribute("boardList", service.getBoardList());
		return "board/boardList";
	}
	
	//단건조회
	@GetMapping("/info")
	public String selectBoardInfo(BoardVO boardVO, Model model) {
		model.addAttribute("board", service.getBoardInfo(boardVO));
		return "board/boardInfo";
	}
	
	//수정 - 폼 
	@GetMapping("/update")
	public String updateForm(BoardVO boardVO, Model model) {
		model.addAttribute("board", service.getBoardInfo(boardVO));
		return "board/boardUpdate";
	}
	
	//수정 - DB update
	@PostMapping("/update")
	public String updateBoardInfo(BoardVO boardVO) {
		service.updateBoard(boardVO);
		return "redirect:list";
	}
	
	
}
