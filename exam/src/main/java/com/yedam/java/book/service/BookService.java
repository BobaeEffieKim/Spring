package com.yedam.java.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface BookService {

	//도서 조회
	public int getBookNo();
	
	//전체조회
	public List<BookVO> getBookList();
	
	//단건조회
	public BookVO getBookInfo(BookVO bookVO);
	
	//등록
	public int insertBook(BookVO bookVO);
	
	//수정
	public int updateBook(BookVO bookVO);
	
	//삭제
	public int deleteBook(BookVO bookVO);
}
