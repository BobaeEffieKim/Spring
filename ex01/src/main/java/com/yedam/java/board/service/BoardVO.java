package com.yedam.java.board.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BoardVO {

	private int bno;
	private String title;
	private String contents;
	private String writer;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date regdate;	//최초의 등록일
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedate;	//가장 최근에 수정한 날짜
	private String image;
}
