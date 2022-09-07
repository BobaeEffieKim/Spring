package com.yedam.java.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.book.mapper.BookMapper;
import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookMapper mapper;
	
	@Override
	public int getBookNo() {
		BookVO vo = mapper.getBookNo();
		return vo.getBook_no();
	}
	
	@Override
	public List<BookVO> getBookList() {
		return mapper.getBookList();
	}

	@Override
	public BookVO getBookInfo(BookVO bookVO) {
		return mapper.getBookInfo(bookVO);
	}

	@Override
	public int insertBook(BookVO bookVO) {
		return mapper.insertBook(bookVO);
	}

	@Override
	public int updateBook(BookVO bookVO) {
		return mapper.updateBook(bookVO);
	}

	@Override
	public int deleteBook(BookVO bookVO) {
		return mapper.deleteBook(bookVO.getBook_no());
	}

}
