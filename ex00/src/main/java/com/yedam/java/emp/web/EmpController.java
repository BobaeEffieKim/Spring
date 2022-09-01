package com.yedam.java.emp.web;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.resource.HttpResource;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

@Controller
public class EmpController {
	
	@Autowired
	EmpMapper empMapper;
	
	@GetMapping("/emp")
	public String emp(Model model, EmpVO empVO) {
		EmpVO findVO = empMapper.getEmp(empVO);
		model.addAttribute("emp",findVO);
		
		return "emp";
	}

	//원래 쓰던 방식
	//public String method(HttpRequest res, HttpResponse resp)

}
