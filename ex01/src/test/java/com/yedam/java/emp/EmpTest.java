package com.yedam.java.emp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class) 	//beans 호출
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/*-context.xml")
public class EmpTest {

	@Autowired
	EmpMapper empMapper;

	
	public void empListTest() {
		List<EmpVO> findList = empMapper.getEmpList();
		for(EmpVO findVO : findList) {
			System.out.println(findVO.getLastName());
		}
	}
	
	/*
	public void empInfoTest() {
		
		EmpVO info = new EmpVO();
		info.setEmployeeId("100");
		EmpVO findVO = empMapper.getEmp(info);
		assertEquals(findVO.getLastName(), "King");
	}
	*/
	
	@Test
	public void empInfoTest() {
		
		EmpVO info = new EmpVO();
		info.setEmployeeId("100");
		EmpVO findVO = empMapper.getEmp(info);
		assertNotNull(findVO.getEmail());
	}
	
	public void empInsertTest() {
		EmpVO info = new EmpVO();
		info.setFirstName("윤권");
		info.setLastName("신");
		info.setEmail("shin@naver.com");
		info.setJobId("IT_PROG");
		info.setSalary("100000");
		empMapper.insertEmp(info);
		assertEquals(info.getEmployeeId(),"208");
	}

	public void empUpdateSalaryTest() {
		int result = empMapper.updateSalary(100);
		assertEquals(result, 1);
	}
	
	//실습

	public void empUpdateInfoTest() {
		EmpVO info = new EmpVO();
		info.setEmployeeId("208");
		info.setFirstName("자바");
		info.setLastName("홍");
		//info.setEmail("javaKim77@naver.com");
		empMapper.updateInfo(info);
		assertEquals(info.getEmployeeId(), "208");
	}
	
}
