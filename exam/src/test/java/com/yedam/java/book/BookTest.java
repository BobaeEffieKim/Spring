package com.yedam.java.book;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
public class BookTest {

	@Autowired
	BookService service;
	
	@Test
	public void BookAllProcess() {
		
		//등록
		BookVO info = new BookVO();
		info.setBook_name("테스트-책제목");
		info.setBook_publisher("테스트-출판사");
		info.setBook_info("테스트-책소개");
		
		//전체조회
		List<BookVO> list = service.getBookList();
		assertNotNull(list);
		
	}
}
