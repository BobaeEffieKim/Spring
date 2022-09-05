package com.yedam.java.user.web;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yedam.java.user.service.UserListVO;
import com.yedam.java.user.service.UserVO;

@Controller
public class UserController {

	@RequestMapping(value="/inputForm")
	//@RequestMapping(value="/inputForm", method={RequestMethod.GET, RequestMethod.POST})
		//△ 강제로 get방식과 post방식으로 받게 설정하는 것 
	public String inputForm() {
		return "inputForm";
	}
	
	/*
	@RequestMapping(value="/users")	
	public String process(UserVO userVO) {
		System.out.println(userVO.getName());
		System.out.println(userVO.getAge());
		return "";
	}
	*/
	
	/*
	//requestParam
	@RequestMapping("/users")
	public String process(@RequestParam String name, @RequestParam int age) {
		System.out.println(name + ", " + age);
		return "";
	}
	*/
	
	//map
	public String process(@RequestParam Map<String, Object> map) {
		System.out.println(map.get("name")+", "+map.get("age"));
		return "";
	}
	
	@RequestMapping("/nameList")
	public String nameProcess(@RequestParam List<String> name) {
		for(String temp : name) {
			System.out.println(temp);
		}
		return "";
	}
	
	@RequestMapping("/userList")
	public String listProcess(UserListVO  userListVO) {
		List<UserVO> userList = userListVO.getList();
		for(UserVO vo : userList) {
			System.out.println(vo.getName() + ", " + vo.getAge());
		}
		return "";
	}
}
